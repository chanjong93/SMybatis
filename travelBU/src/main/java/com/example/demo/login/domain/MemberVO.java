package com.example.demo.login.domain;

import java.sql.Date;

public class MemberVO {
	private Integer USER_NO;
	private String USER_ID;
	private String USER_PASS;
	private String USER_NAME;
	private String USER_BIRTH;
	private String USER_SEX;
	private String USER_EMAIL;
	private String USER_PHONE;
	private Date USER_REGISTER;
	private Date USER_UNREGISTER;
	private String USER_GRADE;

	
	public MemberVO(Integer uSER_NO, String uSER_ID, String uSER_PASS, String uSER_NAME, String uSER_BIRTH, String uSER_SEX,
			String uSER_EMAIL, String uSER_PHONE, Date uSER_REGISTER, Date uSER_UNREGISTER, String uSER_GRADE) {
		super();
		USER_NO = uSER_NO;
		USER_ID = uSER_ID;
		USER_PASS = uSER_PASS;
		USER_NAME = uSER_NAME;
		USER_BIRTH = uSER_BIRTH;
		USER_SEX = uSER_SEX;
		USER_EMAIL = uSER_EMAIL;
		USER_PHONE = uSER_PHONE;
		USER_REGISTER = uSER_REGISTER;
		USER_UNREGISTER = uSER_UNREGISTER;
		USER_GRADE = uSER_GRADE;
	}


	public int getUSER_NO() {
		return USER_NO;
	}


	public void setUSER_NO(Integer uSER_NO) {
		USER_NO = uSER_NO;
	}


	public String getUSER_ID() {
		return USER_ID;
	}


	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}


	public String getUSER_PASS() {
		return USER_PASS;
	}


	public void setUSER_PASS(String uSER_PASS) {
		USER_PASS = uSER_PASS;
	}


	public String getUSER_NAME() {
		return USER_NAME;
	}


	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}


	public String getUSER_BIRTH() {
		return USER_BIRTH;
	}


	public void setUSER_BIRTH(String uSER_BIRTH) {
		USER_BIRTH = uSER_BIRTH;
	}


	public String getUSER_SEX() {
		return USER_SEX;
	}


	public void setUSER_SEX(String uSER_SEX) {
		USER_SEX = uSER_SEX;
	}


	public String getUSER_EMAIL() {
		return USER_EMAIL;
	}


	public void setUSER_EMAIL(String uSER_EMAIL) {
		USER_EMAIL = uSER_EMAIL;
	}


	public String getUSER_PHONE() {
		return USER_PHONE;
	}


	public void setUSER_PHONE(String uSER_PHONE) {
		USER_PHONE = uSER_PHONE;
	}


	public Date getUSER_REGISTER() {
		return USER_REGISTER;
	}


	public void setUSER_REGISTER(Date uSER_REGISTER) {
		USER_REGISTER = uSER_REGISTER;
	}


	public Date getUSER_UNREGISTER() {
		return USER_UNREGISTER;
	}


	public void setUSER_UNREGISTER(Date uSER_UNREGISTER) {
		USER_UNREGISTER = uSER_UNREGISTER;
	}


	public String getUSER_GRADE() {
		return USER_GRADE;
	}


	public void setUSER_GRADE(String uSER_GRADE) {
		USER_GRADE = uSER_GRADE;
	}


	@Override
	public String toString() {
		return "MemberVO [USER_NO=" + USER_NO + ", USER_ID=" + USER_ID + ", USER_PASS=" + USER_PASS + ", USER_NAME="
				+ USER_NAME + ", USER_BIRTH=" + USER_BIRTH + ", USER_SEX=" + USER_SEX + ", USER_EMAIL=" + USER_EMAIL
				+ ", USER_PHONE=" + USER_PHONE + ", USER_REGISTER=" + USER_REGISTER + ", USER_UNREGISTER="
				+ USER_UNREGISTER + ", USER_GRADE=" + USER_GRADE + "]";
	}


	


}
