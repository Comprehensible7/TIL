import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			System.out.println("100 �̻��� ������ �Է��ϼ��� > ");

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			if (num >= 100) {
				System.out.println("100 �̻� ���� �Է� �Ϸ�!");
				break;
			} else {
				System.out.println("�ٽ� �Է�");
			}

		} while (true);

	}

}
