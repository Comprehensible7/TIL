//����� ȭ��
package student.ui;

import java.util.ArrayList;
import java.util.Scanner;

import student.dao.StudentDAO;
import student.vo.Student;

public class StudentUI {
	Scanner scan = new Scanner(System.in);
	StudentDAO dao = new StudentDAO();
	
	public StudentUI() {
		while (true) {
			menuPrint();
			int m = scan.nextInt();
	
			switch (m) {
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
				case 6:
					searchOne();
					break;
				case 0: 
					System.out.println("���α׷��� �����մϴ�."); 
					return;
				default: 	
					System.out.println("�ٽ� �����ϼ���.");
			}
		}
	}
	
	//�޴� ���
	public void menuPrint() {
		System.out.println();
		System.out.println("[ �л� ���� ���� ]");
		System.out.println("1. �Է�");
		System.out.println("2. ��ü ���");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.println("5. �˻�");
		System.out.println("6. �л��Ѹ� �˻�");
		System.out.println("0. ����");
		System.out.print("���� > ");
	}
	
	//�Է� 
	public void input() {
		String id, name;
		int k, e, m;
		int n;
		
		System.out.println("[ ���� �Է� ]");
		scan.nextLine();
		System.out.print("�й� : ");
		id = scan.nextLine();
		System.out.print("�̸� : ");
		name = scan.nextLine();
		System.out.print("���� ���� : ");
		k = scan.nextInt();
		System.out.print("���� ���� : ");
		e = scan.nextInt();
		System.out.print("���� ���� : ");
		m = scan.nextInt();
		
		Student s = new Student(id, name, k, e, m);
		n = dao.insert(s);
		
		if (n == 0) {
			System.out.println("* ���� ����");
		}
		else {
			System.out.println("* ����Ǿ����ϴ�.");
		}
	}
	
	//��ü ���
	public void output() {
		ArrayList<Student> list;
		
		System.out.println("[ ��ü �л� ���� ]");
		System.out.println("�й�\t�̸�\t����\t����\t����\t���");
		
		list = dao.selectAll();
		
		if (list == null || list.size() == 0) {
			System.out.println("* ����� �����Ͱ� �����ϴ�.");
		}
		else {
			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);
				System.out.print(s.getId() + "\t");
				System.out.print(s.getName() + "\t");
				System.out.print(s.getKor() + "\t");
				System.out.print(s.getEng() + "\t");
				System.out.print(s.getMat() + "\t");
				System.out.println(s.getAvg());
			}
		}
	}
	
	//����
	public void delete() {
		String id;
		int n;
		
		System.out.println("[ ���� ]");
		System.out.print("������ �й� : ");
		scan.nextLine();
		id = scan.nextLine();
		
		n = dao.delete(id);
		
		if (n == 0) {
			System.out.println("* �ش�Ǵ� �й��� �����ϴ�.");
		}
		else {
			System.out.println("* " + n + "���� �����Ǿ����ϴ�.");
		}		
	}
	
	//����
	public void update() {
		String id, name;
		int k, e, m;
		int n;
		
		System.out.println("[ ���� ]");
		scan.nextLine();
		System.out.print("������ �й� : ");
		id = scan.nextLine();
		System.out.print("�̸� : ");
		name = scan.nextLine();
		System.out.print("���� ���� : ");
		k = scan.nextInt();
		System.out.print("���� ���� : ");
		e = scan.nextInt();
		System.out.print("���� ���� : ");
		m = scan.nextInt();
		
		Student s = new Student(id, name, k, e, m);
		n = dao.update(s);
		
		if (n == 0) {
			System.out.println("* ���� ����");
		}
		else {
			System.out.println("* �����Ǿ����ϴ�.");
		}
	}
	
	//�̸����� �˻�
	public void search() {
		ArrayList<Student> list;
		String name;
		
		System.out.println("[ �˻� ]");
		System.out.print("�˻��� �̸� : ");
		scan.nextLine();
		name = scan.nextLine();
		
		list = dao.selectName(name);
		
		if (list == null || list.size() == 0) {
			System.out.println("* ����� �����Ͱ� �����ϴ�.");
		}
		else {
			System.out.println("�й�\t�̸�\t����\t����\t����\t���");
			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);
				System.out.print(s.getId() + "\t");
				System.out.print(s.getName() + "\t");
				System.out.print(s.getKor() + "\t");
				System.out.print(s.getEng() + "\t");
				System.out.print(s.getMat() + "\t");
				System.out.println(s.getAvg());
			}
		}
	}
	
	// �й����� �˻�
	public void searchOne() {
		Student s = null;
		String id = null;
		
		System.out.println("[ �й����� �˻� ]");
		System.out.print("�й��� �Է� : ");
		
		scan.nextLine();
		id = scan.nextLine();
		
		s = dao.searchStudentId(id);
		
		if(s == null) {
			System.out.println("�˻���� ����");
		} else {
			System.out.println("�й�\t�̸�\t����\t����\t����\t���");
			System.out.print(s.getId() + "\t");
			System.out.print(s.getName() + "\t");
			System.out.print(s.getKor() + "\t");
			System.out.print(s.getEng() + "\t");
			System.out.print(s.getMat() + "\t");
			System.out.println(s.getAvg());
		}
	}
}
