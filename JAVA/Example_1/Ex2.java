import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// �ʱ�ȭ �� ����
		int a, b, sum = 0;

		System.out.print("ù��° ���� �Է� : ");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		b = sc.nextInt();

		if (a > b) {
			int sub = a;
			a = b;
			b = sub;
		}
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "���� " + b + "�� �� " + sum);
	}

}
