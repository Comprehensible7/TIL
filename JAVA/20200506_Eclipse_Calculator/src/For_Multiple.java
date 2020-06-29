import java.util.Scanner;

public class For_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			System.out.println();
			System.out.println("====================");
			System.out.println("1. 구구단 출력");
			System.out.println("2. 정방향 별찍기 출력");
			System.out.println("3. 역방향 별찍기 출력");
			System.out.println("4. 배열생성");
			System.out.println("9. 종료");
			System.out.println("====================");
			System.out.printf("\n");
			System.out.print("메뉴 번호를 선택해 주세요 > ");

			Scanner sc = new Scanner(System.in);

			int code = sc.nextInt();

			switch (code) {

			case 1:
				System.out.println();

				for (int i = 1; i <= 9; i++) {
					System.out.print("[" + i + "단]\t\t  ");
				}
				System.out.println();

				for (int i = 1; i < 10; i++) {
					for (int k = 1; k < 10; k++) {
						System.out.print(k + " * " + i + " = " + (k * i) + "\t");
					}
					System.out.println();
				}
				break;

			case 2:
				System.out.println();

				// 여기서 i는 세로의 줄 수를 의미한다.
				for (int i = 0; i < 4; i++) {

					// 여기서 k는 가로의 줄 수를 의미한다.
					// 중요한 포인트는 k<=i; 조건식 부분
					for (int k = 0; k <= i; k++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				break;

			case 3:
				System.out.println();

				// 여기서 i는 세로 줄 수를 의미한다.
				for (int i = 1; i <= 4; i++) { // 1, 2, 3, 4

					// k는 가로 줄 수를 의미한다.
					for (int k = 4; k >= 1; k--) { // 4, 3, 2, 1

						// 공백을 출력해줘야 하는 조건과
						if (k > i) { // 4/1, 3/1, 2/1
							System.out.print(" ");

							// 별을 출력해줘야 하는 조건
						} else { // 1/1
							System.out.print("*");
						}
					}
					System.out.println();
				}
				break;

			case 4:
				System.out.println();
				System.out.print("배열의 크기를 입력 하세요 : ");
				int length = sc.nextInt();

				// 사용자로부터 입력받은 값, 배열 크기를 지정.
				int[] arr = new int[length];
				int sum = 0;

				for (int i = 0; i < arr.length; i++) {
					System.out.print(i + 1 + "번째 값을 입력 하세요 : ");
					arr[i] = sc.nextInt();
					sum += arr[i]; // 누적합 구하기
				}
				System.out.println();
				System.out.println("배열 요소의 총 합은 : " + sum);

				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("올바른 값을 입력하세요.");
				break;
			}

		} while (true);
	}

}
