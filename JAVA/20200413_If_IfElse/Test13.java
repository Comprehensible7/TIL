import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������ �Է��� �ּ��� > ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if ((num % 3 == 0) && (num % 9 != 0)) {
			System.out.println("�ش� ���ڴ� 3�� ����̸鼭 9�� ����� �ƴϴ�.");
		} else {
			System.out.println("�� ���� ����Դϴ�.");
		}

	}

}
