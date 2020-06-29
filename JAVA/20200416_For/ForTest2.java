import java.util.Scanner;

// 정수 1개를 입력받아서 1부터 입력받은 정수까지 출력하는 코드를작성하시오.
// 단, 정수가 0보다 작을 경우에는 "잘못입력하셨습니다"를 출력하시오.

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("값을 입력하세요 > ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("잘못 입력하셨습니다.");

		} else {
			// 입력한 숫자까지만 출력하게끔 변수를 입력
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}

		}

	}

}
