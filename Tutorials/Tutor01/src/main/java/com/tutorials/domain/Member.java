package com.tutorials.domain;

public class Member {
	private String userid;
	private String password;
	private String userName;
	
	
	public Member() {
	}

	public Member(String userid, String password, String userName) {
		this.userid = userid;
		this.password = password;
		this.userName = userName;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Member [userid=" + userid + ", password=" + password + ", userName=" + userName + "]";
	}
	
	
	
}
