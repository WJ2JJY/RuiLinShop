package com.ruilin.pojo;

public class Users {
	private int id;   //用户编号	
	private String account;   //用户账号
	private String upwd;   //用户登录密码
	private String user_name; //用户姓名
	private String sex; //用户性别
	private String birth; //用户生日
	private String email; // 用户邮箱
	private String usertype;//用户类型
	private String phone; //用户电话号码
	private String rgtime; // 用户注册时间
	private int addressid; //用户默认收货地址编号
	private String head_portrait; //用户头像
	public Users(int id, String account, String upwd, String user_name, String sex, String birth, String email,
			String usertype, String phone, String rgtime, int addressid, String head_portrait) {
		super();
		this.id = id;
		this.account = account;
		this.upwd = upwd;
		this.user_name = user_name;
		this.sex = sex;
		this.birth = birth;
		this.email = email;
		this.usertype = usertype;
		this.phone = phone;
		this.rgtime = rgtime;
		this.addressid = addressid;
		this.head_portrait = head_portrait;
	}
	public Users() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRgtime() {
		return rgtime;
	}
	public void setRgtime(String rgtime) {
		this.rgtime = rgtime;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setShopaddress(int addressid) {
		this.addressid = addressid;
	}
	public String getHead_portrait() {
		return head_portrait;
	}
	public void setHead_portrait(String head_portrait) {
		this.head_portrait = head_portrait;
	}
	
}
