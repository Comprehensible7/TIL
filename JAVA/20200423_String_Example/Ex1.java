
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본배열
		int[] num = { 10, 20, 30, 40, 50, 60 };

		// 배열 값 중에서 i는 40인 값을 출력한다
		// 인덱스의 값을 출력할때는 아래와 같이 입력
		for (int i = 0; i < num.length; i++) {
			if (i == 3) {
				System.out.println(num[i]);
				break;
			}
		}

	}

}
