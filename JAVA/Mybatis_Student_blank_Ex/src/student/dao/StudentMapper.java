package student.dao;

import java.util.ArrayList;

import student.vo.Student;

/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface StudentMapper {
	
	public int insertStudent(Student vo);
	
	public ArrayList<Student> selectStudentAll();
	
	public int deleteStudent(int id);
	
	public int updateStudent(Student s);
	
	public ArrayList<Student> searchStudent(String name);
	
}
