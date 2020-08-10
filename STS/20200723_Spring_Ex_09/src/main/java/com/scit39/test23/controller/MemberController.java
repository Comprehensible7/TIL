package com.scit39.test23.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit39.test23.service.MemberService;
import com.scit39.test23.vo.MemberVo;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberService sv;

	// 값을 보내줄 jsp requestmapping을 진행

	// 가입 폼으로
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		
		logger.info("회원 가입 폼 이동");

		return "member/joinForm";
	}

	// 가입 실행
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(MemberVo member) {

		logger.info("회원 가입 {}", member);
		
		return sv.memberJoin(member);
	}
	
	// 가입 성공
	@RequestMapping(value = "/joinComplete", method = RequestMethod.GET)
	public String joinComplete() {
		
		logger.info("회원 가입 성공");
		
		return "member/joinComplete";
	}
	
	// 가입 실패
	@RequestMapping(value = "/joinFail", method = RequestMethod.GET)
	public String joinFail() {
		
		logger.info("회원 가입 실패");
		
		return "member/joinFail";
	}

	// 리스트 폼으로
	@RequestMapping(value = "/listForm", method = RequestMethod.GET)
	public String listForm(Model model) {
		
		model.addAttribute("memberList", sv.memberList());
		
		return "member/listForm";
	}
	
	// 조희 실행
	// HashMap을 사용해서 값을 추가 및 보내줌
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchMember(Model model, String member_min, String member_max) {

		logger.info("회원 조회");
		
		ArrayList<MemberVo> list = sv.searchMember(member_min, member_max);
		
		model.addAttribute("memberList", list);
		
		return "member/listForm";
	}

	// 삭제 실행
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(String member_id) {

		sv.deleteMember(member_id);
		
		logger.info("회원 삭제");
		
		
		return "redirect:/member/listForm";
	}
	
	
	// 업데이트 폼
	@RequestMapping(value="/updateForm", method = RequestMethod.GET)
	public String updateForm(Model model, String member_id) {
		
		logger.info("회원 수정 폼으로 이동");
		
		model.addAttribute("member_id", member_id);
		
		return "member/updateForm";
	}
	
	
	// 업데이트 실행
	@RequestMapping(value="update", method = RequestMethod.POST)
	public String update(MemberVo member) {
		
		logger.info("수정 실행");
		
		return sv.memberUpdate(member);
	}


}
