import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// �Է¹��� ����
		int num;
		
		// ����� ������ ���� �Է�
		int factor = 1;

		System.out.print("���� �Է� > ");
		num = sc.nextInt();

		// factor���� num���� �۰ų� ������
		while (factor <= num) {
			
			// ���� ���������� �������� 0�μ��� ���ϴ°��� ����� ���ϴ°�
			// num�� factor�� ���� �������� 0�϶�
			if (num % factor == 0) {
				System.out.println(factor);
			}
			factor++;
		}

	}

}
