import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�з��ڵ带 �Է��ϼ��� : ");

		Scanner inputValue = new Scanner(System.in);

		int code = inputValue.nextInt();

		switch (code) {

		case 1:
			System.out.println("ö���Դϴ�");
			break;

		case 2:
			System.out.println("�����Դϴ�");
			break;

		case 3:
			System.out.println("��ȸ�����Դϴ�");
			break;

		default:
			System.out.println("��Ÿ�Դϴ�");
			break;
		}
	}

}
