
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원 배열의 선언과 생성
		// 수학에서 말하는 행 열의 개념임
		// 총 15번을 반복한다
		int[][] iArrays = new int[3][5];

		// 배열의 length 속성을 이용하여 2차 배열을 순회하면서 값을 초기화
		int initVal = 0;
		System.out.println("iArrays.length > " + iArrays.length + "\n");

		// 바깥에 있는 포문은 전체를 보는것
		// 앞부분이 배열의 크기 [3]을 나타냄
		// i는 0~2까지 0, 1, 2
		for (int i = 0; i < iArrays.length; i++) {
			// 내부에 있는 포문은 내부를 보는것
			// 뒤쪽에 있는 횟수만큼의 길이가 나옴 [5]
			// j는 0~4까지 0, 1, 2, 3, 4
			for (int j = 0; j < iArrays[i].length; j++) {
				// 				반복시 1씩 증가함
				iArrays[i][j] = initVal++;

			}
		}

		// 2차 배열을 순회하면서 값을 출력
		for (int i = 0; i < iArrays.length; i++) {
			for (int j = 0; j < iArrays[i].length; j++) {
				System.out.print("[" + i + "][" + j + "]:" + iArrays[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
