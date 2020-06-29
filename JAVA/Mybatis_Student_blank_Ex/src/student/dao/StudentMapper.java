package student.dao;

import java.util.ArrayList;

import student.vo.Student;

/**
 * Mapper XML의 SQL문 사용 메서드 정의
 */
public interface StudentMapper {
	
	public int insertStudent(Student vo);
	
	public ArrayList<Student> selectStudentAll();
	
	public int deleteStudent(int id);
	
	public int updateStudent(Student s);
	
	public ArrayList<Student> searchStudent(String name);
	
}
