import java.util.Random;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// ���� ����
		Random ran = new Random();

		// ������ �޾ƿ´�
		System.out.print("������ �Է��ϼ��� > ");
		int num = sc.nextInt();

		// �������� �޾ƿ´� 1 ~ 50
		int num2 = ran.nextInt(50) + 1;
		// �Է��� �������� ��µ�
		System.out.print("������ ���ڰ� �����Ǿ����ϴ� > " + num2);
		System.out.println();

		while (true) {

			// ���� �������� �Է°����� Ŭ���
			if (num2 > num) {
				System.out.println("����� > Up");
				// ���� �������� �Է°����� �������
			} else if (num2 < num) {
				System.out.println("����� > Down");
				// �Է°��� ��ġ�� ���
			} else {
				System.out.println("����� > Good");

			}
			break;
		}
	}
}
