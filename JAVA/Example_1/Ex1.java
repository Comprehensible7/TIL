import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		
		int a;

		// ���� ���������� �������� 0�μ��� ���ϴ°��� ����� ���ϴ°�
		for (a = 1; a <= num; a++) {
			if ((num % a) == 0) {
				System.out.println(a);
			}
		}

	}

}
