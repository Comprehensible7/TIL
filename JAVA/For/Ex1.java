import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("������ ����! > ");
		int num = sc.nextInt();

		// �Է¹��� ���ڿ� i���� ���Ѵ�.
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}

	}

}
