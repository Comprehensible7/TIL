import java.util.Scanner;

public class Example1_if_for_while_con_brk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ �޾ƿ´�
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("������ �Է��ϼ��� > ");

			int score = sc.nextInt();

			if (score >= 80) {
				if (score >= 95) {
					System.out.println("A+ �Դϴ�.");
				} else if (score >= 93) {
					System.out.println("A0 �Դϴ�.");
				} else if (score >= 90) {
					System.out.println("A- �Դϴ�.");
				} else if (score >= 85) {
					System.out.println("B+ �Դϴ�.");
				} else if (score >= 83) {
					System.out.println("B0 �Դϴ�.");
				} else if (score >= 80) {
					System.out.println("B- �Դϴ�.");
				}
			} else {
				System.out.println("����� �̲�������!");

			}

			if (score >= 100) {
				System.out.println("Wunderbar!");
				break;
			} else if (score < 79) {
				System.out.println("���ݸ� �� �����ô�!");
				break;
			}
		}

	}
}
