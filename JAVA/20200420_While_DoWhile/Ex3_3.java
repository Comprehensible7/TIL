import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0; // ����ڰ� �Է��� ����
		int count = 1; // Ƚ�� üũ�� ���� ����
		int sum = 0; // �հ�

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(count + "��° ���� �Է�(-1 ����) : ");
			num = sc.nextInt();
			sum += num;
			count++;
		} while (num != -1);
		sum += 1;

		System.out.println(">> ������� �Էµ� ������ �� : " + sum);

	}

}
