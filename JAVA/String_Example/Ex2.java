
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �⺻�迭
		int[] num = { 10, 8, 3, 2, 5, 4 };

		// �迭 �� �߿��� i�� 2�� �ε��� ���� ����Ѵ�
		// �ε��� ���� �ƴ� �׳� ���� 2�ΰ�� �Ʒ��� ���� �Է��Ѵ�
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 2) {
				System.out.println(num[i]);
				break;
			}
		}

	}

}
