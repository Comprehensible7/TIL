import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = 0; // do �ۿ����� ����ϱ� ���� ������
		// double num = 0;

		do {
			System.out.println("100 �̻��� ������ �Է��ϼ��� : ");
			num = sc.nextInt();
			// num = sc.nextDouble();

		} while (num < 100); // ���� ���ö����� �ݺ� ����
		System.out.println(num + "-> 100 �̻� ���� �Է� �Ϸ�!");
	}

}
