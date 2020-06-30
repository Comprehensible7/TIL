package test.dao;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis�� ȯ�� ���� �а� ��ü ����
 */

// �޼��峪 ���� 
// ����ƽ o - > �ε� -> ����
// ����ƽ x -> ��ü���� �Ǵ� �޼��� ���ට  -> �����
public class MybatisConfig {
	// 1. Ŭ���� �ε����ڸ��� �����, ���� ��
	// �Ʒ��� xml�� ������ ��� �������ִ� ��ü�� sqlsessionfactory�̴�.
	// private�̶� �ٸ�Ŭ�������� �������� ��� �Ұ�
	// �ƹ��� ���� �ȵ��־ null�� ��Ȳ
	// ���������� ���α׷��� ���� ������, �غ��ص�
	private static SqlSessionFactory sqlSessionFactory;

	// static �� (2. �ε��ɶ� �����)
	// 2-1. �ش� Ŭ������ �ε��� �� �� �ѹ��� ȣ���.(����), ��ȸ�� �ڵ�
	// ���ø����̼��� ����¸� ���ø����̼� �ȿ� �ִ� ��� Ŭ������ �ε��˴ϴ�.
	// �ڹ�å ����ƽ ���ʿ� ���� (160������)
	// static ������ �ʱ�ȭ�ϱ����� ���� ���̴� ���, ���� ȣ�� �Ұ�
	// ���θ޼��庸�� ���� ������ ���� �ִ°�쿡 ���
	// Ŭ���� �ε��� ��ü������ �ٸ���.(������� �ٸ�, �׳� �ѹ� ��ĵ�ϴ´���)
	static {
		String resource = "mybatis-config.xml";		//Mybatis ȯ�漳�� ���� �б�. src ��ο� ����.
		

		// �� �ڵ�� �� �ѹ��� ������ ������
		// �������������� �ѹ��� �����
		// ������ ���� �� �̱��� ���� �ڵ�, ���� ����
		try {
			// ������ �о
			// Resources �ڹٿ��� �����ϴ� Ŭ����
			// getResourceAsReader(resource)���ϰ���������ָ� �о��ִ� �������
			Reader reader = Resources.getResourceAsReader(resource);
			// ��ü�� ���� (��������� ���� xml�� ����)
			// ���� ������ �о ��ü�� �������
			// �ѹ����� �� �����
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			// ���� �� �о����� �ݾ���
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �ٸ� Ŭ�������� ȣ���ؼ� ����� �� �ֵ��� ����
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
