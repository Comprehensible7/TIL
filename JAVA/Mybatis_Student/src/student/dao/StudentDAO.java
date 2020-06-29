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
	
	//학생정보 저장
	public int insert(Student s) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			
			// 학생정보를 저장하는 메서드를 호출
			cnt = mapper.insertStudent(s);
			
			// insert, delete, update를 하면 반드시 commit을 해라
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// session 객체를 다 사용했으면 close 해줘야 한다.
			if(session != null) {
				session.close();
			}
		}
		
		
		return cnt;
	}

	//전체 읽기
	public ArrayList<Student> selectAll() {
		SqlSession session = null;
		// 초기화
		ArrayList<Student> list = null;
		
		try {
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
		
			// 전체조회 메서드 실행
			list = mapper.selectStudentAll();
			// select하고 return값 받아야한다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();
			}
		}
		
		return list;
	}

	//학생정보 삭제
	public int delete(String id) {
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
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		return cnt;
	}
	
	//학생정보 수정
	public int update(Student s) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			
			cnt = mapper.updateStudent(s);
			
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		return cnt;
	}
	
	// 조건 검색 및 출력
	public ArrayList<Student> selectName(String name) {
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
	
	public Student searchStudentId(String id) {
		SqlSession session = null;
		Student s = null;
		
		try {
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			
			s = mapper.searchStudentId(id);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(session != null) {
				session.close();
				
			}
		}
		
		return s;
	}

}
