
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �⺻�迭
		int[] num = { 29, 37, 12, 45, 60 };

		// �迭 �� �߿��� i�� 45�� ���� �����ϰ� ����Ѵ�
		// �ε����� 3�� ���� �����ϱ� ���ؼ� �Ʒ��� ���� �Է��Ѵ�
		for (int i = 0; i < num.length; i++) {
			if (i == 3) {
				continue;
			}
			System.out.print(num[i] + " ");
		}

	}

}
