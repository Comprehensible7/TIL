import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� �Է¹޾ƿ� ��������
		int number;

		// �� ���� �޾ƿ� ������ �ʱ�ȭ
		int res = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ũ�⸦ �Է� �ϼ��� : ");
		// �迭�� ũ�⸦ �Է��Ѵ�
		number = sc.nextInt();

		// �Է��� ��ŭ�� �迭���� ��������
		int[] arr = new int[number];
		for (int i = 0; i < number; i++) {

			// ������ i����ŭ ��µȴ�.
			System.out.print(i + "��° ���� �Է� �ϼ��� : ");
			// �Է¹��� �迭 ��
			arr[i] = sc.nextInt();

			// ����
			res += arr[i];
		}

		// �Է��Ͽ��� ���� ������ ����Ѵ�
		System.out.print("�迭 ����� �� ���� : " + res);
	}

}
