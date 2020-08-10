package com.scit39.test16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit39.test16.service.MemberService;
import com.scit39.test16.vo.MemberVo;

@Controller
public class MemberController {

	// AutoWired를 사용, 클래스 객체화 진행
	@Autowired
	private MemberService memberService;

	// value = 요청주소
	@RequestMapping(value = "/member/joinForm", method = RequestMethod.GET)
	public String memberJoinForm() {

		System.out.println("회원 가입 폼 이동");

		// 폴더주소 -> 파일을 찾아감
		return "member/joinForm";
	}

	@RequestMapping(value = "/member/join", method = RequestMethod.POST)
	public String memberJoin(MemberVo member) {

		// return page;
		return memberService.memberJoin(member);
	}

	@RequestMapping(value = "/member/listForm", method = RequestMethod.GET)
	public String memberList(Model model) {

		// JSP로 바로 내용을 보내버림
		model.addAttribute("list", memberService.showList());

		return "member/listForm";
	}

}
