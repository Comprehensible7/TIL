import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// ���� �ʱ�ȭ
		int count = 0;

		// �ݺ��� ����
		while (true) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();

			// 0�϶� �� ���� ���
			if (num == 0) {
				break;

			// 3�� ����϶� ī��Ʈ ����
			} else if (num % 3 == 0) {
				count++;
			}
		}

		System.out.println("3�� ��� ���� : " + count);
	}
}
