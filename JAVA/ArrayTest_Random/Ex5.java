import java.util.Random;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ĳ�� ����...
		Scanner sc = new Scanner(System.in);
		// ������ �� ����
		Random ran = new Random();
		
		// Ƚ���� ������ ������ ����
		int count = 0;

		// 1���� 50 ������ ������ ������ ����
		int num1 = ran.nextInt(50) + 1;

		// �õ� Ƚ���� ����� ���� tc�� ���� 
		System.out.print("�õ� Ƚ�� �Է� : ");
		int tc = sc.nextInt();

		// �õ� Ƚ����ŭ�� ���̸� ���� �迭�� ����, �Է��� ���� �����Ѵ�...
		int[] ary = new int[tc];

		// �Է��� �õ� Ƚ����ŭ �ݺ��� ����...
		while (true) {
			// ~��° �õ� Ƚ���� ��µ�
			System.out.print("1~50�� ���� �Է�(" + (count + 1) + "��° �õ�) : ");
			// ����ڰ� �Է��� ���� �޾ƿ´� 
			// ���� num ����
			int num = sc.nextInt();

			// �Է°��� 50���� Ŭ��� �Ǵ� 1���� �������
			if (num > 50 || num < 1) {
				System.out.println("1~50 ������ ���� �Է��ϼ���");
				continue;
			}

			// �迭 ���� �Է°��� ����
			ary[count] = num;

			// ����� �Է°��� ������ ������ �������
			if (num < num1) {
				System.out.println("Up");
				// ����� �Է°��� ������ �� ���� Ŭ���
			} else if (num > num1) {
				System.out.println("Down");
			} else {
				// ����� �Է°��� ��ġ�� ���
				System.out.println();
				System.out.println("����!");
				System.out.println("�õ� Ƚ�� : " + (count + 1));
				System.out.println();
				System.out.println("--�Է��� �� ���--");
				// ����ڰ� �Է��Ͽ��� ���� ����Ѵ�
				for (int i = 0; i <= count; i++) {
					System.out.println(ary[i]);
				}

				break;
			}

			count++;
			// �õ�Ƚ���� �Է°��� �ʰ��������
			if (count >= tc) {
				System.out.println("�õ� Ƚ�� �ʰ�!");
				break;
			}
		}
	}
}
