import java.util.Scanner;

public class SchoolUI {

	private SchoolManager sm = new SchoolManager();
	private Scanner sc = new Scanner(System.in);
	
	public void printMainMenu() {
		System.out.println();
		System.out.println("==============");
		System.out.println("∥ 직원 관리 시스템  ∥");
		System.out.println("==============");
		System.out.println("1. 등록");
		System.out.println("2. 전체 출력");
		System.out.println("0. 종료");
		System.out.println("=============");
		System.out.print("메뉴 선택 => ");
	}
	
	public void printInsertHumanMenu() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥        등록 메뉴    ∥");
		System.out.println("=============");
		System.out.println("1. 학생");
		System.out.println("2. 직원");
		System.out.println("3. 교수");
		System.out.println("0. 상위 메뉴");
		System.out.println("=============");
		System.out.print("메뉴 선택 => ");
	}
	
	public void insertHuman() {
		int choice = 0;
		
		while(true) {
			printInsertHumanMenu();
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				insertStudent();
				break;
			case 2:
				insertStaff();
				break;
			case 3:
				insertProfessor();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
	}
	
	public void insertStudent() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥       학생 등록     ∥");
		System.out.println("=============");
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("주민번호 : ");
		String sn = sc.next();
		System.out.print("학번 : ");
		String ssn = sc.next();
		
		Student s = new Student(sn, name, age, ssn);
		boolean result = sm.insertHuman(s);
		
		if(result) System.out.println("정상 등록 완료");
		else System.out.println("등록 오류(이미 존재하는 주민번호 또는 학번)");
	}
	
	public void insertStaff() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥       직원 등록     ∥");
		System.out.println("=============");
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("주민번호 : ");
		String sn = sc.next();
		System.out.print("부서 : ");
		String field = sc.next();
		
		Staff s = new Staff(sn, name, age, field);
		boolean result = sm.insertHuman(s);
		
		if(result) System.out.println("정상 등록 완료");
		else System.out.println("등록 오류(이미 존재하는 주민번호)");
	}
	
	public void insertProfessor() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥       교수 등록     ∥");
		System.out.println("=============");
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("주민번호 : ");
		String sn = sc.next();
		System.out.print("전공 : ");
		String major = sc.next();
		
		Professor p = new Professor(sn, name, age, major);
		boolean result = sm.insertHuman(p);
		
		if(result) System.out.println("정상 등록 완료");
		else System.out.println("등록 오류(이미 존재하는 주민번호)");
	}
	
	public void printAll() {
		sm.printAll();
	}
	
	public void exec() {
		int choice = 0;
		
		while(true) {
			
			printMainMenu();
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				insertHuman();
				break;
			case 2:
				printAll();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
	}
}
