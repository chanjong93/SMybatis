package com.example.demo.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.login.domain.MemberVO;
import com.example.demo.login.service.StartService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/account/*")
public class TravelController {
	
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	private StartService startservice;
	


	

	@GetMapping("/signin")
	public String login() {
		log.info("로그인페이지 열기");
		return "/account/SignIn";
	}
	
	
	@PostMapping("/signin")
	public String login(MemberVO vo, Model md, HttpSession session) {
		
		String dbPW = startservice.bringPW(vo.getUSER_ID()); //db에 저장된 암호화 PW
		String PW = vo.getUSER_PASS(); //클라이언트가 입력한 PW
		log.info("ddd"+dbPW);
		log.info(PW);
		
		
		int cnt = 0;
		if(passwordEncoder.matches(PW, dbPW)) {
			log.info("dbPW&PW일치 확인");
			cnt =1 ;
			
		}else {
			log.info(dbPW + PW +"="+"dbPW&PW 불일치");
			cnt = 0;
		}
		
	
		if(cnt==1) {
		log.info("vo값:"+vo);
		log.info("로그인성공");
			return"redirect:/main"; //redirect 하면 @RequestMapping에서 account를 타고 @getMapping에서 home을 타서 결과론적으로 account/Home이 열림
		}else {
			
			return"/account/SignIn";
		}
}
	
	
	//회원가입 페이지
	@GetMapping("/signup")
	public String create() {
		log.info("회원가입 페에지열기");
		return "/account/SignUp";
	}
	
	
	//회원가입 
	@PostMapping("/signup")
	public String create(MemberVO vo) {
		
		startservice.create(vo);
		log.info("회원가입완료");
		return "redirect:/account/signin";
	}

	

	
	//@validated는 실무에서 컨트롤러를 @ModelAttribute 모델에 바인딩하는데 사용합니다. 
	
}