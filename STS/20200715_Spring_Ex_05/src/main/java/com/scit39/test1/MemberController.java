package com.scit39.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit39.test1.service.MemberService;
import com.scit39.test1.vo.MemberVO;

@Controller
public class MemberController {

	
	@Autowired
	private MemberService memberService;

	@RequestMapping(value="/member/joinForm", method = RequestMethod.GET)
	public String memberJoinForm() {

		System.out.println("회원 가입 폼 이동");

		return "member/joinForm";
	}
	
	@RequestMapping(value="/member/join", method = RequestMethod.POST)
	public String memberJoin(MemberVO member) {
		
		String page = memberService.memberJoin(member);
		
		return page;
	}
	
}
	

