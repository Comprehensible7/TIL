
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭 ����... 10 20 30 // 40 50 60
		int[][] arys = { { 10, 20, 30 }, { 40, 50, 60 } };

		// i -> �պκ� �迭...
		for (int i = 0; i < arys.length; i++) {
			// k -> �޺κ� �迭...
			for (int k = 0; k < arys[i].length; k++) {
					// �迭�� ���...
					System.out.print(arys[i][k] + " ");
			}
			System.out.println();
		}

	}

}
