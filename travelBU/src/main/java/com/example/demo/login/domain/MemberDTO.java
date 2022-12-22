package com.example.demo.login.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {

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

}
