import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// �ִ� �״�� ��� �� print�� ���
		System.out.print("ù��° ���ڸ� �Է� �ϼ��� > ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���ڸ� �Է� �ϼ��� > ");
		int num2 = sc.nextInt();

		int num3 = num1 + num2;

		System.out.println("�� ���� ���� : " + num3 + " �Դϴ�");
		
		System.out.println(32%3);
		System.out.println(32/3);
		
		/*
		 * int a = sc.nextInt();
		 * 
		 * int b = sc.nextInt();
		 * 
		 * int c = sc.nextInt();
		 * 
		 * int d = sc.nextInt();
		 * 
		 * int e = sc.nextInt();
		 * 
		 * int f = sc.nextInt();
		 * 
		 * System.out.println(a + b - c) * d / e % f;
		 */
	}

}
