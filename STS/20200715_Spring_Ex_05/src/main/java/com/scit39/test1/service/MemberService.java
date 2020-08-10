package com.scit39.test1.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.scit39.test1.vo.MemberVO;

@Service
public class MemberService {
	
	public ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	
	public String memberJoin(MemberVO member) {
		
		list.add(member);
		
		int cnt = 1;
		
		for(MemberVO v : list) {
			System.out.println(v);
		}
		
		String page = "";
		
		if(cnt == 0) {
			page ="/member/joinFail";
		}else {
			page ="/member/joinComplete";
		}
		
		return page;
	}

}
