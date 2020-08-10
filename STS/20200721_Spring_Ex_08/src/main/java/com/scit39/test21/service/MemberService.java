package com.scit39.test21.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit39.test21.dao.MemberDAO;
import com.scit39.test21.vo.MemberVO;



@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);

	public String memberJoin(MemberVO member) {
		
		logger.debug("폼으로부터 전달된 정보 : {}", member.toString());
		
		int cnt = dao.MemberJoin(member);
		
		logger.info("가입 성공");
		String page = "member/joinComplete";
		
		if(cnt == 0) {
			logger.info("가입 실패");
			
			page = "member/joinFail";
		}
		
		return page;
	}
}
