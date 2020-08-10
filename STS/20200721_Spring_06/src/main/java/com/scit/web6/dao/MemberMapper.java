package com.scit.web6.dao;

import java.util.ArrayList;

import com.scit.web6.vo.MemberVO;

public interface MemberMapper {
	
	// int타입으로 리턴
	// 값 입력
	public int memberJoin(MemberVO member);
	
	// 전체조회
	// 리턴타입을 알기위해서는 연결되어있는 mybatis-config.xml가서 확인
	// vo가 연결되어있음을 확인하고 쿼리의 결과가 여러개가 나올 수 있다는 것을 확인
	// 값을 조회할때는 ArrayList를 사용
	// 전체조회시에는 파라미터 타입없으니 매개변수 받아올것도 없다
	public ArrayList<MemberVO> joinList();
	
	// 받아와야 할 값을 매개변수로 받아옴
	// 삭제
	public int memberDelete(String member_id);
	
	// 업데이트
	public int memberUpdate(MemberVO member);
	
	// 조건조회
	public ArrayList<MemberVO> memberSearch(String member_id);
	
}
