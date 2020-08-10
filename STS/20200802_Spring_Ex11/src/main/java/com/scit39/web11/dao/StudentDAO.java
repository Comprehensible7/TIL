package com.scit39.web11.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit39.web11.vo.StudentVO;

@Repository
public class StudentDAO {
	
	@Autowired
	private SqlSession session;
	
	// join
	public int joinStudent(StudentVO student) {
		
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		
		int cnt = 0;
		
		try {
			cnt = mapper.joinStudent(student);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cnt;
		
	}
	
	// select all
	public ArrayList<StudentVO> selectStudent(){
		
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		
		ArrayList<StudentVO> list = null;
		
		try {
			list = mapper.selectStudent();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
		
	}
	
	// delete
	public int deleteStudent(String s_id) {
		
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		
		int cnt = 0;
		
		try {
			cnt = mapper.deleteStudent(s_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cnt;
		
	}
	
	// update
	public int updateStudent(StudentVO student) {
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		
		int cnt = 0;
		
		try {
			cnt = mapper.updateStudent(student);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	// search
	public ArrayList<StudentVO> searchStudent(String s_id){
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		
		ArrayList<StudentVO> list = null;
		
		try {
			list = mapper.searchStudent(s_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}
	

}
