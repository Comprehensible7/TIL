import java.util.Scanner;

public class For_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			System.out.println();
			System.out.println("====================");
			System.out.println("1. ������ ���");
			System.out.println("2. ������ ����� ���");
			System.out.println("3. ������ ����� ���");
			System.out.println("4. �迭����");
			System.out.println("9. ����");
			System.out.println("====================");
			System.out.printf("\n");
			System.out.print("�޴� ��ȣ�� ������ �ּ��� > ");

			Scanner sc = new Scanner(System.in);

			int code = sc.nextInt();

			switch (code) {

			case 1:
				System.out.println();

				for (int i = 1; i <= 9; i++) {
					System.out.print("[" + i + "��]\t\t  ");
				}
				System.out.println();

				for (int i = 1; i < 10; i++) {
					for (int k = 1; k < 10; k++) {
						System.out.print(k + " * " + i + " = " + (k * i) + "\t");
					}
					System.out.println();
				}
				break;

			case 2:
				System.out.println();

				// ���⼭ i�� ������ �� ���� �ǹ��Ѵ�.
				for (int i = 0; i < 4; i++) {

					// ���⼭ k�� ������ �� ���� �ǹ��Ѵ�.
					// �߿��� ����Ʈ�� k<=i; ���ǽ� �κ�
					for (int k = 0; k <= i; k++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				break;

			case 3:
				System.out.println();

				// ���⼭ i�� ���� �� ���� �ǹ��Ѵ�.
				for (int i = 1; i <= 4; i++) { // 1, 2, 3, 4

					// k�� ���� �� ���� �ǹ��Ѵ�.
					for (int k = 4; k >= 1; k--) { // 4, 3, 2, 1

						// ������ �������� �ϴ� ���ǰ�
						if (k > i) { // 4/1, 3/1, 2/1
							System.out.print(" ");

							// ���� �������� �ϴ� ����
						} else { // 1/1
							System.out.print("*");
						}
					}
					System.out.println();
				}
				break;

			case 4:
				System.out.println();
				System.out.print("�迭�� ũ�⸦ �Է� �ϼ��� : ");
				int length = sc.nextInt();

				// ����ڷκ��� �Է¹��� ��, �迭 ũ�⸦ ����.
				int[] arr = new int[length];
				int sum = 0;

				for (int i = 0; i < arr.length; i++) {
					System.out.print(i + 1 + "��° ���� �Է� �ϼ��� : ");
					arr[i] = sc.nextInt();
					sum += arr[i]; // ������ ���ϱ�
				}
				System.out.println();
				System.out.println("�迭 ����� �� ���� : " + sum);

				break;

			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);

			default:
				System.out.println("�ùٸ� ���� �Է��ϼ���.");
				break;
			}

		} while (true);
	}

}
