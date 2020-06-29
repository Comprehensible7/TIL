
public class Ex4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문은 구구단을 출력하는 일반적인 반복문임
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {

				// 구구단의 앞의 수가 짝수일 경우
				if (i % 2 == 0) {
					// 6~9까지의 숫자는 패스~
					if (j > 5) {
						continue;
					}
				}
				// 구구단의 앞의 수가 홀수일 경우
				else {
					// 1~5까지의 숫자는 패스~
					if (j <= 5) {
						continue;
					}
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.printf("\n");
		}

	}

}
