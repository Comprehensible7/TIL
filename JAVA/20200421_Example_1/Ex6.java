import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է��ϼ��� > ");

		int num1 = sc.nextInt();
		System.out.println("num1 �� ������ �� : " + num1 + "\n");

		System.out.print("�ι�° ���� �Է��ϼ��� > ");

		int num2 = sc.nextInt();
		System.out.println("num2 �� ������ �� : " + num2);

		System.out.println();

		System.out.println(" -- ��ȯ �� -- ");
		System.out.println("num1 �� �� : " + num1);
		System.out.println("num2 �� �� : " + num2 + "\n");

		// �ӽú���
		int temp = 0;

		// �ӽ� ������ �̿��� �� ��ȯ ����
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("-- ��ȯ �� --");
		System.out.println("num1 �� �� : " + num1);
		System.out.println("num2 �� �� : " + num2);
	}

}
