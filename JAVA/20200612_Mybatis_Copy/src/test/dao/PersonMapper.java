package test.dao;

import test.vo.Person;

public interface PersonMapper {
	
	// personMapper에 namespace연결해주기위해 먼저 생성해준다
	// 1번째

	// 추상메서드
	// 값 입력
	public void insertPerson(Person Vo);
	
	// 회원삭제
	public void deletePerson(int num);
}
