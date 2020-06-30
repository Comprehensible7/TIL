import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 있는 그대로 출력 시 print를 사용
		System.out.print("첫번째 숫자를 입력 하세요 > ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자를 입력 하세요 > ");
		int num2 = sc.nextInt();

		int num3 = num1 + num2;

		System.out.println("두 수의 합은 : " + num3 + " 입니다");
		
		System.out.println(32%3);
		System.out.println(32/3);
		
		/*
		 * int a = sc.nextInt();
		 * 
		 * int b = sc.nextInt();
		 * 
		 * int c = sc.nextInt();
		 * 
		 * int d = sc.nextInt();
		 * 
		 * int e = sc.nextInt();
		 * 
		 * int f = sc.nextInt();
		 * 
		 * System.out.println(a + b - c) * d / e % f;
		 */
	}

}
