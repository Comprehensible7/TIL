package com.scit.web6.dao;

import java.util.ArrayList;

import com.scit.web6.vo.MemberVO;

public interface MemberMapper {
	
	public int memberJoin(MemberVO member);
	
	public ArrayList<MemberVO> joinList();
	
	public int memberDelete(String member_id);
	
	public MemberVO memberSelectOne(String member_id);

	public int memberUpdate(MemberVO member);
}
