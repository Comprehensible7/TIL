import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 값을 입력 > ");
		int a = sc.nextInt();

		System.out.println("두번째 값을 입력 > ");
		int b = sc.nextInt();

		// 홀수의 합을 저장할 변수 지정
		int sum = 0;
		
		// 첫번째 숫자가 두번째 숫자보다 작은지 체크
		if (b < a) {
			System.out.println("Wrong");
		} else if (a < b) {
			System.out.println("Correct");
		}

		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				sum += i;
				System.out.println("홀수는" + i);
			}
		}
		System.out.println("홀수의 합" + sum);
	}

}
