import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ��� : ");
		int num = sc.nextInt();

		int fac = 1;
		for (int i = num; i > 0; i--) {
			fac *= i;
			
			// for�� ���ο� ����� �ϸ� �ݺ�Ƚ����ŭ ��µ�
			System.out.println(fac);
			
		}
		// ����� 1���� ����
		// System.out.println(fac);

	}

}
