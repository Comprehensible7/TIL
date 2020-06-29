//����� ȭ��
package student.ui;

import java.util.ArrayList;
import java.util.Scanner;

import student.dao.StudentDAO;
import student.vo.Student;

public class StudentUI {
	
	Scanner sc = new Scanner(System.in);
	StudentDAO dao = new StudentDAO();
	
	public StudentUI() {
		
		while (true) {
			menuPrint();
			
			int code = sc.nextInt();
			
			switch (code) {
			case 1:
				input();
				break;
				
			case 2:
				output();
				break;
				
			case 3:
				delete();
				break;
				
			case 4:
				update();
				break;
				
			case 5:
				search();
				break;
				
			case 0:
				System.out.println("���α׷��� �����մϴ�");
				return;

			default:
				System.out.println("�ٽ� �����ϼ���");
			}
		}
	}
	public void menuPrint() {
		System.out.println();
		System.out.println("[ �л� ���� ���� ]");
		System.out.println("1. �Է�");
		System.out.println("2. ��ü ���");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.println("5. �˻�");
		System.out.println("0. ����");
		System.out.print("���� > ");
	}
	
	public void input() {
		int id, k, e, m;
		String name;
		int n;
		
		System.out.println("[ ���� �Է� ]");
		sc.nextLine();
		System.out.print("�й� : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("���� ���� : ");
		k = sc.nextInt();
		System.out.print("���� ���� : ");
		e = sc.nextInt();
		System.out.print("���� ���� : ");
		m = sc.nextInt();
		
		Student s = new Student(id, name, k, e, m);
		n = dao.insert(s);
		
		if(n == 0) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		
	}
	
	public void output() {
		
		ArrayList<Student> list;
		
		System.out.println("[ ��ü �л� ���� ]");
		System.out.println("�й��t�̸��t����t����t���Ђt���");
		
		list = dao.selectStudentAll();
		
		if(list == null || list.size() == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		} else {
			for(int i = 0; i<list.size();i++) {
				Student s = list.get(i);
				System.out.print(s.getId() + "�t");
				System.out.print(s.getName() + "�t");
				System.out.print(s.getKor() + "�t");
				System.out.print(s.getEng() + "�t");
				System.out.print(s.getMat() + "�t");
				System.out.println(s.getAvg());
			}
		}
		
	}
	
	public void delete() {
		int id, n;
		
		System.out.println("[ ���� ]");
		System.out.print("������ �й� : ");
		sc.nextLine();
		id = sc.nextInt();
		
		n = dao.delete(id);
		
		if (n == 0) {
			System.out.println("�ش��ϴ� �й��� �����ϴ�.");
		} else {
			System.out.println(n + "���� �����Ǿ����ϴ�.");
		}
		
		
	}
	
	public void update() {
		
		int id, k, e, m;
		String name;
		int n;
		
		System.out.println("[ ���� �Է� ]");
		sc.nextLine();
		System.out.print("�й� : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("���� ���� : ");
		k = sc.nextInt();
		System.out.print("���� ���� : ");
		e = sc.nextInt();
		System.out.print("���� ���� : ");
		m = sc.nextInt();
		
		Student s = new Student(id, name, k, e, m);
		n = dao.update(s);
		
		if(n == 0 ) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		
	}
	
	public void search() {
		ArrayList<Student> list;
		String name;
		
		System.out.println("[ �˻� ]");
		System.out.print("�˻��� �̸� : ");
		sc.nextLine();
		name = sc.nextLine();
		
		list = dao.selectName(name);
		
		if(list == null || list.size() == 0) {
			System.out.println("�̸��� �����ϴ�.");
		} else {
			System.out.println("�й��t�̸��t����t����t���Ђt���");
			for(int i = 0; i<list.size();i++) {
				Student s = list.get(i);
				System.out.print(s.getId() + "�t");
				System.out.print(s.getName() + "�t");
				System.out.print(s.getKor() + "�t");
				System.out.print(s.getEng() + "�t");
				System.out.print(s.getMat() + "�t");
				System.out.println(s.getAvg());
			}
		
		}
	
		
	}
	
	
}
