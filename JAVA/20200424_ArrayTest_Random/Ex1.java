
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 생성... 10 20 30 // 40 50 60
		int[][] arys = { { 10, 20, 30 }, { 40, 50, 60 } };

		// i -> 앞부분 배열...
		for (int i = 0; i < arys.length; i++) {
			// k -> 뒷부분 배열...
			for (int k = 0; k < arys[i].length; k++) {
					// 배열값 출력...
					System.out.print(arys[i][k] + " ");
			}
			System.out.println();
		}

	}

}
