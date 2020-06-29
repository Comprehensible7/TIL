import java.util.Scanner;

public class Relational_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 관계연산자
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력해 주세요 > ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력해 주세요 > ");
		int num2 = sc.nextInt();
		
		
		boolean b1 = num1 > num2;
		boolean b2 = num1 >= num2;
		boolean b3 = num1 < num2;
		boolean b4 = num1 <= num2;
		boolean b5 = num1 == num2;
		boolean b6 = num1 != num2;
		
		
		System.out.println("크다 : " + b1);
		System.out.println("크거나 같다 : " + b2);
		System.out.println("작다 : "+ b3);
		System.out.println("작거나 같다 : " + b4);
		System.out.println("같다 : " + b5);
		System.out.println("같지 않다 : " + b6);
		
		/*
		 * System.out.println(num1 > num2); System.out.println(num1 >= num2);
		 * System.out.println(num1 < num2); System.out.println(num1 <= num2);
		 * System.out.println(num1 == num2); System.out.println(num1 != num2);
		 */
	}

}
