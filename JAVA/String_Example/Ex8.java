import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// ������ �迭 ����5�ΰ��� ����
		int[] a = new int[5];

		// ������ ��� �������� ���� ����
		int total = 0, avg = 0;

		// i��° �л��� ������ �Է¹޴´�
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "�� �л����� �Է� : ");
			a[i] = scan.nextInt();

			// �迭�� ���ϱ�
			total += a[i];

		}
		// �迭��� ���ϱ�
		avg = total / a.length;

		System.out.println("\n��� ���� > " + (double) avg);
		System.out.println();

		// ����̻��� �л��� ����Ѵ�
		for (int i = 0; i < a.length; i++) {
			if (avg <= a[i]) {

				System.out.println(i + 1 + "�� �л��� ���� : " + a[i]);

			}
		}

	}
}
