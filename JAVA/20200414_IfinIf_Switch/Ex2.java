import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("����� �Է�?");
		int year = sc.nextInt();

		if (year < 0 || year < 2020) {
			if (year > 2001) {
				System.out.println("û�ҳ��Դϴ�.");
			} else if (year <= 2001) {
				System.out.println("�����Դϴ�.");
			}

		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
	}

}
