
public class Ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 여기서 i는 세로 줄 수를 의미한다.
		for (int i = 1; i <= 4; i++) {		// 1, 2, 3, 4

			// j는 가로 줄 수를 의미한다.
			for (int j = 4; j >= 1; j--) {	// 4, 3, 2, 1

				// 공백을 출력해줘야 하는 조건과
				if (j > i) {				// 4/1, 3/1, 2/1
					System.out.print(" ");

					// 별을 출력해줘야 하는 조건
				} else {					// 1/1
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
