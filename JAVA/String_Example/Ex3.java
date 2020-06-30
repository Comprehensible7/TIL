
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본배열
		int[] num = { 29, 37, 12, 45, 60 };

		// 배열 값 중에서 i는 45인 값을 제외하고 출력한다
		// 인덱스가 3인 값을 제외하기 위해선 아래와 같이 입력한다
		for (int i = 0; i < num.length; i++) {
			if (i == 3) {
				continue;
			}
			System.out.print(num[i] + " ");
		}

	}

}
