import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			Scanner sc = new Scanner(System.in);

			System.out.println("ù��° �����Է�(-1 ����) > ");
			int a = sc.nextInt();

			System.out.println("�ι�° �����Է�(-1 ����) > ");
			int b = sc.nextInt();

			System.out.println("����° �����Է�(-1 ����) > ");
			int c = sc.nextInt();

			System.out.println("�׹�° �����Է�(-1 ����) > ");
			int d = sc.nextInt();

			int sum = a + b + c + d;

			if (sum < 0) {
				System.out.println("����");
				break;

			}

			System.out.println(">> ������� �Էµ� ������ �� : " + sum);
			break;

		} while (true);

	}

}