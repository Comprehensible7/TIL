import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� �Է¹��� ����
		int num;

		// ����
		int res = 0;

		Scanner sc = new Scanner(System.in);

		// �迭ũ�� �Է�
		System.out.print("�迭�� ũ�⸦ �Է� > ");
		num = sc.nextInt();
		System.out.println();

		// �Է��� ���� �迭�� ����
		int[] ary = new int[num];
		
		// �Է¹��� ��(�迭 ��) ��ŭ ���ΰ��� �Է��ϰ� ����
		for (int i = 0; i < ary.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է��ϼ��� : ");
			ary[i] = sc.nextInt();

			// ����
			res += ary[i];
		}
		System.out.println();
		System.out.print("< ���� > " + res + "\n");
		System.out.print("< ��� > " + res / num);
	}

}
