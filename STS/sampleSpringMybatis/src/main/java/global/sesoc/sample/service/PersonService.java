package global.sesoc.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import global.sesoc.sample.dao.PersonDAO;
import global.sesoc.sample.vo.Person;

@Service
public class PersonService {

	private static final Logger logger = LoggerFactory.getLogger(PersonService.class);
	
	@Autowired
	private PersonDAO dao;
	
	public int insertPerson(Person person) {
		logger.debug("폼으로부터 전달된 정보 : {}", person.toString());
		int cnt = dao.insertPerson(person);
		return cnt;
	}
	
}