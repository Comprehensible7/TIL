package student.dao;

import java.util.ArrayList;

import student.vo.Student;

/**
 * Mapper XML의 SQL문 사용 메서드 정의
 */
public interface StudentMapper {
	//Student 객체 저장
	// int쓰면 쿼리문이 실행성공한 횟수를 리턴받는다.
	// void는 아무것도 안받는다.
	public int insertStudent(Student vo);
	//전체 읽기
	// 리스트로 받아와야한다. (VO) , 메서드명
	public ArrayList<Student> selectStudentAll();
	//삭제
	public int deleteStudent(String id);
	//수정
	public int updateStudent(Student s);
	//이름으로 검색
	public ArrayList<Student> searchStudent(String name);
	//학번으로 검색
	public Student searchStudentId(String id);
	
}
