package member.manager;

import java.util.Scanner;

import member.vo.Ex2_1;

/*equals 함수는 값이 같을 경우에 true를 다를경우에 false를 반환해주는 함수	
if( aaa.equals(bbb)) {
	
}
*/

public class Ex2_Manager {

	Ex2_1 m = new Ex2_1();

	public void selectInfo() {

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("====================");
			System.out.println("| 1. 예약");
			System.out.println("| 2. 조회");
			System.out.println("| 3. 전체출력");
			System.out.println("| 4. 프로그램 종료");
			System.out.println("====================");
			System.out.printf("\n");
			System.out.print("메뉴 번호를 선택해 주세요 > ");

			int code = sc.nextInt();

			switch (code) {

			case 1:

				System.out.println("======================");
				System.out.print("이름을 입력해 주세요 : ");
				sc.nextLine();
				
				String name = sc.nextLine();
				m.setName(name);
				
				System.out.print("======================");
				System.out.println();

				System.out.println("================================");
				System.out.print("차번호를 입력해 주세요 : ");
				// sc.nextLine();
				
				String car_num = sc.nextLine();
				m.setCar_num(car_num);
				
				System.out.print("===============================");
				System.out.println();

				System.out.println("=====================");
				System.out.print("전화번호를 입력해 주세요 : ");
				// sc.nextLine();
				
				String phone = sc.nextLine();
				m.setPhone(phone);
				
				System.out.print("=====================");
				System.out.println();

				System.out.println("=====================");
				System.out.print("위치를 입력해 주세요 : ");
				// sc.nextLine();
				
				String position = sc.nextLine();
				m.setPosition(position);
				
				System.out.print("=====================");
				System.out.println();

				break;

			case 2:

				System.out.println("=====================");
				System.out.print("전화번호를 입력해 주세요 : ");
				
				sc.nextLine();
				phone = sc.nextLine();
				
				System.out.print("=====================");
				System.out.println();

				if (phone.equals(phone)) {
					System.out.println();
					System.out.println("이름 : " + m.getName());
					System.out.println("차번호 : " + m.getCar_num());
					System.out.println("전화번호 : " + m.getPhone());
					System.out.println("위치 : " + m.getPosition());

					System.out.println();
				} else {
					System.out.println("검색결과가 없습니다.");
				}

				break;

			case 3:

				System.out.println();
				System.out.println("이름 : " + m.getName());
				System.out.println("차번호 : " + m.getCar_num());
				System.out.println("전화번호 : " + m.getPhone());
				System.out.println("위치 : " + m.getPosition());

				System.out.println();

				break;

			case 4:
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
