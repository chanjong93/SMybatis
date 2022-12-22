package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
@MapperScan(value="com.example.demo")

public class TravelzApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelzApplication.class, args);
	}

	
	
}
