import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// ù��° ��, �ι�° ��, �ӽú��� ����
		int start, end, temp;

		// �հ� ���� �ʱ�ȭ
		int sum = 0;

		System.out.println("ù��° ���� > ");
		start = sc.nextInt();

		System.out.println("�ι�° ���� > ");
		end = sc.nextInt();

		// start�� end���� ũ��
		// temp�� start�� ���� ��, start�� end�� ���� ��, end�� temp�� ���� ��;
		if (start > end) {
			temp = start;
			start = end;
			end = temp;
		}
		
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(start + " ~ " + end + "������ �հ� : " + sum);

	}

}
