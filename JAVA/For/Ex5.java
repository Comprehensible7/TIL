import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ö���� ���Կ��� ������ �����Ͽ���. 
		 * ������ ���ݰ� ö���� ������ �ݾ��� �Է� �޾� 
		 * ���ҿ� �ʿ��� 5������, ���� ��, 5õ����, õ������
		 * �ּ� ������ ������ �ݾ� ���Ͽ� ����Ͻÿ�.
		 * 
		 * ���� �� �������� ȭ���� ��ǰ������ �Է��ϼ��� : 
		 * 123540 123540���� 5������ 2��, ������ 2��, 5õ���� 0��, õ���� 3����
		 * �����ϰ� 540���� �����ϴ�. �̷��� �˴ϴ�.
		 */
		
		Scanner input = new Scanner(System.in);
		
		int price, n50, n10, n5, n1, rest;
		System.out.println("��ǰ ���� > ");
		price = input.nextInt();

		// �����ݾ�
		rest = price;
		
		// ����ݾ�
		
		// ������ ���
		n50 = rest / 50000;
		// ������ �ݾ��� ���
		rest = rest % 50000;
		
		n10 = rest / 10000;
		rest = rest % 10000;
		
		n5 = rest / 5000;
		rest = rest % 5000;
		
		n1 = rest / 1000;
		rest = rest % 1000;
		
		System.out.println(price + " �� ");
		System.out.println(" 5������ " + n50 + " �� ");
		System.out.println(" 1������ " + n10 + " �� ");
		System.out.println(" 5õ���� " + n5 + " �� ");
		System.out.println(" 1õ���� " + n1 + " ���� �����ϰ� ");
		System.out.println(rest + " ���� �����ϴ� ");
	}

}
