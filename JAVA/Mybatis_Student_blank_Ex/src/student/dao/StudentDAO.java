package student.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import student.vo.Student;

/**
 * DB관련 처리 클래스
 */
public class StudentDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	
	
	public int insert(Student s) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			
			cnt = mapper.insertStudent(s);
			
			session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return cnt;
	}
	
	public ArrayList<Student> selectStudentAll(){
		SqlSession session = null;
		
		ArrayList<Student> list = null;
		
		try {
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			
			list = mapper.selectStudentAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;
	}
	
	public int delete(int id) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			
			cnt = mapper.deleteStudent(id);
			
			session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				
			}
		}
		
		return cnt;
	}
	
	public int update(Student s){
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			
			cnt = mapper.updateStudent(s);
			
			session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return cnt;
	}
	
	public ArrayList<Student> selectName(String name){
		SqlSession session = null;
		ArrayList<Student> list = null;
		
		try {
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			
			list = mapper.searchStudent(name);
			
			session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;
	}
}
