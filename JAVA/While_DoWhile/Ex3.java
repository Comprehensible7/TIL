import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			Scanner sc = new Scanner(System.in);

			System.out.println("첫번째 정수입력(-1 종료) > ");
			int a = sc.nextInt();

			System.out.println("두번째 정수입력(-1 종료) > ");
			int b = sc.nextInt();

			System.out.println("세번째 정수입력(-1 종료) > ");
			int c = sc.nextInt();

			System.out.println("네번째 정수입력(-1 종료) > ");
			int d = sc.nextInt();

			int sum = a + b + c + d;

			if (sum < 0) {
				System.out.println("종료");
				break;

			}

			System.out.println(">> 현재까지 입력된 정수의 합 : " + sum);
			break;

		} while (true);

	}

}