import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ��� ������ �ϳ� ���帱���� 
		 * 3���� ������ �Է� �޾� if���� ����Ͽ� ������������ �����Ͻÿ�. 
		 * ���� �� �������� ȭ���� 
		 * 1�� ° ���� �Է� : 34 
		 * 2�� ° ���� �Է� : 15 
		 * 3�� ° ���� �Է� : 23 
		 * 15 23 34
		 */

		// ������� �޾ƿ� ������ ����
		// temp�� �ӽ÷� ����� ������
		int a, b, c, temp;

		Scanner sc = new Scanner(System.in);

		System.out.println("ù��° �� > ");
		a = sc.nextInt();

		System.out.println("�ι�° �� > ");
		b = sc.nextInt();

		System.out.println("����° �� > ");
		c = sc.nextInt();

		// �� ������ ũ�⸦ ���ϴ� ���� �ۼ�, a,b,c ��
		// ���� �� ������� if������ �˻縦 ����
		if (b < a) {
			temp = a;
			a = b;
			b = temp;
		}
		if (c < a) {
			temp = a;
			a = c;
			c = temp;
		}
		if (c < b) {
			temp = b;
			b = c;
			c = temp;
		}
		
		// �������� ����
		System.out.println("���� ������ �Ʒ��� �����ϴ�.");
		System.out.println(a + "  " + b + "  " + c);

	}

}
