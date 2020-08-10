package com.scit39.test23.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit39.test23.dao.MemberDAO;
import com.scit39.test23.vo.MemberVo;

//비즈니스 로직 실행

@Service
public class MemberService {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);

	
	@Autowired
	private MemberDAO dao;
	
	// 가입 실행
	public String memberJoin(MemberVo member) {
		
		int cnt = dao.memberJoin(member);
		
		logger.info("가입 성공");
		
		String page = "redirect:/member/joinComplete";
		
		if(cnt == 0) {
			logger.info("가입 실패");
			
			page = "redirect:/member/joinFail";
		}
		
		return page;
	}
	
	// 전체조회
	public ArrayList<MemberVo> memberList(){
		
		return dao.memberList();
	}
	
	// 삭제
	public int deleteMember(String member_id) {
		
		int cnt = dao.deleteMember(member_id);
		
		return cnt;
	}
	
	// 조건 조회
	public ArrayList<MemberVo> searchMember(String member_min, String member_max){
		
		logger.info("조건 조회");
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("member_min", member_min);
		map.put("member_max", member_max);
		
		ArrayList<MemberVo> list = dao.searchMember(map);
		
		
		return list;
	}
	
	public String memberUpdate(MemberVo member) {
		
		int cnt = dao.memberUpdate(member);
		
		String page = "redirect:/member/joinComplete";
		logger.info("수정 성공");
		
		if(cnt == 0) {
			logger.info("수정 실패");
		
			page = "redirect:/member/joinFail";
		}
		
		return page;
	}
	

}
