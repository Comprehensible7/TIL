import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int slt = 0; // �� ���� ��
		int curr = 0; // ȯ�� �� ����

		do {
			System.out.println("�� ���� �ݾ� �Է� : ");
			slt = sc.nextInt();

			// ������ ������ �� / 1000.0
			double a = slt / 1000.0;
			// ȯ�� �� ���ó༮�� ����ϰ� ���پ���
			double b = 0.0;

			// �������� �� ��� break ó��
			if (slt < 0) {
				System.out.println("Ʋ������ �Է��ϼ̽��ϴ�.");
				break;

			} else {
				System.out.println("ȯ���� ȭ�� (1 : �޷�, 2 : ��ȭ, 3 : ���� : )");
				curr = sc.nextInt();
				switch (curr) {

				case 1:
					b = a * 0.82;
					System.out.println(slt + " ���� " + b + " �޷� ");
					break;

				case 2:
					b = a * 88.24;
					System.out.println(slt + " ���� " + b + " �� ");
					break;

				case 3:
					b = a * 0.78;
					System.out.println(slt + " ���� " + b + " ���� ");
					break;

				default:
					System.out.println("�߸� �Է��Ͽ����ϴ�.");
					break;
				}
			}

			// �ݺ��� ����
		} while (false);

	}

}
