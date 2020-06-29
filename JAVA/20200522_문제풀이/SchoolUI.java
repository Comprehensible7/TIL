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
		System.out.println("2. 찾기");
		System.out.println("3. 삭제");
		System.out.println("4. 전체 출력");
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
		boolean result = false;
		
		while(true) {
			printInsertHumanMenu();
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				result = insertStudent();
				if(result) System.out.println("정상 등록 완료");
				else System.out.println("등록 오류(이미 존재하는 주민번호 또는 학번)");
				break;
			case 2:
				result = insertStaff();
				if(result) System.out.println("정상 등록 완료");
				else System.out.println("등록 오류(이미 존재하는 주민번호)");
				break;
			case 3:
				result = insertProfessor();
				if(result) System.out.println("정상 등록 완료");
				else System.out.println("등록 오류(이미 존재하는 주민번호)");
				break;
			case 0:
				return;
			default:
				System.out.println("잘못된 입력");
				break;
			}
		}
	}
	
	public boolean insertStudent() {	// void를 boolean으로 변경한다
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
		
		// 생성은 Student이나 값을 대입하는것은 insertHuman이다
		Student s = new Student(sn, name, age, ssn);
		return sm.insertHuman(s);
	}
	
	public boolean insertStaff() {		// void를 boolean으로 변경한다
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
		return sm.insertHuman(s);
	}
	
	public boolean insertProfessor() {		// void를 boolean으로 변경한다
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
		return sm.insertHuman(p);
	}
	
	public Human findHuman() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥       정보 출력     ∥");
		System.out.println("=============");
		
		System.out.print("주민번호 입력 : ");
		String sn = sc.next();
		
		return sm.findHuman(sn);
	}
	
	public void printAll() {
		sm.printAll();
	}
	
	public boolean deleteHuman() {
		System.out.println();
		System.out.println("=============");
		System.out.println("∥         삭 제       ∥");
		System.out.println("=============");
		System.out.print("주민번호 : ");
		String sn = sc.next();
		
		Human h = sm.findHuman(sn);
		
		if(h == null) return false;	// 객체 내용이 있으면 삭제 진행 null이라면 삭제할게 없다
		return sm.deleteHuman(h);
	}
	
	public void exec() {
		int choice = 0;
		Human h = null;
		boolean result = false;
		
		while(true) {
			
			printMainMenu();
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				insertHuman();
				break;
			case 2:
				h = findHuman();
				if(h != null) h.print();
				else System.out.println("일치하는 정보 없음");
				break;
			case 3:
				result = deleteHuman();
				if(result) System.out.println("삭제 성공");
				else System.out.println("삭제 실패");
				break;
			case 4:
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
