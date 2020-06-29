import java.util.Random;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 스캐너 생성...
		Scanner sc = new Scanner(System.in);
		// 무작위 수 생성
		Random ran = new Random();
		
		// 횟수를 저장할 변수를 선언
		int count = 0;

		// 1부터 50 사이의 정수를 무작위 생성
		int num1 = ran.nextInt(50) + 1;

		// 시도 횟수로 사용할 변수 tc를 선언 
		System.out.print("시도 횟수 입력 : ");
		int tc = sc.nextInt();

		// 시도 횟수만큼의 길이를 갖는 배열을 선언, 입력한 값을 저장한다...
		int[] ary = new int[tc];

		// 입력한 시도 횟수만큼 반복을 실행...
		while (true) {
			// ~번째 시도 횟수가 출력됨
			System.out.print("1~50의 수를 입력(" + (count + 1) + "번째 시도) : ");
			// 사용자가 입력한 값을 받아온다 
			// 변수 num 선언
			int num = sc.nextInt();

			// 입력값이 50보다 클경우 또는 1보다 작을경우
			if (num > 50 || num < 1) {
				System.out.println("1~50 사이의 수를 입력하세요");
				continue;
			}

			// 배열 값은 입력값과 동일
			ary[count] = num;

			// 사용자 입력값이 무작위 수보다 작을경우
			if (num < num1) {
				System.out.println("Up");
				// 사용자 입력값이 무작위 수 보다 클경우
			} else if (num > num1) {
				System.out.println("Down");
			} else {
				// 사용자 입력값이 일치할 경우
				System.out.println();
				System.out.println("정답!");
				System.out.println("시도 횟수 : " + (count + 1));
				System.out.println();
				System.out.println("--입력한 수 목록--");
				// 사용자가 입력하였던 값을 출력한다
				for (int i = 0; i <= count; i++) {
					System.out.println(ary[i]);
				}

				break;
			}

			count++;
			// 시도횟수가 입력값을 초과했을경우
			if (count >= tc) {
				System.out.println("시도 횟수 초과!");
				break;
			}
		}
	}
}
