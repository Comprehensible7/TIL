package com.scit39.test20.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit39.test20.vo.Person;


@Repository
// 예외처리를 진행해주는 좋은녀석임
// 예외처리, mapper처리
public class PersonDAO {

	// SqlSession을 연결
	@Autowired
	private SqlSession session;
	
	// 기존 마이바티스 시험때처럼 dao는 마이바티스를 사용할 수 있게 입력한다.
	
	public int insertPerson(Person person) {
		// 마이바티스를 쓸수있게 해줌
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		// 리턴 받을 변수 선언
		int cnt = 0;
		
		try {
			cnt = mapper.insertPerson(person);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cnt;
	}
}
