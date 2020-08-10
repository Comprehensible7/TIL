package global.sesoc.sample.dao;

import global.sesoc.sample.vo.Person;

public interface PersonMapper {
	
	//Person 객체의 값을 DB에 저장
	public int insertPerson(Person person);

}
