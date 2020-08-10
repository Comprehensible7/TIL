package com.scit39.web11.dao;

import java.util.ArrayList;

import com.scit39.web11.vo.StudentVO;

public interface StudentMapper {

	// 특별한것 없으면 인트형 리턴
	
	// 가입
	public int joinStudent(StudentVO student);
	
	// 전체조회
	public ArrayList<StudentVO> selectStudent();
	
	// 삭제
	public int deleteStudent(String s_id);
	
	// 수정
	public int updateStudent(StudentVO student);
	
	// 조건조회
	public ArrayList<StudentVO> searchStudent(String s_id);
}
