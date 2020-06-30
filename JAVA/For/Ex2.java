import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("팩토리얼 계산 >");
		int a = sc.nextInt();

		// 초기값 설정
		int factorial = 1;

		for (int i = 1; i <= a; i++) {

			factorial = factorial * i;

			System.out.println(a + "! = " + factorial);

		}

	}

}
