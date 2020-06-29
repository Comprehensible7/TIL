import java.util.Scanner;

public class SchoolUI {

	private SchoolManager sm = new SchoolManager();
	
	private Scanner sc = new Scanner(System.in);
	
	public void printMainMenu() {
		System.out.println("==================");
		System.out.println("|| 직원 관리 시스템 ||");
		System.out.println("==================");
		System.out.println("1. 등록");
		System.out.println("2. 전체 출력");
		System.out.println("0. 종료");
		System.out.println("==================");
		System.out.println(" 메뉴 선택 => ");
		
	}
	
	public void printInsertHumanMenu() {
		System.out.println("==============");
		System.out.println("|| 등록 메뉴 ||");
		System.out.println("==============");
		System.out.println("1. 학생");
		System.out.println("2. 직원");
		System.out.println("3. 교수");
		System.out.println("0. 상위 메뉴");
		System.out.println("==============");
		System.out.println(" 메뉴 선택 => ");
		
	}
	// SchoolManager객체의 printAll 메소드를 실행하는 메소드
	public void printAll() {
		// 생성해둔 객체를 입력하여 printAll()을 실행
		sm.printAll();
	}
	
	public void insertStudent() {
		sc.nextLine();
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
//		sc.next();
		System.out.print("주민등록번호를 입력해 주세요 : ");
		String sn = sc.nextLine();
//		sc.next();
		System.out.print("학번을 입력해 주세요 : ");
		String ssn = sc.nextLine();
//		sc.next();
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		Student s = new Student(sn, name, age, ssn);
		
		// SchoolManager에 Student 객체를 전달 후 체크진행
		boolean check = sm.insertHuman(s);
		
		if(check) {
			System.out.println("정상 등록 완료");
		} else {
			System.out.println("등록 오류");
		}
	}
	
	public void insertStaff() {
		sc.nextLine();
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
//		sc.next();
		System.out.print("주민등록번호를 입력해 주세요 : ");
		String sn = sc.nextLine();
//		sc.next();
		System.out.print("부서를 입력해 주세요 : ");
		String field = sc.nextLine();
//		sc.next();
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		Staff s = new Staff(sn, name, age, field);
		
		// SchoolManager에 Staff 객체를 전달 후 체크진행
		boolean check = sm.insertHuman(s);
		
		if(check) {
			System.out.println("정상 등록 완료");
		} else {
			System.out.println("등록 오류");
		}
	}
	
	public void insertProfessor() {
		sc.nextLine();
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
//		sc.next();
		System.out.print("주민등록번호를 입력해 주세요 : ");
		String sn = sc.nextLine();
//		sc.next();
		System.out.print("전공을 입력해 주세요 : ");
		String major = sc.nextLine();
//		sc.next();
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		Professor s = new Professor(sn, name, age, major);
		
		// SchoolManager에 Staff 객체를 전달 후 체크진행
		boolean check = sm.insertHuman(s);
		
		if(check) {
			System.out.println("정상 등록 완료");
		} else {
			System.out.println("등록 오류");
		}
	}
	
	public void insertHuman() {
		
		while(true) {
			printInsertHumanMenu();
			// 사용자로부터 메뉴번호 입력받기
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				// 학생
				insertStudent();
				break;
				
			case 2:
				// 직원
				insertStaff();
				break;
				
			case 3:
				// 교수
				insertProfessor();
				break;

			case 0:
				// 상위메뉴로 가라는 말은 지금 돌고있는 와일문을 종료하라는 말임
				return;
				
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	
	public void exec() {
		
		while(true) {
			printMainMenu();
			
			int num = sc.nextInt();
			
			switch(num) {
			
			case 1:
				// 등록
				insertHuman();
				break;
			
			case 2:
				// 전체출력
				printAll();
				break;
				
			case 0:
				// 종료
				System.out.println("종료합니다.");
				return;
				
			default:
				// 잘못된 입력
				System.out.println("잘못된 입력입니다.");
				break;
			
			}
		}
	}
	
}
