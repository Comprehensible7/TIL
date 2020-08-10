package com.scit.web6.controller;

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
// 넘어오는 요청값은 모두 value값이 붙는다
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired
	private MemberService service;

	// 홈 컨트롤러에서 복붙해서 사용하지만 컨트롤러 값만 변경해주면 된다.
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	// home.jsp의 요청을 받아 줄 메서드를 생성
	// forward방식으로 사용
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {

		logger.info("회원 가입 폼 이동");

		return "member/joinForm";
	}

	// 가입
	// redirect시 requestmapping의 value값을 찾는다
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(MemberVO member) {

		logger.info("회원 가입 {}", member);

//		String page = service.memberJoin(member);

		return service.memberJoin(member);
	}

	// MemberService의 joinFail을 실행시켜주기 위한 Method 선언
	@RequestMapping(value = "/joinFail", method = RequestMethod.GET)
	public String joinFail() {

		logger.info("회원 가입 실패");

		// 여기선 forward방식으로 전달
		return "member/joinFail";
	}

	// MemberService의 joinComplete을 실행시켜주기 위한 Method 선언
	@RequestMapping(value = "/joinComplete", method = RequestMethod.GET)
	public String joinComplete() {

		logger.info("회원 가입 성공");

		// 여기선 forward방식으로 전달
		return "member/joinComplete";
	}

	// 전체조회
	@RequestMapping(value = "/joinList", method = RequestMethod.GET)
	public String joinList(Model model) {

		// 메서드 실행
		// ArrayList<MemberVO> list = service.joinList();

		// 받아온 값을 jsp로 보내주기위한 model객체 사용
		// 앞쪽은 jsp에서 사용 할 이름, 뒤쪽은 값
		model.addAttribute("memberList", service.joinList());

		// forward방식으로 값을 넘겨준다 (이 방식은 데이터가 유지됨)
		// redirect로는 넘겨줄 수 없다 (이 방식은 데이터가 사라짐)
		return "member/joinList";
	}

	// 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	// 쿼리스트링에서 지정해준 변수명을 전달받아야함
	public String memberDelete(String member_id) {

		service.memberDelete(member_id);

		return "redirect:/member/joinList";
	}

	// 수정폼으로 이동
	@RequestMapping(value = "/updateForm", method = RequestMethod.GET)
	public String updateForm(Model model, String member_id, String member_pw, String member_nm, String member_indate) {

		logger.info("회원 수정 폼으로 이동");

		// 값을 jsp로 넘겨줌 (readonly처리)
		model.addAttribute("member_id", member_id);
		model.addAttribute("member_pw", member_pw);
		model.addAttribute("member_nm", member_nm);
		model.addAttribute("member_indate", member_indate);

		return "member/updateForm";
	}

	// 수정
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(MemberVO member) {

		// String page = service.memberUpdate(member);
		logger.info("회원 수정", member);

		service.memberUpdate(member);
		
		return "redirect:/member/joinList";
	}
	
	
	// 조회폼으로 이동
	@RequestMapping(value = "/searchForm", method = RequestMethod.GET)
	public String searchForm() {

		logger.info("조회폼으로 이동");

		return "member/searchForm";
	}

	// 조건검색
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(String member_id, Model model) {

		logger.info("검색");

		model.addAttribute("memberList", service.memberSearch(member_id));

		return "member/joinList";
	}
	
	// 로그인 폼으로 이동
	@RequestMapping(value="/loginForm", method = RequestMethod.GET)
	public String memberLoginForm() {
		
		return "member/memberLoginForm";
		
	}
	
	// 로그인
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String memberLogin(MemberVO member) {
		
//		String page = service.memberLogin(member);
		
		return service.memberLogin(member);
		
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String memberLogout() {
		
		service.memberLogout();
		
		return "redirect:/";
	}
}
