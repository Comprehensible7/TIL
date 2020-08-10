package com.sesoc.test0723.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sesoc.test0723.vo.MemberVO;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSession session;
	
	public int memberJoin(MemberVO member) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {cnt = mapper.memberJoin(member);}
		catch (Exception e) {e.printStackTrace();}
		
		return cnt;
	}
	
	
	public ArrayList<MemberVO> joinList(){
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		ArrayList<MemberVO> list = null;
		
		try {list = mapper.joinList();}
		catch (Exception e) {e.printStackTrace();}
		
		return list;
	}
	
	public int memberDelete(String member_id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {cnt = mapper.memberDelete(member_id);}
		catch (Exception e) {e.printStackTrace();}
		
		return cnt;
	}


	public ArrayList<MemberVO> searchLish(HashMap<String, String> map) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		ArrayList<MemberVO> list = null;
		
		try {list = mapper.searchList(map);}
		catch (Exception e) {e.printStackTrace();}
		
		return list;
	}
}