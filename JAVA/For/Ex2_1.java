import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� > ");
		int num = sc.nextInt();

		int fac = 1;

		for (int i = 1; num > 0; num--) {
			fac *= num;
			
			// for�� ���ο� ����� �ϸ� �ݺ�Ƚ����ŭ ��µ�
			System.out.println(fac);
		}
		// ����� 1���� ����
		// System.out.println(fac);
	}

}
