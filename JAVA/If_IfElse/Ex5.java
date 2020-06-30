import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.println("첫번째 숫자 > ");
		a = sc.nextInt();

		System.out.println("두번째 숫자 > ");
		b = sc.nextInt();

		System.out.println("세번째 숫자 > ");
		c = sc.nextInt();

		if (c == 1) {
			System.out.println(a + b);
		} else if (c == 2) {
			System.out.println(a - b);
		} else if (c == 3) {
			System.out.println(a * b);
		} else if (c == 4) {
			System.out.println(a / b);
		} else {
			System.out.println("올바른 숫자를 입력하세요");
		}

	}

}
