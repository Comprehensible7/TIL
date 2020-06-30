import java.util.Scanner;

// 사용자로부터 선택이 가능한 메뉴를 출력하는 코드를 작성해 보세요
// 프로그램이 시작되면 메뉴가 출력이 되고
// 사용자가 메뉴의 번호를 선택하면 해당 메뉴의 기능이 동작되는 코드
// 잘못된 번호의 메뉴를 선택하면 잘못입력하셨습니다. 다시입력해주세요 문구를 출력하고 다시 메뉴를 보여준다.

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			System.out.println("====================");
			System.out.println("1. HelloWorld 출력");
			System.out.println("2. 구구단 출력");
			System.out.println("9. 종료");
			System.out.println("====================");
			System.out.printf("\n");
			System.out.println("메뉴 번호를 선택해 주세요 > ");

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("HelloWorld");
				break;

			case 2:
				for (int i = 1; i <= 9; i++) {
					for (int k = 1; k <= 9; k++) {
						System.out.println(i + "*" + k + "=" + i * k);
					}
				}
				break;

			case 9:
				// 종료하는 코드
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;

			}

		} while (true);
		// 조건식의 부분 -> 결과적으로 true 혹은 false를 반환

	}

}
