import java.util.Scanner;

public class Ex6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// �迭ũ�Ⱑ 5�� arr�� ����
		int[] arr = new int[5];
		// �հ踦 �޾��� ���� ����
		int sum = 0;

		// arr[i]�� ���� �Է¹ް� ���� ����ϰ� �Ѵ� (arr ���ο� ���� �Է��Ѵ�)
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° �� �Է� : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (sum / arr.length));

	}
}
