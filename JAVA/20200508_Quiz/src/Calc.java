
import java.util.Scanner;

public class Calc {
	
	public int[] test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° �� : ");
		int num2 = sc.nextInt();
		return new int[] {num1, num2}; 
	}
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public int dividing(int num1, int num2) {
		return num1 / num2;
	}
	
	public void printMenu() {
		System.out.println("============");
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("3. ���ϱ�");
		System.out.println("4. ������");
		System.out.println("============");
	}
}





