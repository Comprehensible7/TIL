package member.vo;

import java.util.Scanner;

public class Ex1_1 {

	private String id;
	private String pw;
	private String name;

	public void selectInfo() {

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("====================");
			System.out.println("| 1. 등록");
			System.out.println("| 2. 출력");
			System.out.println("| 3. 프로그램 종료");
			System.out.println("====================");
			System.out.printf("\n");
			System.out.print("메뉴 번호를 선택해 주세요 > ");

			int code = sc.nextInt();

			switch (code) {

			case 1:

				System.out.print("아이디를 입력해 주세요 : ");
				sc.nextLine();
				id = sc.nextLine();

				System.out.print("비밀번호를 입력해 주세요 : ");
				// sc.nextLine();
				pw = sc.nextLine();

				System.out.print("이름을 입력해 주세요 : ");
				// sc.nextLine();
				name = sc.nextLine();

				break;

			case 2:

				System.out.println();
				System.out.println("id : " + id);
				System.out.println("pw : " + pw);
				System.out.println("이름 : " + name);

				System.out.println();

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

}
