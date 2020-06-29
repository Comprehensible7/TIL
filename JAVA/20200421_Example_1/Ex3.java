public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0; // 합계 값
		int b = 0; // 증가 값

		// 조건식에 해당하는 값이 나오기 전까지 진행
		while (true) {

			++b;
			// 다음 값 바로 더하기 위한 증가식
			sum += b;

			// 5000이 넘을경우 break 실행
			if (sum > 5000) {
				break;
			}

		}
		System.out.println("1 ~ " + b + " 까지의 합 : " + sum);

	}

}
