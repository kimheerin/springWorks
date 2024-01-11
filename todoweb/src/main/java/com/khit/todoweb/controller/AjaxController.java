package com.khit.todoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khit.todoweb.dto.AjaxDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class AjaxController {	//Ajax 요청 처리 컨트롤러

	@GetMapping("/ex01")
	public String ex01() {
		log.info("GET 요청 처리");
		return "/ajax-ex/main";	//main.jsp
	}
	
	//@ResponseBody - 문자열로 반환 
	@PostMapping("/ex02")
	public @ResponseBody String ex02() {
		log.info("POST 요청 처리");
		return "/ajax-ex/main";	//문자열 /ajax-ex/main
	}
	
	@GetMapping("/ex03")
	public @ResponseBody String ex03(
			@RequestParam("greet") String greet,
			@RequestParam("num") int num) {
		log.info("greet: " + greet);
		log.info("num: " + num);
		return "success";
	}
	//ajaxDTO - object(객체)이므로 json(자바스크립트 데이터)으로 변환 필요
	//jackson-databind 주입 필요
	@PostMapping("/ex04")
	public @ResponseBody AjaxDTO ex04(@ModelAttribute AjaxDTO ajaxDTO) {
		log.info("ajaxDTO= " + ajaxDTO);
		return ajaxDTO;
	}
	
	
}
