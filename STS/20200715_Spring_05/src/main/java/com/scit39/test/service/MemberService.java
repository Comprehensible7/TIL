package com.scit39.test.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.scit39.test.vo.MemberVO;

// 서비스의 역할을 수행 할 수 있도록 어노테이션을 붙여준다

// 서비스는 세분화된 비즈니스 로직을 처리하는 객체 (if문 for문 등등...)

@Service
public class MemberService {

	// DB의 역활을 잠시동안 대신해줄 list
	public ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	
	// 서비스쪽은 VO가 매게변수로 들어간다
	// 횟수를 체크하기위한 인트값
	public String memberJoin(MemberVO member) {
		
		
		// DAO에 member를 전달하는 문장으로 바뀔예정
		list.add(member);
		
		// DB로부터 돌려받은 값이라고 가정
		int cnt = 1;
	
		// 리스트 출력
		for(MemberVO v : list) {
			System.out.println(v);
		}
		
		// page값 초기화
		String page = "";
		
		// 값이 있고 없을경우
		if(cnt==0) {
			page ="/member/joinFail";
		}else {
			page ="/member/joinComplete";
		}
		
		
		return page;
	}
	
}
