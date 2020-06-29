package student.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import student.vo.Student;

/**
 * DB���� ó�� Ŭ����
 */
public class StudentDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	//�л����� ����
	public int insert(Student s) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			
			// �л������� �����ϴ� �޼��带 ȣ��
			cnt = mapper.insertStudent(s);
			
			// insert, delete, update�� �ϸ� �ݵ�� commit�� �ض�
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// session ��ü�� �� ��������� close ����� �Ѵ�.
			if(session != null) {
				session.close();
			}
		}
		
		
		return cnt;
	}

	//��ü �б�
	public ArrayList<Student> selectAll() {
		SqlSession session = null;
		// �ʱ�ȭ
		ArrayList<Student> list = null;
		
		try {
			session = factory.openSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
		
			// ��ü��ȸ �޼��� ����
			list = mapper.selectStudentAll();
			// select�ϰ� return�� �޾ƾ��Ѵ�.
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();
			}
		}
		
		return list;
	}

	//�л����� ����
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
	
	//�л����� ����
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
	
	// ���� �˻� �� ���
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
