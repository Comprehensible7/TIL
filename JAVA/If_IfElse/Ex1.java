import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Score? > ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num >= 50) {
			System.out.println("50 �̻��Դϴ�");
		} else {
			System.out.println("50 �̸��Դϴ�");
		}

	}

}
