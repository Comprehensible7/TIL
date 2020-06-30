import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 갯수 초기화
		int count = 0;

		// 반복문 실행
		while (true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();

			// 0일때 총 개수 출력
			if (num == 0) {
				break;

			// 3의 배수일때 카운트 증가
			} else if (num % 3 == 0) {
				count++;
			}
		}

		System.out.println("3의 배수 개수 : " + count);
	}
}
