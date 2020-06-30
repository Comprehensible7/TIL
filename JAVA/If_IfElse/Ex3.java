import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.println("첫번째 값 > ");
		a = sc.nextInt();

		System.out.println("두번째 값 > ");
		b = sc.nextInt();

		System.out.println("세번째 값 > ");
		c = sc.nextInt();

		double avg = (a + b + c) / 3;

		if (avg >= 70) {
			if ((a > 40) && (b > 40) && (c > 40)) {
				System.out.println("합격 입니다");
			} else {
				System.out.println("과락 입니다");
			}
		} else {
			System.out.println("불합격 입니다");
		}
	}

}
