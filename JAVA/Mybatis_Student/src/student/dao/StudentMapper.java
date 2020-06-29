package student.dao;

import java.util.ArrayList;

import student.vo.Student;

/**
 * Mapper XML�� SQL�� ��� �޼��� ����
 */
public interface StudentMapper {
	//Student ��ü ����
	// int���� �������� ���༺���� Ƚ���� ���Ϲ޴´�.
	// void�� �ƹ��͵� �ȹ޴´�.
	public int insertStudent(Student vo);
	//��ü �б�
	// ����Ʈ�� �޾ƿ;��Ѵ�. (VO) , �޼����
	public ArrayList<Student> selectStudentAll();
	//����
	public int deleteStudent(String id);
	//����
	public int updateStudent(Student s);
	//�̸����� �˻�
	public ArrayList<Student> searchStudent(String name);
	//�й����� �˻�
	public Student searchStudentId(String id);
	
}
