import java.util.Scanner;

// ����ڷκ��� ������ ������ �޴��� ����ϴ� �ڵ带 �ۼ��� ������
// ���α׷��� ���۵Ǹ� �޴��� ����� �ǰ�
// ����ڰ� �޴��� ��ȣ�� �����ϸ� �ش� �޴��� ����� ���۵Ǵ� �ڵ�
// �߸��� ��ȣ�� �޴��� �����ϸ� �߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ��� ������ ����ϰ� �ٽ� �޴��� �����ش�.

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			System.out.println("====================");
			System.out.println("1. HelloWorld ���");
			System.out.println("2. ������ ���");
			System.out.println("9. ����");
			System.out.println("====================");
			System.out.printf("\n");
			System.out.println("�޴� ��ȣ�� ������ �ּ��� > ");

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("HelloWorld");
				break;

			case 2:
				for (int i = 1; i <= 9; i++) {
					for (int k = 1; k <= 9; k++) {
						System.out.println(i + "*" + k + "=" + i * k);
					}
				}
				break;

			case 9:
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
