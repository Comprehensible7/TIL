package com.scit39.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit39.test.service.MemberService;
import com.scit39.test.vo.MemberVO;

@Controller
public class MemberController {

	// 빈으로 등록되어있으면 디펜던시 인젝션(의존성)을 받는다
	@Autowired
	private MemberService memberService;

	// Server쪽 web path설정 시 /로 맞춰주면 value값이나 href연결해줄때
	// /가 있어도 그만 없어도 그만이다.
	@RequestMapping(value = "/member/joinForm", method = RequestMethod.GET)
	public String memberJoinForm() {

		System.out.println("회원 가입 폼 이동");

		return "member/joinForm";
	}

	@RequestMapping(value = "/member/join", method = RequestMethod.POST)
	public String memberJoin(MemberVO member) {

		// Service쪽에서 page를 초기화해주고 값을 넘겨준다
		String page = memberService.memberJoin(member);
		
		return page;
	}

}
