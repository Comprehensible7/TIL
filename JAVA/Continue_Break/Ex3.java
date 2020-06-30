
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0부터 3까지, 증감식
		for (int i = 0; i < 4; i++) {
			// j는 3부터 i값까지 감소 3 -> 0
			for (int j = 3; j > i; j--) {
				// 공백 출력
				System.out.print(" ");
			}
			// k = 0부터 실행, k는 i보다 작거나 같다
			// 0 -> 3, 증감식, 별의갯수 증가
			for (int k = 0; k <= i; k++) {
				System.out.print("*");

			}

			System.out.println();

		}

	}
}
