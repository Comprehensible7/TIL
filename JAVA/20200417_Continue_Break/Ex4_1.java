
public class Ex4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ݺ����� �������� ����ϴ� �Ϲ����� �ݺ�����
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {

				// �������� ���� ���� ¦���� ���
				if (i % 2 == 0) {
					// 6~9������ ���ڴ� �н�~
					if (j > 5) {
						continue;
					}
				}
				// �������� ���� ���� Ȧ���� ���
				else {
					// 1~5������ ���ڴ� �н�~
					if (j <= 5) {
						continue;
					}
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.printf("\n");
		}

	}

}
