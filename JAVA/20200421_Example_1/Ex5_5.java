import java.util.Scanner;

public class Ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// ȭ�� ���� ����
		double won = 1000; // 1000��
		double dollar = 0.82; // 1000�� -> �޷�
		double yen = 88.24; // 1000�� -> ��ȭ
		double euro = 0.78; // 1000�� -> ����ȭ

		// ����ġ������ ����� ���� ����
		int choice;
		// �� ���� �ݾ� �Է� ���� ����
		int incur;
		// ����ġ������ ���� ����ϱ����� ����
		double outcur;

		System.out.print("�� ���� �ݾ� �Է� : ");
		incur = input.nextInt();

		// ���� 0�ϰ�� exit ����
		if (incur < 0) {
			System.out.println("�߸� �Է��߽��ϴ�.");
			System.exit(0);
		}

		// ����ġ������ ���� ������ ���� ����
		System.out.print("ȯ���� ȭ�� (1:�޷�, 2:��ȭ, 3:����ȭ) : ");
		choice = input.nextInt();

		switch (choice) {
		case 1:
			outcur = incur * dollar / won;
			System.out.println(incur + "���� " + outcur + "�޷��Դϴ�.");
			break;
		case 2:
			outcur = incur * yen / won;
			System.out.println(incur + "���� " + outcur + "���Դϴ�.");
			break;
		case 3:
			outcur = incur * euro / won;
			System.out.println(incur + "���� " + outcur + "�����Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
		}

	}

}
