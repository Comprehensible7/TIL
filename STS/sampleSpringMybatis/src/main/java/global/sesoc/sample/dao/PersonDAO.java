package global.sesoc.sample.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.sample.vo.Person;

/**
 * 개인정보 관련 DB처리를 담당
 */
@Repository
public class PersonDAO {
	@Autowired
	private SqlSession session;
	
	/**
	 * 전달된 Person객체의 값을 DB로 저장
	 * @param person
	 */
	
	// 스프링에서는 커밋해줄 필요가 없음
	// 트랜잭션 매니저 설정을 해주었기때문에
	// finally를 사용할 필요가 없음 
	// 트랜잭션 매니저가 알아서 오픈, 클로즈 다해줘서 별도로 선언할 필요가 없다
	public int insertPerson(Person person) {
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		int cnt = 0;
		try {
			cnt = mapper.insertPerson(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
