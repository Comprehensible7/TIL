import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է� �ϼ��� : ");
		int length = sc.nextInt();

		// ����ڷκ��� �Է¹��� ������ �迭 ũ�⸦ �����մϴ�.
		int[] arr = new int[length];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է� �ϼ��� : ");
			arr[i] = sc.nextInt();
			sum += arr[i]; // �������� ���ϴ� ����� ���� �غ���?
		}
		System.out.println("�迭 ����� �� ���� : " + sum);

	}

}
