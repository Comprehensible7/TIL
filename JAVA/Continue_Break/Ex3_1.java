
public class Ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���⼭ i�� ���� �� ���� �ǹ��Ѵ�.
		for (int i = 1; i <= 4; i++) {		// 1, 2, 3, 4

			// j�� ���� �� ���� �ǹ��Ѵ�.
			for (int j = 4; j >= 1; j--) {	// 4, 3, 2, 1

				// ������ �������� �ϴ� ���ǰ�
				if (j > i) {				// 4/1, 3/1, 2/1
					System.out.print(" ");

					// ���� �������� �ϴ� ����
				} else {					// 1/1
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
