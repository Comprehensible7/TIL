package com.scit39.test21.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit39.test21.service.MemberService;
import com.scit39.test21.vo.MemberVO;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired
	private MemberService service;

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {

		logger.info("회원 가입 폼 이동");

		return "member/joinForm";
	}
	
	@RequestMapping(value="/join", method = RequestMethod.POST)
	public String join(MemberVO member) {
		
		logger.info("회원 가입 {}", member);

		return service.memberJoin(member);
	}
}
