import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭 ���� �Է¹��� ����
		int num;

		Scanner sc = new Scanner(System.in);

		// �迭ũ�� �Է�
		System.out.print("�迭�� ũ�⸦ �Է� > ");
		num = sc.nextInt();

		// �Է��� ���� �迭�� ����
		int[] ary = new int[num];

		// �Է¹��� ��(�迭 ��) ��ŭ ���� �Է��ϰ� ����
		for (int i = 0; i < ary.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է��ϼ��� : ");
			ary[i] = sc.nextInt();

		}

		/*
		 * for(�ʱⰪ; ���ǽ�; ������) { ���� }
		 */

		System.out.println();
		System.out.print("������� ����� > ");
		// �迭�� ���� -1��ŭ �ؾ� ������ ������, �迭�� ������ 0�̹Ƿ� i�� 0���� ũ�ų� ���ٰ� ����� ��
		for (int i = ary.length - 1; i >= 0; i--) {
			// �������� ��½���
			System.out.print(ary[i] + " ");
		}

	}

}