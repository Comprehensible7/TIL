import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("���ϴ� ���� �Է� : ");

		int num = sc.nextInt();
		int i = 1; // ���� ��
		int mul = 0; // ���� ��

		if (num >= 1 && num <= 9) // 1���� 9���� Ȯ��
		{
			while (i < 10) // 1���� 9���� ��������
			{
				mul = num * i;
				System.out.println(num + "*" + i + "=" + mul);
				i++; // i�� ��� �����ؾ� while���� ���Ѹ��İ� �ȵ�
			}
		} else {
			System.out.println("1���� 9������ ������ �Է� �����մϴ�.");
		}

	}

}
