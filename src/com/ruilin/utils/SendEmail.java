package com.ruilin.utils;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;
public class SendEmail{

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	private String from = "1263860493@qq.com";
	private String order="wfnlfxteztgmhjbc";
	public String serch;
	private String host = "smtp.qq.com";

	public String getEcode(String send) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.setProperty("mail.host", host);
		prop.setProperty("mail.transport.protocol", "smtp");
		prop.setProperty("mail.smtp.auth","true");
		StringBuffer vcode = new StringBuffer();
		for (int i = 0; i <6; i++) {
			vcode.append((int)(Math.random()*9));
		}
		serch = vcode.toString();
		try{
			MailSSLSocketFactory sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
			prop.put("mail.smtp.ssl.enable", "true");
			prop.put("mail.smtp.ssl.socketFactory", sf);
			Session session = Session.getDefaultInstance(prop,new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication(){
					return new PasswordAuthentication(from, order);
					
				}
			});
			Transport ts = session.getTransport();
			ts.connect(host,from,order);
			MimeMessage mime = new MimeMessage(session);
			mime.setSubject("瑞麟商城提醒");
			mime.setFrom(new InternetAddress(from));
			mime.setRecipient(Message.RecipientType.TO, new InternetAddress(send));
			String info = "<p>【瑞麟商城】验证码:"+serch+"，切勿转发。瑞麟商城用户正在申请注册服务，如非本人操作，请忽略本短信</p>";
			mime.setContent(info, "text/html;charset=utf-8");
			ts.sendMessage(mime, mime.getAllRecipients());
			ts.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return serch;
		
		
	}
	
}
