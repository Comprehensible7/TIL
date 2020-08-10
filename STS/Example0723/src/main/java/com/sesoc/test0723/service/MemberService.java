package com.sesoc.test0723.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesoc.test0723.dao.MemberDAO;
import com.sesoc.test0723.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;

	public String memberJoin(MemberVO member) {
		int cnt = dao.memberJoin(member);

		String page = "";
		if (cnt == 0) {
			page = "redirect:/member/joinFail";
		} else {
			page = "redirect:/";
		}

		return page;
	}

	public ArrayList<MemberVO> joinList() {
		ArrayList<MemberVO> list = dao.joinList();
		return list;
	}

	public int memberDelete(String member_id) {
		int cnt = dao.memberDelete(member_id);
		return cnt;
	}

	public ArrayList<MemberVO> memberSearch(String start_date, String end_date) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("start_date", start_date);
		map.put("end_date", end_date);
		
		ArrayList<MemberVO> list = dao.searchLish(map);
		
		return list;
	}
}