
public class Ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �հ� ��
		int sum = 0;

		// ���� ��
		int n = 0;

		while (true) {
			// �����ϴ� ��
			++n;

			// �հ� + ���� ��
			sum += n;

			// sum�� 5000�� ������� break ����
			if (sum > 5000) {
				break;
			}
		}

		System.out.println("1 ~ " + n + "������ �հ� : " + sum);

	}

}
