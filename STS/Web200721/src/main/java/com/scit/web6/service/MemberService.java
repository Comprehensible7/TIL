package com.scit.web6.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web6.dao.MemberDAO;
import com.scit.web6.vo.MemberVO;

@Service
public class MemberService {
	@Autowired
	private MemberDAO dao;
	
	@Autowired
	private HttpSession session;

	// 입력
	public String memberJoin(MemberVO member) {
		int cnt = dao.memberJoin(member);
		String page = "redirect:/";

		if (cnt == 0)
			page = "redirect:/member/joinFail/";

		return page;
	}

	// 전체조회
	public ArrayList<MemberVO> joinList() {
		
		// 로그인 처리를 체크
		
		return dao.joinList();
	}

	// 삭제
	public int memberDelete(String member_id) {
		int cnt = dao.memberDelete(member_id);

		return cnt;
	}

	// 조건수정선택
	public MemberVO memberSelectOne(String member_id) {
		return dao.memberSelectOne(member_id);
	}

	// 수정
	public int memberUpdate(MemberVO member) {
		return dao.memberUpdate(member);
	}

	// 로그인
	public String memberLogin(MemberVO member) {
		
		// member에서 id정보를 가져온다
		// 조건처리를 위한 조회
		MemberVO loginCheck = dao.memberSelectOne(member.getMember_id());

		// 로그인 성공 여부에 따라서 리턴될 값
		String page = "";
		
		// 사용자는 id를 입력했는데 loginCheck객체가 null인경우가 발생할 수 있다.
		System.out.println(loginCheck);
		// 비밀번호 검증
		// db에서 가져온 비밀번호와 vo에서 가져온 비밀번호를 비교
		if(loginCheck != null && loginCheck.getMember_pw().equals(member.getMember_pw())) {
			// 로그인 성공
			// SessionScope가 필요한 상황 -> HttpSession객체가 SessionScope.
			session.setAttribute("loginId", member.getMember_id());
			// 메인페이지로 redirect를 해야한다.
			page = "redirect:/";
			
		} else {
			// 로그인 실패
			page = "redirect:/member/loginForm";
		}
		System.out.println("page:" + page);
		return page;
	}
	
	// 로그아웃
	public void memberLogout() {
		// session에서 로그인 정보를 삭제하는 기능
		session.removeAttribute("loginId");
		
	}
}
