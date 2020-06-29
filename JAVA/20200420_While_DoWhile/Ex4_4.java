import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력해주세요 : ");
		int num1 = sc.nextInt();

		System.out.println("두번째 정수를 입력해주세요 : ");
		int num2 = sc.nextInt();

		int start = 1;
		int sum = 0;

		if (num2 < 0 || num2 > num1) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			while (start <= num1) {
				if (start % num2 == 0) {
					start++;
					continue;
				} else {
					sum += start;
				}
				start++;
			}
			System.out.println("합계는 : " + sum);
		}

	}

}
