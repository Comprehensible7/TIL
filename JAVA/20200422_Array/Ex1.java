import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭�� �����ϰ� �����ϴ� ���
		// ������ ũ�⸦ ��������� �Ѵ�.
		int[] arr = new int[10];

		Scanner sc = new Scanner(System.in);

		// �迭������.length
		// �迭 ��� �� i = 0�� ������
		// �迭�� �ε����� 0���� �����ϱ⶧���� 0���� ������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° ������ > ");
			arr[i] = sc.nextInt();
		}

		System.out.println();

		System.out.println("**** �Էµ� ������ ��� ****");

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
