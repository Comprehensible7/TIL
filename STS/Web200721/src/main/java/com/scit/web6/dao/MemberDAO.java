package com.scit.web6.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.web6.vo.MemberVO;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSession session;
	
	public int memberJoin(MemberVO member) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.memberJoin(member);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	public ArrayList<MemberVO> joinList(){
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		ArrayList<MemberVO> list = null;
		
		try {
			list = mapper.joinList();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public int memberDelete(String member_id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.memberDelete(member_id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}


	public MemberVO memberSelectOne(String member_id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		MemberVO member = null;
		
		try {
			member = mapper.memberSelectOne(member_id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return member;
	}
	
	public int memberUpdate(MemberVO member) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.memberUpdate(member);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
}
