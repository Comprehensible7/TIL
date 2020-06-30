
public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;

		while (num < 100) {
			num++;

			// 짝수인지 판단하는 조건문
			// 짝수일경우 continue하라는 조건문
			// 짝수를 제외하고 홀수만 출력된다
			if (num % 2 == 0) {
				continue;
			}
			System.out.println("num = " + num);
		}

	}

}
