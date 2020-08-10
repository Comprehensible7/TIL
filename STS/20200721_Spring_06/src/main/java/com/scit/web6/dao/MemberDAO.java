package com.scit.web6.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.web6.vo.MemberVO;

@Repository
// 위의 어노테이션은 예외처리 다해줌
public class MemberDAO {

	// 여기서는 마이바티스때처럼 인터페이스를 클래스화 해주는 부분이다.

	@Autowired
	private SqlSession session;

	// 값 입력
	public int MemberJoin(MemberVO member) {

		// 인터페이스의 이름
		MemberMapper mapper = session.getMapper(MemberMapper.class);

		int cnt = 0;

		try {
			// 인터페이스 메서드
			cnt = mapper.memberJoin(member);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return cnt;
	}

	// 전체조회
	public ArrayList<MemberVO> joinList() {

		MemberMapper mapper = session.getMapper(MemberMapper.class);

		// 리스트 초기화
		ArrayList<MemberVO> list = null;

		try {
			list = mapper.joinList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	// 삭제
	public int memberDelete(String member_id) {

		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;

		try {
			cnt = mapper.memberDelete(member_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return cnt;
	}

	// 업데이트
	public int memberUpdate(MemberVO member) {

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

	// 조건검색
	public ArrayList<MemberVO> memberSearch(String member_id) {

		MemberMapper mapper = session.getMapper(MemberMapper.class);

		ArrayList<MemberVO> list = null;

		try {
			list = mapper.memberSearch(member_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

}
