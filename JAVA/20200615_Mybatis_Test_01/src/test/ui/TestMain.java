package test.ui;

import test.manager.TestManager;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestManager tm = new TestManager();
		
		tm.startFunc();
		
	}

}


//��������

//1.sql�� ���̺� ���� (��������� �������)

//2. vo���� 
//- ������ : �ڷ����� ���� �����ͺ��̽��� �ڷ����� �ٸ��� ���� �������ִ� �ڷ��� ���
//			�÷��̸�, �����̸� �����ϰ� �� ��

//3. ���̹�Ƽ�� ����
//mybatis-config.xml
// vo���� �� typeAlias�� �������ش�.
// type, alias, ��Ī�� �������ش�, personMapper�κп��� parameterType���� �� ���

//db.properties : �������� �� Ȯ�ΰ���
//����� ����Ŭ ����̹�, ��ġ���, ���̵� ��й�ȣ Ȯ�ΰ���
//localhost, ���̵� ����� ���������� ���氡��

//4. type alias ����

//5. DB�������� ���� (�����ؼ� ���, ���̹�Ƽ�� ���߹������� ����)
//driver, url, username, password�� �Ȱ��� �ۼ��Ǿ��ִ��� ����� Ȯ��

//6. mapper�� Ȯ��
//personMapper.xml������ �����ؾ� ��ϰ���

//7. dao�� mybatisconfig.java�� ����
//mybatis-config.xml�� resource�� ��������
//mybatis�� sql����Ҽ��ֵ��� ����

//8. Mapper.xml�� ����
//namespace�� dao�� mapper �������̽��� ��������
//ex)test.dao.PersonMapper�� ����

