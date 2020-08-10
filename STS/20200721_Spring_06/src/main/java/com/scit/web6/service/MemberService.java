package com.scit.web6.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web6.dao.MemberDAO;
import com.scit.web6.vo.MemberVO;

@Service
public class MemberService {

	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);

	// 서비스는 전달역할, 리턴받아야 할 값이 정해져있다.
	// 비즈니스 로직을 여기서 처리한다. if, for 등등

	@Autowired
	private MemberDAO dao;
	
	@Autowired
	private HttpSession session;

	public String memberJoin(MemberVO member) {
		logger.debug("폼으로부터 전달된 정보 : {}", member.toString());
		int cnt = dao.MemberJoin(member);

		logger.info("가입 성공");
		// 홈화면으로 이동
		// String page = "redirect:/";
		// 절대주소
		String page = "redirect:/member/joinList";

		// 값 등록 실패 시
		if (cnt == 0) {
			logger.info("가입 실패");

			// 컨트롤러의 RequestMapping을 보고 적는것임
			// 절대주소
			page = "redirect:/member/joinFail";
			// 상대주소 사용하기
			// page = redirect : joinFail
		}

		return page;

	}

	// 전체조회
	public ArrayList<MemberVO> joinList() {

		// 리스트의 값은 dao의 joinList 메서드
		// ArrayList<MemberVO> list = dao.joinList();
		// 리턴값은 이미 dao의 joinList에 들어가 있으므로 리턴타입을
		// 아래와 같이 바로 선언해도 가능하다

		return dao.joinList();
	}

	// 삭제
	public int memberDelete(String member_id) {

		int cnt = dao.memberDelete(member_id);

		return cnt;
	}

	// 업데이트
	public String memberUpdate(MemberVO member) {

		logger.debug("업데이트 : {}", member.toString());

		int cnt = dao.memberUpdate(member);

		logger.info("수정 성공");

		String page = "redirect:/member/joinList";

		if (cnt == 0) {
			logger.info("수정 실패");

			page = "redirect:/member/joinFail";
		}

		return page;
	}

	// 조건검색
	public ArrayList<MemberVO> memberSearch(String member_id) {

		logger.info("조건 조회");

		return dao.memberSearch(member_id);
	}
	
	// 로그인
	public String memberLogin(MemberVO member) {
		
		ArrayList<MemberVO> loginCheck = dao.memberSearch(member.getMember_id());
		
		String page = "";
		
		for(int i = 0; i< loginCheck.size(); i++) {
			if(loginCheck.get(i) != null && loginCheck.get(i).getMember_pw().equals(member.getMember_pw())) {
				
				session.setAttribute("loginId", member.getMember_id());
				
				page="redirect:/";
				
			}else {
				page = "redirect:/member/loginForm";
			}
			
		}
		
		
		return page;
	}
	
	// 로그아웃
	public void memberLogout() {
		// session에서 로그인 정보를 삭제하는 기능
		session.removeAttribute("loginId");
	}

	
}
