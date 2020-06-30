package test.ui;

import java.util.ArrayList;
import java.util.Scanner;

import test.dao.BookDAO;
import test.vo.Book;

public class BookUI {
	
	// 스캐너 선언
	Scanner sc = new Scanner(System.in);
	// DAO 객체화
	BookDAO dao = new BookDAO();
	
	public BookUI() {
		
		while(true) {
			// 메뉴 출력
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
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("다시 선택하세요.");
				
			}
			
		}
	}
	
	public void menuPrint() {
		  System.out.println();
		  System.out.println("[ 도서 관리 ]");
	      System.out.println("1. 입력");
	      System.out.println("2. 전체 출력");
	      System.out.println("3. 삭제");
	      System.out.println("4. 수정");
	      System.out.println("5. 검색");
	      System.out.println("0. 종료");
	      System.out.print("선택 > ");
	}
	
	public void input() {
		String num, name, price, company, regidate;
		int n;
		
		System.out.println("[도서 등록]");
		sc.nextLine();
		System.out.print("도서 번호 : ");
		num = sc.nextLine();
		System.out.print("도서 이름 : ");
		name = sc.nextLine();
		System.out.print("도서 가격 : ");
		price = sc.nextLine();
		System.out.print("출판사 : ");
		company = sc.nextLine();
		System.out.print("등록 일자 : ");
		regidate = sc.nextLine();
		
		Book b = new Book(num, name, price, company, regidate);
		n = dao.insert(b);
		
		if(n == 0) {
			System.out.println();
			System.out.println("저장 실패입니다.");
		} else {
			System.out.println();
			System.out.println("저장 성공하였습니다.");
			System.out.println();
		}
	}
	
	public void output() {
		ArrayList<Book> list;
		
		System.out.println();
		System.out.println("[ 전체 도서 정보 ]");
		System.out.println("도서번호\t도서이름\t도서가격\t출판사\t등록일자\t");
		System.out.println();
		
		// dao의 printAll을 실행
		list = dao.printAll();
		
		// 리스트가 널이거나 리스트의 사이즈가 0일경우
		if(list == null || list.size() == 0) {
			System.out.println("저장 데이터 없음");
		} else {
			// 리스트의 사이즈만큼 포문 실행
			// 북 객체에서 i값만큼 get한다
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
		
		System.out.println("[ 삭제 ]");
		System.out.print("삭제할 도서명 : ");
		sc.nextLine();
		name = sc.nextLine();
		// dao.deleteBook을 n으로 넣어줌
		n = dao.deleteBook(name);
		
		if(n == 0) {
			System.out.println();
			System.out.println("해당하는 도서가 없습니다.");
		} else {
			System.out.println();
			System.out.println(n + "건이 삭제되었습니다.");
		}
		
	}
	
	public void update() {
		
		int id;
		String num, name, price, company, regidate;
		int n;
		
		System.out.println("[ 수정 ]");
		System.out.print("수정할 도서번호 : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 번호 : ");
		num = sc.nextLine();
		System.out.print("도서 이름 : ");
		name = sc.nextLine();
		System.out.print("도서 가격 : ");
		price = sc.nextLine();
		System.out.print("출판사 : ");
		company = sc.nextLine();
		System.out.print("등록 일자 : ");
		regidate = sc.nextLine();
		
		Book b = new Book(id, num, name, price, company, regidate);
		n = dao.updateBook(b);
		
		if(n == 0) {
			System.out.println("수정 실패");
		} else {
			System.out.println("수정 완료");
		}
	}
		// 검색조건에 이름, 출판사, 등록일자를 사용해서 해보기
		public void search() {
		      String name = null;
		      ArrayList<Book> bookList = null;
		      
		      System.out.println("[ 도서 제목으로 검색 ]");
		      System.out.print("검색하고자 하는 도서제목을 입력하세요 >> ");
		      sc.nextLine();
		      name = sc.nextLine();
		      
		      bookList = dao.searchBook(name);
		      
		      if(bookList == null || bookList.size() == 0) 
		         System.out.println("해당하는 제목의 도서가 없습니다.");
		      else {
		         for(int i = 0; i < bookList.size(); i++) {
		            Book b = bookList.get(i);
		            System.out.println("도서번호\t도서이름\t도서가격\t출판사\t등록일자\t");
		            
		            System.out.print(b.getNum() + "\t");
		            System.out.print(b.getName() + "\t");
		            System.out.print(b.getPrice() + "\t");
		            System.out.print(b.getCompany() + "\t");
		            System.out.print(b.getRegidate() + "\t");
		         }
		     }
		}
}
