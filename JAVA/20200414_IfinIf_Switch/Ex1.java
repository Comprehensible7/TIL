import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("�����Է� > ");
		int score = sc.nextInt();

		// 0������ �۰ų� 100������ Ŭ ��쿡�� �߸��� �Է��Դϴٸ� ���
		if (!(score < 0 || score > 100)) {
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}

	}

}
