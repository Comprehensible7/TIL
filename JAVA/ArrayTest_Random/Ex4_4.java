import java.util.Random;
import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();

		Scanner sc = new Scanner(System.in);

		// 1 �̻� 50 ������ ������ ���ڸ� �޾ƿ� ������ ����
		int comNum = r.nextInt(50) + 1;

		// ���⶧ ���� �Է��ϱ� ���ؼ� While���� ����Ѵ�
		while (true) {

			// userNum�� ����ڰ� �Է��� ��
			int userNum = sc.nextInt();

			// userNum�� comNum���� �������
			if (userNum < comNum) {
				System.out.println("UP");

				// userNum�� comNum���� Ŭ���
			} else if (userNum > comNum) {
				System.out.println("DOWN");

				// ���� ��ġ�������
			} else {
				System.out.println("GOOD");

				// �ݺ��� ����
				break;
			}
		}
	}

}
