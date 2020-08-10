package com.scit.web6.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.web6.service.MemberService;
import com.scit.web6.vo.MemberVO;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	private MemberService service;
	

	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		logger.info("회원가입 폼 이동");

		// 지금은 forward형식으로
		return "member/joinForm";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(MemberVO member) {
		logger.info("회원가입{}", member);

		return service.memberJoin(member);
	}

	@RequestMapping(value = "/joinFail", method = RequestMethod.GET)
	public String joinFail() {
		return "member/joinFail";
	}

	@RequestMapping(value = "/joinList", method = RequestMethod.GET)
	public String joinList(Model model, HttpSession session) {
		// ArrayList<MemberVO> list = service.joinList();
		
		// 로그인 처리를 체크
		// 로그아웃 후에 주소복붙해도 못보도록 처리
		// 오브젝트로 저장되기때문에 String으로 형변환
		// Controller에서 처리해줘야 service쪽에서 문제가 안생김
		String loginId = (String)session.getAttribute("loginId");
		
		// 리턴될 값
		String page = "";
		
		if(loginId != null) {
			
			model.addAttribute("memberList", service.joinList());
			page = "member/joinList";
			
		}else {
			page = "redirect:/member/loginForm";
		}
		
		

		// 정보를 뿌려줘야하는 데이터를 뿌려야하는데 redirect로 하면 데이터가 갱신되니까...!
		// forward로 꽂아줘야 함.
		return "member/joinList";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String memberDelete(String member_id) {
		service.memberDelete(member_id);

		return "redirect:/member/joinList";
	}

	@RequestMapping(value = "/selectOne", method = RequestMethod.GET)
	public String memberSelectOne(Model model, String member_id) {
		MemberVO member = service.memberSelectOne(member_id);
		model.addAttribute("member", member);

		return "member/memberInfo";
	}

	@RequestMapping(value = "/memberUpdateForm", method = RequestMethod.GET)
	public String memberUpdateForm(Model model, String member_id) {
		MemberVO member = service.memberSelectOne(member_id);
		model.addAttribute("member", member);

		return "member/memberUpdateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String memberUpdate(MemberVO member) {
		service.memberUpdate(member);

		return "redirect:/member/joinList";
	}

	// 로그인 폼으로 이동
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String memberLoginForm() {

		return "member/memberLoginForm";

	}

	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String memberLogin(MemberVO member) {

		String page = service.memberLogin(member);
		
		return page;
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String memberLogout() {
		service.memberLogout();
		return "redirect:/";
	}
	
}