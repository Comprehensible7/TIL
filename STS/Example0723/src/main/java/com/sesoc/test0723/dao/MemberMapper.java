package com.sesoc.test0723.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.sesoc.test0723.vo.MemberVO;

public interface MemberMapper {
	public int memberJoin(MemberVO member);

	public ArrayList<MemberVO> joinList();

	public int memberDelete(String member_id);

	public ArrayList<MemberVO> searchList(HashMap<String, String> map);
}
