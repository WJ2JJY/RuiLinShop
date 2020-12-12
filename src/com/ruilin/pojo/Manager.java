package com.ruilin.pojo;

public class Manager {
	private int managerid; //后台管理员编号
	private String account;//管理员账号
	private String mpwd; //管理员密码
	private String mname;//管理员姓名
	private String sex;//管理员性别
	public Manager(int managerid, String account, String mpwd, String mname, String sex) {
		super();
		this.managerid = managerid;
		this.account = account;
		this.mpwd = mpwd;
		this.mname = mname;
		this.sex = sex;
	}
	public Manager() {
		super();
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getMpwd() {
		return mpwd;
	}
	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
