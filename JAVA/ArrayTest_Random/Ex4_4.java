import java.util.Random;
import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();

		Scanner sc = new Scanner(System.in);

		// 1 이상 50 이하의 랜던함 숫자를 받아올 변수를 생성
		int comNum = r.nextInt(50) + 1;

		// 맞출때 까지 입력하기 위해서 While문을 사용한다
		while (true) {

			// userNum은 사용자가 입력한 값
			int userNum = sc.nextInt();

			// userNum이 comNum보다 작을경우
			if (userNum < comNum) {
				System.out.println("UP");

				// userNum이 comNum보다 클경우
			} else if (userNum > comNum) {
				System.out.println("DOWN");

				// 값이 일치했을경우
			} else {
				System.out.println("GOOD");

				// 반복문 종료
				break;
			}
		}
	}

}
