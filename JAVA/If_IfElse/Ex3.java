import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.println("ù��° �� > ");
		a = sc.nextInt();

		System.out.println("�ι�° �� > ");
		b = sc.nextInt();

		System.out.println("����° �� > ");
		c = sc.nextInt();

		double avg = (a + b + c) / 3;

		if (avg >= 70) {
			if ((a > 40) && (b > 40) && (c > 40)) {
				System.out.println("�հ� �Դϴ�");
			} else {
				System.out.println("���� �Դϴ�");
			}
		} else {
			System.out.println("���հ� �Դϴ�");
		}
	}

}
