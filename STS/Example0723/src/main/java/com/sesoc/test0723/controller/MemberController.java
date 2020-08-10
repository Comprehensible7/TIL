package com.sesoc.test0723.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesoc.test0723.service.MemberService;
import com.sesoc.test0723.vo.MemberVO;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberService service;

	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		logger.info("회원 가입 폼 이동");

		return "member/joinForm";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(MemberVO member) {
		logger.info("회원 가입 {}", member);

		String page = service.memberJoin(member);

		return page;
	}

	@RequestMapping(value = "/joinFail", method = RequestMethod.GET)
	public String joinFail() {
		return "member/joinFail";
	}

	@RequestMapping(value = "/joinList", method = RequestMethod.GET)
	public String joinList(Model model) {
		ArrayList<MemberVO> list = service.joinList();

		model.addAttribute("memberList", list);
		
		return "member/joinList";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String memberDelete(String member_id) {
		service.memberDelete(member_id);

		return "redirect:/member/joinList";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String memberSearch(Model model, String start_date, String end_date) {
		ArrayList<MemberVO> list = service.memberSearch(start_date, end_date);
		
		model.addAttribute("memberList", list);

		return "member/joinList";
	}
}