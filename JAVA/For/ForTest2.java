import java.util.Scanner;

// ���� 1���� �Է¹޾Ƽ� 1���� �Է¹��� �������� ����ϴ� �ڵ带�ۼ��Ͻÿ�.
// ��, ������ 0���� ���� ��쿡�� "�߸��Է��ϼ̽��ϴ�"�� ����Ͻÿ�.

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է��ϼ��� > ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");

		} else {
			// �Է��� ���ڱ����� ����ϰԲ� ������ �Է�
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}

		}

	}

}
