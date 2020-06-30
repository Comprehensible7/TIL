import java.util.Random;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 랜덤 생성
		Random ran = new Random();

		// 정수를 받아온다
		System.out.print("정수를 입력하세요 > ");
		int num = sc.nextInt();

		// 랜덤값을 받아온다 1 ~ 50
		int num2 = ran.nextInt(50) + 1;
		// 입력한 랜덤값이 출력됨
		System.out.print("무작위 숫자가 생성되었습니다 > " + num2);
		System.out.println();

		while (true) {

			// 만약 랜덤값이 입력값보다 클경우
			if (num2 > num) {
				System.out.println("결과는 > Up");
				// 만약 랜덤값이 입력값보다 작을경우
			} else if (num2 < num) {
				System.out.println("결과는 > Down");
				// 입력값이 일치할 경우
			} else {
				System.out.println("결과는 > Good");

			}
			break;
		}
	}
}
