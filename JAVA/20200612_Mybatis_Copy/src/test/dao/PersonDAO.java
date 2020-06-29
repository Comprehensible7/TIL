package test.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

public class PersonDAO {

	// 사용할 sqlSessionFactory 객체를 불러와야 합니다.
	// dao 내부에서만 사용하기위해 private 선언
	// static으로 선언되어있으니 mybatisconfig 클래스를 호출, get해준다
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	// PersonMapper 인터페이스의 추상메서드 부분
	// 회원가입할때 실행 할 DAO의 메소드
	public void insertPerson(Person Vo) {
		// SqlSessionFactory 객체를 사용해서 SqlSession객체를 생성한다.
		// 내가 발급받은 키를 사용해서 건물에 진입한다.
		// 지역변수라 초기화해줌, 선언먼저함
		SqlSession session = null;
		
		// Database에 연결된 쿼리문을 실행하다가 예상치 못한 오류를 만났을때 예외처리를 해주기 위해서
		try {
			// 1. DB에 연결할 session을 생성한다.
			// mybatis라는 프레임워크를 사용하기 위해선 정해진 코드를 입력해야 한다.
			session = factory.openSession();
			// 2. Mapper Interface를 class의 형태로 만들어서 메소드를 호출할 수 있게 해야한다.
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			// 3. Class의 형태로 만들어진 MapperInterface를 사용해서 메소드를 호출한다.
			// 회원가입을 실행해라.
			mapper.insertPerson(Vo);
			// 4. insert 쿼리를 실행 한 후에는 적용하기 위해 commit해야한다.
			session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 종료해주기 위한 내용 선언
			if(session != null) {
				session.close();
			}
		}
		
	}
	
	// 회원 삭제 기능
	public void deletePerson(int num) {
		SqlSession session = null;
	
		try {
			session = factory.openSession();
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			
			// mapper 인터페이스가 가지고 있는 메소드 중에 회원삭제 메소드를 실행
			mapper.deletePerson(num);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
	}
	
}
