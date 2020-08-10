package com.scit39.test21.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.scit39.test21.vo.MemberVO;

public class MemberDAO {

	
	@Autowired
	private SqlSession session;
	
	public int MemberJoin(MemberVO member) {
		
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
}
