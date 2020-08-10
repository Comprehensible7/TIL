package com.scit39.web10.dao;

import java.util.ArrayList;

import com.scit39.web10.vo.StudentVO;

public interface StudentMapper {

	// 회원가입
	public int studentJoin(StudentVO student);
	
	// 학번전체 조회
	public ArrayList<StudentVO> studentAll();
	
	// 학번 삭제
	public int deleteStudent(String student_id);
	
	// 학번 수정
	public int updateStudent(StudentVO student);
	
	// 조건조회
	public ArrayList<StudentVO> searchStudent(String student_id);
}
