package com.scit39.test23.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit39.test23.vo.MemberVo;

public interface MemberMapper {
	
	// 보내줄 실행 메서드 작성
	
	// 가입
	public int memberJoin(MemberVo member);
	
	// 삭제
	public int deleteMember(String member_id);
	
	// 리스트 전체출력
	public ArrayList<MemberVo> memberList();
	
	// 리스트 조건출력
	public ArrayList<MemberVo> searchMember(HashMap<String,String> map);
	
	// 업데이트
	public int memberUpdate(MemberVo member);
	

}
