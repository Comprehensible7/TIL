package test.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

public class PersonDAO {

	// ����� sqlSessionFactory ��ü�� �ҷ��;� �մϴ�.
	// dao ���ο����� ����ϱ����� private ����
	// static���� ����Ǿ������� mybatisconfig Ŭ������ ȣ��, get���ش�
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	// PersonMapper �������̽��� �߻�޼��� �κ�
	// ȸ�������Ҷ� ���� �� DAO�� �޼ҵ�
	public void insertPerson(Person Vo) {
		// SqlSessionFactory ��ü�� ����ؼ� SqlSession��ü�� �����Ѵ�.
		// ���� �߱޹��� Ű�� ����ؼ� �ǹ��� �����Ѵ�.
		// ���������� �ʱ�ȭ����, ���������
		SqlSession session = null;
		
		// Database�� ����� �������� �����ϴٰ� ����ġ ���� ������ �������� ����ó���� ���ֱ� ���ؼ�
		try {
			// 1. DB�� ������ session�� �����Ѵ�.
			// mybatis��� �����ӿ�ũ�� ����ϱ� ���ؼ� ������ �ڵ带 �Է��ؾ� �Ѵ�.
			session = factory.openSession();
			// 2. Mapper Interface�� class�� ���·� ���� �޼ҵ带 ȣ���� �� �ְ� �ؾ��Ѵ�.
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			// 3. Class�� ���·� ������� MapperInterface�� ����ؼ� �޼ҵ带 ȣ���Ѵ�.
			// ȸ�������� �����ض�.
			mapper.insertPerson(Vo);
			// 4. insert ������ ���� �� �Ŀ��� �����ϱ� ���� commit�ؾ��Ѵ�.
			session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// �������ֱ� ���� ���� ����
			if(session != null) {
				session.close();
			}
		}
		
	}
	
	// ȸ�� ���� ���
	public void deletePerson(int num) {
		SqlSession session = null;
	
		try {
			session = factory.openSession();
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			
			// mapper �������̽��� ������ �ִ� �޼ҵ� �߿� ȸ������ �޼ҵ带 ����
			mapper.deletePerson(num);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
	}
	
}
