package com.scit39.test23.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit39.test23.vo.MemberVo;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSession session;
	
	// 마이바티스를 사용할 수 있게 선언해준다
	// 리턴타입은 별다른 것 없으면 인트 선언
	
	// 입력
	public int memberJoin(MemberVo member) {
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		
		int cnt = 0;
		
		try {
			
			cnt = mapper.memberJoin(member);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return cnt;
	}
	
	// 삭제
	public int deleteMember(String member_id) {
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		
		int cnt = 0;
		
		try {
			
			cnt = mapper.deleteMember(member_id);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return cnt;
	}
	
	// 전체조회
	public ArrayList<MemberVo> memberList(){
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
	
		ArrayList<MemberVo> list = null;
		
		try {
			list = mapper.memberList();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return list;
		
	}
	
	// 조건조회
	public ArrayList<MemberVo> searchMember(HashMap<String,String> map){
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		
		ArrayList<MemberVo> list = null;
		
		try {
			
			list = mapper.searchMember(map);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int memberUpdate(MemberVo member) {
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		
		int cnt = 0;
		
		try {
			cnt = mapper.memberUpdate(member);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	
	
}
