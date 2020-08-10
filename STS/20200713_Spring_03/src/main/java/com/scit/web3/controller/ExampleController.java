package com.scit.web3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// 이 컨트롤러에서 요청하는 모든것은 /ex가 붙음
@RequestMapping(value = "/ex")
public class ExampleController {

	// return을 다른 jsp로 해주기 위함
	// 모델객체 옆 String부분은 아래의 값이 원문이다
	// @RequestParam(value = "name") (얘는 값이 숨어있음)
	@RequestMapping(value = "/example1", method = RequestMethod.GET)
	public String example1(Model model,String name) {

		System.out.println("예제 1번 요청");
		System.out.println(name);

		model.addAttribute("gisu2", 40);

		return "example/example1";
	}

	@RequestMapping(value = "/example2", method = RequestMethod.GET)
	public String example2(Model model) {

		System.out.println("예제 1번 요청");

		model.addAttribute("gisu2", 40);

		return "example/example1";
	}

	@RequestMapping(value = "/example3", method = RequestMethod.GET)
	public String example3(Model model) {

		System.out.println("예제 1번 요청");

		model.addAttribute("gisu2", 40);

		return "example/example1";
	}

}
