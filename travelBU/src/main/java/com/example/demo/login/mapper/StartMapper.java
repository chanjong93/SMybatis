package com.example.demo.login.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.login.domain.MemberVO;


@Repository
public interface StartMapper {	

	
	//로그인하기
	public Integer login(@Param("USER_ID")String USER_ID,@Param("USER_PASS") String USER_PASS);
		
	//회원가입
	public void create(MemberVO vo);
		
	//dbPW 가져오기
	public String bringPW(String USER_ID);
	
	
}
