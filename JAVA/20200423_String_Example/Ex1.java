
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �⺻�迭
		int[] num = { 10, 20, 30, 40, 50, 60 };

		// �迭 �� �߿��� i�� 40�� ���� ����Ѵ�
		// �ε����� ���� ����Ҷ��� �Ʒ��� ���� �Է�
		for (int i = 0; i < num.length; i++) {
			if (i == 3) {
				System.out.println(num[i]);
				break;
			}
		}

	}

}
