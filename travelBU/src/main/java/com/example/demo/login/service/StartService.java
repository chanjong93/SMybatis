package com.example.demo.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.login.domain.MemberDTO;
import com.example.demo.login.domain.MemberVO;
import com.example.demo.login.mapper.StartMapper;

@Service
public class StartService {
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}
	
	@Autowired
	StartMapper startmapper;
	//로그인
	public Integer login(String USER_ID, String USER_PASS) {
		int cnt = startmapper.login(USER_ID, USER_PASS);
		return cnt;
	}
	
	//회원가입
	public void create(MemberVO vo) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		vo.setUSER_PASS(encoder.encode(vo.getUSER_PASS()));
		startmapper.create(vo);

	}
	
	//암호화 pw 가져오기
	public String bringPW(String USER_ID) {	
		String dbPW =startmapper.bringPW(USER_ID);
		return dbPW;
	}
	


}
