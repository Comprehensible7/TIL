package test.dao;

import test.vo.Person;

public interface PersonMapper {
	
	// personMapper�� namespace�������ֱ����� ���� �������ش�
	// 1��°

	// �߻�޼���
	// �� �Է�
	public void insertPerson(Person Vo);
	
	// ȸ������
	public void deletePerson(int num);
}
