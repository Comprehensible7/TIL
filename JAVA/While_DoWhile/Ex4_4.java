import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ������ �Է����ּ��� : ");
		int num1 = sc.nextInt();

		System.out.println("�ι�° ������ �Է����ּ��� : ");
		int num2 = sc.nextInt();

		int start = 1;
		int sum = 0;

		if (num2 < 0 || num2 > num1) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			while (start <= num1) {
				if (start % num2 == 0) {
					start++;
					continue;
				} else {
					sum += start;
				}
				start++;
			}
			System.out.println("�հ�� : " + sum);
		}

	}

}
