package com.scit39.test20.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit39.test20.dao.PersonDAO;
import com.scit39.test20.vo.Person;

@Service
public class PersonService {

	private static final Logger logger = LoggerFactory.getLogger(PersonService.class);

	// DAO를 연결
	// 조건식, 객체연결을 실행해줌?
	@Autowired
	private PersonDAO dao;

	// Vo를 받아옴
	// 인트형으로 리턴받음
	// 마이바티스 할때처럼 매니저 클래스임
	public int insertPerson(Person person) {
			
		logger.debug("폼으로부터 전달된 정보 : {}", person.toString());
		int cnt = dao.insertPerson(person);
		
		return cnt;
	}

}
