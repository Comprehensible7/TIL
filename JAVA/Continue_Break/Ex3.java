
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0���� 3����, ������
		for (int i = 0; i < 4; i++) {
			// j�� 3���� i������ ���� 3 -> 0
			for (int j = 3; j > i; j--) {
				// ���� ���
				System.out.print(" ");
			}
			// k = 0���� ����, k�� i���� �۰ų� ����
			// 0 -> 3, ������, ���ǰ��� ����
			for (int k = 0; k <= i; k++) {
				System.out.print("*");

			}

			System.out.println();

		}

	}
}
