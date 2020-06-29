
public class Ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 합계 값
		int sum = 0;

		// 증가 값
		int n = 0;

		while (true) {
			// 증가하는 값
			++n;

			// 합계 + 증가 값
			sum += n;

			// sum이 5000을 넘을경우 break 실행
			if (sum > 5000) {
				break;
			}
		}

		System.out.println("1 ~ " + n + "까지의 합계 : " + sum);

	}

}
