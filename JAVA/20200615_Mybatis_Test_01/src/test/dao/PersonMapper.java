package test.dao;

import test.vo.Person;

public interface PersonMapper {

	public void insertPerson(Person Vo);
	
	public void deletePerson(int num);
	
	public Person viewPerson(int num);
	
}
