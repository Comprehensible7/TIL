import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.println("ù��° ���� > ");
		a = sc.nextInt();

		System.out.println("�ι�° ���� > ");
		b = sc.nextInt();

		System.out.println("����° ���� > ");
		c = sc.nextInt();

		if (c == 1) {
			System.out.println(a + b);
		} else if (c == 2) {
			System.out.println(a - b);
		} else if (c == 3) {
			System.out.println(a * b);
		} else if (c == 4) {
			System.out.println(a / b);
		} else {
			System.out.println("�ùٸ� ���ڸ� �Է��ϼ���");
		}

	}

}
