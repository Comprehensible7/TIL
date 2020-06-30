package cal_Manager;

import java.util.Scanner;

import cal_Vo.Calculator;

//[접근 지정자] [클래스 이름] (매개변수)
//		생성자 body

public class MainClass_Custom_Cal {

	// Calculator의 값을 사용하기위해 cal로 선언해주고 생성자를 생성해준다
	Calculator cal = new Calculator();
	// 사용자에게 값을 받아오기위한 스캐너 선언
	Scanner sc = new Scanner(System.in);
	// 값을 입력받을 변수 선언
	int num1, num2;

	public void selectInfo() {

		ins_Num();

		do {

			// 생성한 메서드내용 중 목록을 불러온다
			printMenu();

			System.out.print("메뉴 번호를 선택해 주세요 > ");
			// 스위치문 입력받을 코드를 위한 변수선언
			int code = sc.nextInt();

			switch (code) {

			case 1:

				plus();

				break;

			case 2:

				minus();

				break;

			case 3:

				multiple();

				break;

			case 4:

				division();

				break;

			case 5:

				left();

				break;

			case 6:

				printAll_Res(cal);

				break;

			case 9:
				System.out.println("계산을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("올바른 값을 입력하세요.");
				break;
			}

			System.out.println();

		} while (true);

	}

	public void printMenu() {

		System.out.println("====================");
		System.out.println("1. Sum 출력");
		System.out.println("2. Minus 출력");
		System.out.println("3. Multiple 출력");
		System.out.println("4. Division 출력");
		System.out.println("5. Left 출력");
		System.out.println("6. 전체 출력");
		System.out.println("9. 종료");
		System.out.println("====================");
		System.out.printf("\n");

	}

	public void printAll_Res(Calculator cal) {

		System.out.println();

		System.out.println("----------");
		System.out.println("| + : " + cal.getSum());
		System.out.println("----------");

		System.out.println("----------");
		System.out.println("| - : " + cal.getMins());
		System.out.println("----------");

		System.out.println("----------");
		System.out.println("| * : " + cal.getMulti());
		System.out.println("----------");

		System.out.println("----------");
		System.out.println("| / : " + cal.getDiv());
		System.out.println("----------");

		System.out.println("----------");
		System.out.println("| % : " + cal.getLef());
		System.out.println("----------");

	}

	public void ins_Num() {

		System.out.println();
		System.out.print("| 첫번째 정수를 입력해 주세요 | : ");
		num1 = sc.nextInt();

		System.out.print("| 두번째 정수를 입력해 주세요 | : ");
		num2 = sc.nextInt();
		System.out.println();

	}

	public void plus() {

		System.out.println("----------");
		System.out.println("| + : " + cal.plus(num1, num2));
		System.out.println("----------");

	}

	public void minus() {

		System.out.println("----------");
		System.out.println("| - : " + cal.minus(num1, num2));
		System.out.println("----------");
	}

	public void multiple() {

		System.out.println("----------");
		System.out.println("| * : " + cal.multiple(num1, num2));
		System.out.println("----------");
	}

	public void division() {

		System.out.println("----------");
		System.out.println("| / : " + cal.division(num1, num2));
		System.out.println("----------");
	}

	public void left() {

		System.out.println("----------");
		System.out.println("| % : " + cal.left(num1, num2));
		System.out.println("----------");
	}

}
