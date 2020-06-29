
import java.util.Scanner;

public class CalcMain {
	
	public static void main(String[] args) {
		Calc c = new Calc();
		Scanner sc = new Scanner(System.in);
		c.printMenu();
		int choice = sc.nextInt();
//		System.out.print("첫 번째 값 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두 번째 값 : ");
//		int num2 = sc.nextInt();
		int[] arr = c.test();
		int num1 = arr[0];
		int num2 = arr[1];
		
		switch (choice) {
		case 1:
			System.out.println(c.sum(num1, num2));
			break;
		case 2:
			System.out.println(c.minus(num1, num2));
			break;
		case 3:
			System.out.println(c.multiply(num1, num2));
			break;
		case 4:
			System.out.println(c.dividing(num1, num2));
			break;
		}
	}
}
