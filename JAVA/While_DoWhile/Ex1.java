import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			System.out.println("==========������ ���==========");
			System.out.println("���ϴ� ���� ������ �ּ��� : ");
			System.out.println("�����Ͻ÷��� 0�� �Է��ϼ���.");
			System.out.printf("\n");

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			switch (num) {
			case 1:
				for (int i = 1; i <= 1; i++) {
					for (int k = 1; k <= 9; k++) {
						System.out.println(i + "*" + k + "=" + i * k);
					}
				}
				break;

			case 2:
				for (int i = 2; i <= 2; i++) {
					for (int k = 1; k <= 9; k++) {
						System.out.println(i + "*" + k + "=" + i * k);
					}
				}
				break;

			case 3:
				for (int i = 3; i <= 3; i++) {
					for (int k = 1; k <= 9; k++) {
						System.out.println(i + "*" + k + "=" + i * k);
					}
				}
				break;

			case 4:
				for (int i = 4; i <= 4; i++) {
					for (int k = 1; k <= 9; k++) {
						System.out.println(i + "*" + k + "=" + i * k);
					}
				}
				break;

			case 5:
				for (int i = 5; i <= 5; i++) {
					for (int k = 1; k <= 9; k++) {
						System.out.println(i + "*" + k + "=" + i * k);
					}
				}
				break;

			case 6:
				for (int i = 6; i <= 6; i++) {
					for (int k = 1; k <= 9; k++) {
						System.out.println(i + "*" + k + "=" + i * k);
					}
				}
				break;

			case 7:
				for (int i = 7; i <= 7; i++) {
					for (int k = 1; k <= 9; k++) {
						System.out.println(i + "*" + k + "=" + i * k);
					}
				}
				break;

			case 8:
				for (int i = 8; i <= 8; i++) {
					for (int k = 1; k <= 9; k++) {
						System.out.println(i + "*" + k + "=" + i * k);
					}
				}
				break;

			case 9:
				for (int i = 9; i <= 9; i++) {
					for (int k = 1; k <= 9; k++) {
						System.out.println(i + "*" + k + "=" + i * k);
					}
				}
				break;

			case 0:
				// �����ϴ� �ڵ�
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);

			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
				break;

			}

		} while (true);
		// ���ǽ��� �κ� -> ��������� true Ȥ�� false�� ��ȯ

	}

}
