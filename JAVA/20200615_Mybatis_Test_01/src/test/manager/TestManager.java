package test.manager;

import java.util.Scanner;

import test.dao.PersonDAO;
import test.vo.Person;

public class TestManager {
	
		// ����� ȸ������ ��ü�� DB�� ����
		PersonDAO dao = new PersonDAO();
		// �Է¹��� �����͸� ȸ������ ��ü�� ����
		Person p = new Person();
	
		Scanner sc = new Scanner(System.in);
	
	public void startFunc() {
		
		do {
			menu();
			
			System.out.print("��ȣ�� �Է��� �ּ��� : ");			
			int code = sc.nextInt();
			System.out.println();
			
			switch (code) {
			
			case 1:
				join();
				
				break;
				
			case 2:
				escape();
				
				break;
				
			case 3: 
				search();
				break;
				
			case 0:
				System.out.println("�ý����� �����մϴ�.");
				System.exit(0);
				break;

			default:
				System.out.println("�ùٸ� ���� �Է��ϼ���.");
				break;
			}
			
		} while (true);
		
	}
	public void menu() {
		System.out.println("=============");
		System.out.println("�޴��� �����ϼ���");
		System.out.println("=============");
		System.out.println("1. ȸ�� ����");
		System.out.println("2. ȸ�� Ż��");
		System.out.println("3. ȸ�� ��ȸ");
		System.out.println("0. �ý��� ����");
		System.out.println("=============");
	}
	
	public void join() {
		sc.nextLine();
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��� �ּ��� : ");
		int age = sc.nextInt();
		
		// vo�� �� ����
		p.setName(name);
		p.setAge(age);
		
		// ��� �Է¹��� ������ ����
		dao.insertPerson(p);
		
	}
	
	public void escape() {
		System.out.print("Ż���Ϸ��� ȸ���� ȸ����ȣ�� �Է��� �ּ��� : ");
		int num = sc.nextInt();
		
		dao.deletePerson(num);
		System.out.println("�׵��� �̿��� �ּż� �����մϴ�.");
		System.out.println("Ż��ó���� �Ϸ�Ǿ����ϴ�.");
		System.out.println();
	}
	
	public void search() {

		System.out.print("��ȸ�Ϸ��� ȸ����ȣ�� �Է��� �ּ��� : ");
		int num = sc.nextInt();
		
		dao.viewPerson(num);
		
		System.out.println("��ȸ�� �Ϸ�Ǿ����ϴ�.");
		System.out.println("��ȸ����� �Ʒ��� �����ϴ�.");
		System.out.println();
	}

}
