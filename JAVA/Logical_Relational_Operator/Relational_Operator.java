import java.util.Scanner;

public class Relational_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���迬����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��� �ּ��� > ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��� �ּ��� > ");
		int num2 = sc.nextInt();
		
		
		boolean b1 = num1 > num2;
		boolean b2 = num1 >= num2;
		boolean b3 = num1 < num2;
		boolean b4 = num1 <= num2;
		boolean b5 = num1 == num2;
		boolean b6 = num1 != num2;
		
		
		System.out.println("ũ�� : " + b1);
		System.out.println("ũ�ų� ���� : " + b2);
		System.out.println("�۴� : "+ b3);
		System.out.println("�۰ų� ���� : " + b4);
		System.out.println("���� : " + b5);
		System.out.println("���� �ʴ� : " + b6);
		
		/*
		 * System.out.println(num1 > num2); System.out.println(num1 >= num2);
		 * System.out.println(num1 < num2); System.out.println(num1 <= num2);
		 * System.out.println(num1 == num2); System.out.println(num1 != num2);
		 */
	}

}
