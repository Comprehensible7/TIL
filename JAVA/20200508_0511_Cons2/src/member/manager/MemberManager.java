package member.manager;

import java.util.Scanner;

import member.vo.Member;

// 기능을 담당하는쪽
public class MemberManager {

	// 여러명의 값을 받아올 배열 생성
	// 여기에 생성 시 클래스 전체에서 사용가능하다.
	// 만약 생성자쪽에서 작성하였을 시 생성자 내부에서만 사용이 가능하다.
	Member[] memberArray = new Member[10];

	// 지금 저장된 회원의 수, memberArray의 인덱스
	int count = 0;

	// 생성자
	public void selectInfo() {

//		한명의 정보가 유지된다.
//		Member m = new Member();

		do {

			printMenu();

			Scanner sc = new Scanner(System.in);

			System.out.print("메뉴 번호를 선택해 주세요 > ");
			int code = sc.nextInt();

			switch (code) {

			case 1:

				// 회원정보가 10명이상 입력이 되었는지 확인
				if (count == 10) {
					System.out.println("회원정보를 10개 까지만 등록 할 수 있습니다.");
					break;
				} 

					// Vo클래스를 객체화
					// 정보가 저장된것을 출력하는 기능에서 보여주기 위해서...
					// 반복할때마다 새로운 사람의 정보가 생성된다.
					// 회원정보를 입력할때 저장할 공간을 생성한다.
					Member m = new Member();

					System.out.print("이름을 입력해 주세요 : ");
					sc.nextLine();

					String name = sc.nextLine();
					m.setName(name);

					System.out.print("나이를 입력해 주세요 : ");
					// sc.nextLine();

					int age = sc.nextInt();
					m.setAge(age);

					System.out.print("전화번호를 입력해 주세요 : ");

					sc.nextLine();
					String phone = sc.nextLine();
					m.setPhone(phone);

					memberArray[count] = m;

					// 입력할때마다 카운트가 증가함
					count++;

					break;
				
			case 2:

				// 회원정보가 등록된 것이 있을때만 출력
				if (count == 0) {
					System.out.println("등록된 회원정보가 없습니다.");
					break;
				} 

					// 출력해야하는 정보는 memberArray에 들어있다.
					for (int i = 0; i < count; i++) {
						// printInfo를 출력하면서 MemberArray[i]의 값을 받아온다
						printInfo(memberArray[i]);
					}

					break;
				
				
			case 3:
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

	public void printMenu() {

		System.out.println("====================");
		System.out.println("| 1. 입력하기");
		System.out.println("| 2. 출력하기");
		System.out.println("| 3. 프로그램 종료");
		System.out.println("====================");
		System.out.printf("\n");

	}

	public void printInfo(Member member) {
		System.out.println();
		System.out.println("회원의 이름은 : " + member.getName());
		System.out.println("회원의 나이는 : " + member.getAge());
		System.out.println("회원의 전화번호는 : " + member.getPhone());
		System.out.println();
	}

}