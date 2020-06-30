package test.manager;

import java.util.Scanner;

import test.dao.PersonDAO;
import test.vo.Person;

public class TestManager {
	
		// 저장된 회원가입 객체를 DB로 전달
		PersonDAO dao = new PersonDAO();
		// 입력받은 데이터를 회원가입 객체에 저장
		Person p = new Person();
	
		Scanner sc = new Scanner(System.in);
	
	public void startFunc() {
		
		do {
			menu();
			
			System.out.print("번호를 입력해 주세요 : ");			
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
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("올바른 값을 입력하세요.");
				break;
			}
			
		} while (true);
		
	}
	public void menu() {
		System.out.println("=============");
		System.out.println("메뉴를 선택하세요");
		System.out.println("=============");
		System.out.println("1. 회원 가입");
		System.out.println("2. 회원 탈퇴");
		System.out.println("3. 회원 조회");
		System.out.println("0. 시스템 종료");
		System.out.println("=============");
	}
	
	public void join() {
		sc.nextLine();
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		// vo로 값 보냄
		p.setName(name);
		p.setAge(age);
		
		// 방금 입력받은 내용을 전달
		dao.insertPerson(p);
		
	}
	
	public void escape() {
		System.out.print("탈퇴하려는 회원의 회원번호를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		dao.deletePerson(num);
		System.out.println("그동안 이용해 주셔서 감사합니다.");
		System.out.println("탈퇴처리가 완료되었습니다.");
		System.out.println();
	}
	
	public void search() {

		System.out.print("조회하려는 회원번호를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		dao.viewPerson(num);
		
		System.out.println("조회가 완료되었습니다.");
		System.out.println("조회결과는 아래와 같습니다.");
		System.out.println();
	}

}
