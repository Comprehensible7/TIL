package test.ui;

import java.util.ArrayList;
import java.util.Scanner;

import test.dao.BookDAO;
import test.vo.Book;

public class BookUI {
	
	// ��ĳ�� ����
	Scanner sc = new Scanner(System.in);
	// DAO ��üȭ
	BookDAO dao = new BookDAO();
	
	public BookUI() {
		
		while(true) {
			// �޴� ���
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
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;

			default:
				System.out.println("�ٽ� �����ϼ���.");
				
			}
			
		}
	}
	
	public void menuPrint() {
		  System.out.println();
		  System.out.println("[ ���� ���� ]");
	      System.out.println("1. �Է�");
	      System.out.println("2. ��ü ���");
	      System.out.println("3. ����");
	      System.out.println("4. ����");
	      System.out.println("5. �˻�");
	      System.out.println("0. ����");
	      System.out.print("���� > ");
	}
	
	public void input() {
		String num, name, price, company, regidate;
		int n;
		
		System.out.println("[���� ���]");
		sc.nextLine();
		System.out.print("���� ��ȣ : ");
		num = sc.nextLine();
		System.out.print("���� �̸� : ");
		name = sc.nextLine();
		System.out.print("���� ���� : ");
		price = sc.nextLine();
		System.out.print("���ǻ� : ");
		company = sc.nextLine();
		System.out.print("��� ���� : ");
		regidate = sc.nextLine();
		
		Book b = new Book(num, name, price, company, regidate);
		n = dao.insert(b);
		
		if(n == 0) {
			System.out.println();
			System.out.println("���� �����Դϴ�.");
		} else {
			System.out.println();
			System.out.println("���� �����Ͽ����ϴ�.");
			System.out.println();
		}
	}
	
	public void output() {
		ArrayList<Book> list;
		
		System.out.println();
		System.out.println("[ ��ü ���� ���� ]");
		System.out.println("������ȣ\t�����̸�\t��������\t���ǻ�\t�������\t");
		System.out.println();
		
		// dao�� printAll�� ����
		list = dao.printAll();
		
		// ����Ʈ�� ���̰ų� ����Ʈ�� ����� 0�ϰ��
		if(list == null || list.size() == 0) {
			System.out.println("���� ������ ����");
		} else {
			// ����Ʈ�� �����ŭ ���� ����
			// �� ��ü���� i����ŭ get�Ѵ�
			for (int i = 0; i < list.size(); i++) {
				Book b = list.get(i);
				System.out.print(b.getNum() + "\t");
				System.out.print(b.getName() + "\t");
				System.out.print(b.getPrice() + "\t");
				System.out.print(b.getCompany() + "\t");
				System.out.print(b.getRegidate() + "\t");
				System.out.println();
			}
		}
	}
	
	public void delete() {
		String name;
		int n;
		
		System.out.println("[ ���� ]");
		System.out.print("������ ������ : ");
		sc.nextLine();
		name = sc.nextLine();
		// dao.deleteBook�� n���� �־���
		n = dao.deleteBook(name);
		
		if(n == 0) {
			System.out.println();
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
		} else {
			System.out.println();
			System.out.println(n + "���� �����Ǿ����ϴ�.");
		}
		
	}
	
	public void update() {
		
		int id;
		String num, name, price, company, regidate;
		int n;
		
		System.out.println("[ ���� ]");
		System.out.print("������ ������ȣ : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("���� ��ȣ : ");
		num = sc.nextLine();
		System.out.print("���� �̸� : ");
		name = sc.nextLine();
		System.out.print("���� ���� : ");
		price = sc.nextLine();
		System.out.print("���ǻ� : ");
		company = sc.nextLine();
		System.out.print("��� ���� : ");
		regidate = sc.nextLine();
		
		Book b = new Book(id, num, name, price, company, regidate);
		n = dao.updateBook(b);
		
		if(n == 0) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� �Ϸ�");
		}
	}
		// �˻����ǿ� �̸�, ���ǻ�, ������ڸ� ����ؼ� �غ���
		public void search() {
		      String name = null;
		      ArrayList<Book> bookList = null;
		      
		      System.out.println("[ ���� �������� �˻� ]");
		      System.out.print("�˻��ϰ��� �ϴ� ���������� �Է��ϼ��� >> ");
		      sc.nextLine();
		      name = sc.nextLine();
		      
		      bookList = dao.searchBook(name);
		      
		      if(bookList == null || bookList.size() == 0) 
		         System.out.println("�ش��ϴ� ������ ������ �����ϴ�.");
		      else {
		         for(int i = 0; i < bookList.size(); i++) {
		            Book b = bookList.get(i);
		            System.out.println("������ȣ\t�����̸�\t��������\t���ǻ�\t�������\t");
		            
		            System.out.print(b.getNum() + "\t");
		            System.out.print(b.getName() + "\t");
		            System.out.print(b.getPrice() + "\t");
		            System.out.print(b.getCompany() + "\t");
		            System.out.print(b.getRegidate() + "\t");
		         }
		     }
		}
}
