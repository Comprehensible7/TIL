import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 값을 입력하세요 > ");

		int num1 = sc.nextInt();
		System.out.println("num1 에 대입할 값 : " + num1 + "\n");

		System.out.print("두번째 값을 입력하세요 > ");

		int num2 = sc.nextInt();
		System.out.println("num2 에 대입할 값 : " + num2);

		System.out.println();

		System.out.println(" -- 교환 전 -- ");
		System.out.println("num1 의 값 : " + num1);
		System.out.println("num2 의 값 : " + num2 + "\n");

		// 임시변수
		int temp = 0;

		// 임시 변수를 이용한 값 변환 진행
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("-- 교환 후 --");
		System.out.println("num1 의 값 : " + num1);
		System.out.println("num2 의 값 : " + num2);
	}

}
