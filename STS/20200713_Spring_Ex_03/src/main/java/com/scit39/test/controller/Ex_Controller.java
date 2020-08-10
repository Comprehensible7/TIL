package com.scit39.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping(value = "/ex")
public class Ex_Controller {
	
	
	@RequestMapping(value = "/example1", method = RequestMethod.GET)
	public String example1(Model model, String name) {
		
		System.out.println("예제 1번 요청");
		System.out.println(name);
		
		model.addAttribute("level2", 100);
		
		return "example/example1";
	}
	
	@RequestMapping(value = "/example2", method = RequestMethod.GET)
	public String example2(Model model, String phone) {
		
		System.out.println("예제 1번 요청");
		System.out.println(phone);
		
		model.addAttribute("level2", 99);
		
		
		return "example/example1";
	}
	
	@RequestMapping(value = "/example3", method = RequestMethod.GET)
	public String example3(Model model, int age) {
		
		System.out.println("예제 1번 요청");
		System.out.println(age);
		
		model.addAttribute("level2", 98);
		
		return "example/example1";
	}
}
