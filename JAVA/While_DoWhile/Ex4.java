import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			Scanner sc = new Scanner(System.in);

			System.out.println("ù��° �����Է� > ");
			int a = sc.nextInt();

			System.out.println("�ι�° �����Է� > ");
			int b = sc.nextInt();

			int sum = a + b;

			if(sum>=0) {
				System.out.println(">> ������� �Էµ� ������ �� : " + sum);
				break;
			} else if(sum<=0) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
			
		} while (true);

	}

}
