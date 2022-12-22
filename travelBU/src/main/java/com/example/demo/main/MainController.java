package com.example.demo.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MainController {

	@RequestMapping("/main")
	public String main() {
		log.info("컨트롤러 타냐?");
		
		return "/main/index";
	}
}
