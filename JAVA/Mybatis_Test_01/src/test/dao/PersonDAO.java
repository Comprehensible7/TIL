package test.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

public class PersonDAO {
	
	SqlSession session = null;
	
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public void insertPerson(Person Vo) {
		
		
		try {
			session = factory.openSession();
			
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			
			mapper.insertPerson(Vo);
			
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
	
	public void deletePerson(int num) {
	
		try {
			session = factory.openSession();
			
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			
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
	
	public void viewPerson(int num) {
		
		try {
			session = factory.openSession();
			
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			
			mapper.viewPerson(num);
			
			session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}

}
