package com.example.demo.notice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.notice.domain.NoticeVO;
import com.example.demo.notice.service.NoticeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/notice/*")
public class NoticeController {

	@Autowired
	private NoticeService noticeservice;
	
	
	@GetMapping("/list")
	public String home(NoticeVO vo, Model md) {
		log.info("메인화면페이지");
		//log.info("vo값:" + vo);
		md.addAttribute("list", noticeservice.list());
		return "/notice/table";
	}
	
	@GetMapping("/testlist")
	public String testlist(NoticeVO vo, Model md) {
		log.info("테스트리스트페이지");
		md.addAttribute("list", noticeservice.list());
		return "/notice/zzzzz";
		
		
	}
	
	
	
	@GetMapping("/register")
	public String notice() {
		log.info("글쓰기 기본페이지");
		
		return "/notice/Register";
	}
	
	
	  @PostMapping("/register") 
	  public String notice(NoticeVO vo) {
	  log.info("공지 등록 기능"); 
	  noticeservice.noticeRegister(vo); 
	  log.info("공지 등록 완료");
	  return "redirect:/notice/list"; 
	  }
	 
	  @GetMapping({"/detail","/modify"})
	  public void detail(@RequestParam("NT_NO") Integer NT_NO, Model md ) {
		  log.info("상세페에지 열기or수정하기");
		  md.addAttribute("details", noticeservice.details(NT_NO));
		  
	  }
	
	  @PostMapping("/modify")
	  public String modify(NoticeVO vo) {
		  log.info("수정기능 구현");
		  noticeservice.modify(vo);
		  log.info("글 수정 완료");
		  return "redirect:/notice/list";
	  }
	  
	  @PostMapping("/delete")
	  public String delete(@RequestParam("NT_NO") Integer NT_NO, NoticeVO vo) {
		  log.info("delete.........."+NT_NO);
		  noticeservice.delete(NT_NO);
		  log.info("삭제 기능 완료");
		  noticeservice.deletebackup(vo);
		  log.info("삭제 데이터 백업 성공");
		  return "redirect:/notice/list";
	  }
	  

	  
	  
	  //조회수 관련 이슈
	  //ModelAndView("detail","hits", service.!@#!A();
	  //"detail" jsp파일
	  //"hits"는 service.!@#$를 hits라는 이름으로 데이터를 담아줌
	  
}

//return "redirect:/account/login"; 
