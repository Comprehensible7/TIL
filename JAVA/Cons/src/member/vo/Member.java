package member.vo;

import java.util.Scanner;

// 회원정보를 가진 클래스
public class Member {

	// 이름 나이 전화번호를 저장할 수 있도록 속성을 지정해줘야 한다.
	// 직접적인 접근을 못하게 private로 선언
	private String name;
	private int age;
	private String phone;

//	// 생성자
//	public Member() {
//		// 메뉴를 출력한다.
//		selectInfo();
//	}

	// 저장된 이름을 확인할 수 있는 메소드 -> 이 메소드를 실행한 곳으로 이름을 반환한다.
	public String getName() {
		return name;
	}

	// 이름을 저장할 수 있는 기능을 가진 메소드 -> 이 메소드를 사용한곳에서부터 이름을 받아온다.
	public void setName(String newName) {
		this.name = newName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String newPhone) {
		this.phone = newPhone;
	}

//	저장된 이름, 나이, 전화번호를 출력하는 기능을 가진 메소드
//	public void printInfo() {
//		System.out.println();
//		System.out.println("저장된 이름은 : " + name);
//		System.out.println("저장된 나이는 : " + age);
//		System.out.println("저장된 번호는 : " + phone);
//	}

//	public void Scan() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름을 입력해 주세요 : ");
//		name = sc.nextLine();
//
//		System.out.print("전화번호를 입력해 주세요 : ");
//		phone = sc.nextLine();
//
//		System.out.print("나이를 입력해 주세요 : ");
//		age = sc.nextInt();
//	}

	public void selectInfo() {

		Scanner sc = new Scanner(System.in);

		System.out.println("======================");
		System.out.print("이름을 입력해 주세요 : ");
		name = sc.nextLine();
		System.out.print("======================");
		System.out.println();

		System.out.println("================================");
		System.out.print("전화번호를 입력해 주세요 : ");
		phone = sc.nextLine();
		System.out.print("===============================");
		System.out.println();

		System.out.println("=====================");
		System.out.print("나이를 입력해 주세요 : ");
		age = sc.nextInt();
		System.out.print("=====================");
		System.out.println();

		do {

			System.out.println("====================");
			System.out.println("| 1. 입력정보 확인");
			System.out.println("| 2. 정보 수정");
			System.out.println("| 9. 종료");
			System.out.println("====================");
			System.out.printf("\n");
			System.out.print("메뉴 번호를 선택해 주세요 > ");

			int code = sc.nextInt();

			switch (code) {

			case 1:
				System.out.println();
				System.out.println("저장된 이름은 : " + name);
				System.out.println("저장된 번호는 : " + phone);
				System.out.println("저장된 나이는 : " + age);

				System.out.println();

				break;

			case 2:

				// 값을 수정할때는 기존값을 덮어씌우면 된다.
				System.out.println("기존의 저장된 이름은 : " + name);
				System.out.print("수정할 이름을 입력해 주세요 : ");
				// 기존의 값을 날려버림
				sc.nextLine();
				name = sc.nextLine();
				System.out.println("수정된 이름은 : " + name);
				System.out.println();

				System.out.println("기존에 저장된 번호는 : " + phone);
				System.out.print("수정할 전화번호를 입력해 주세요 : ");
				phone = sc.nextLine();
				System.out.println("수정된 전화번호는 : " + phone);
				System.out.println();

				System.out.println("기존에 저장된 나이는 : " + age);
				System.out.print("수정할 나이를 입력해 주세요 : ");
				age = sc.nextInt();
				System.out.println("수정된 이름은 : " + age);
				System.out.println();

				break;

			case 9:
				System.out.println();
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			default:

				System.out.println();
				System.out.println("올바른 값을 입력하세요.");
				System.out.println();

				break;

			}

		} while (true);
	}

}
