import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("ù��° ���� �Է� > ");
		int a = sc.nextInt();

		System.out.println("�ι�° ���� �Է� > ");
		int b = sc.nextInt();

		// Ȧ���� ���� ������ ���� ����
		int sum = 0;
		
		// ù��° ���ڰ� �ι�° ���ں��� ������ üũ
		if (b < a) {
			System.out.println("Wrong");
		} else if (a < b) {
			System.out.println("Correct");
		}

		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				sum += i;
				System.out.println("Ȧ����" + i);
			}
		}
		System.out.println("Ȧ���� ��" + sum);
	}

}
