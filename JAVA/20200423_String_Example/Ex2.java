
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본배열
		int[] num = { 10, 8, 3, 2, 5, 4 };

		// 배열 값 중에서 i는 2인 인덱스 값을 출력한다
		// 인덱스 값이 아닌 그냥 값이 2인경우 아래와 같이 입력한다
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 2) {
				System.out.println(num[i]);
				break;
			}
		}

	}

}
