public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0; // �հ� ��
		int b = 0; // ���� ��

		// ���ǽĿ� �ش��ϴ� ���� ������ ������ ����
		while (true) {

			++b;
			// ���� �� �ٷ� ���ϱ� ���� ������
			sum += b;

			// 5000�� ������� break ����
			if (sum > 5000) {
				break;
			}

		}
		System.out.println("1 ~ " + b + " ������ �� : " + sum);

	}

}
