package com.scit39.web10.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit39.web10.vo.StudentVO;

@Repository
public class StudentDAO {

	@Autowired
	private SqlSession sn;

	// 입력
	public int studentJoin(StudentVO student) {

		StudentMapper mapper = sn.getMapper(StudentMapper.class);
		int cnt = 0;

		try {
			cnt = mapper.studentJoin(student);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return cnt;
	}

	// 전체조회
	public ArrayList<StudentVO> studentAll() {

		StudentMapper mapper = sn.getMapper(StudentMapper.class);

		ArrayList<StudentVO> list = null;

		try {
			list = mapper.studentAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	// 삭제
	public int deleteStudent(String student_id) {

		StudentMapper mapper = sn.getMapper(StudentMapper.class);
		int cnt = 0;

		try {
			cnt = mapper.deleteStudent(student_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return cnt;
	}

	// 수정

	public int updateStudent(StudentVO student) {

		StudentMapper mapper = sn.getMapper(StudentMapper.class);
		int cnt = 0;

		try {
			cnt = mapper.updateStudent(student);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return cnt;
	}

	// 조건검색
	public ArrayList<StudentVO> studentSearch(String student_id) {

		StudentMapper mapper = sn.getMapper(StudentMapper.class);

		ArrayList<StudentVO> list = null;

		try {
			list = mapper.searchStudent(student_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

}
