import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Ű�� �Է��ϼ��� > ");
		int height = sc.nextInt();

		System.out.println("�����Ը� �Է��ϼ��� > ");
		int weight = sc.nextInt();

		double bmi = weight / ((height / 100.0) * (height / 100.0));

		if (bmi > 40) {
			System.out.println("����");
		} else if (bmi > 30) {
			System.out.println("��");
		} else if (bmi > 25) {
			System.out.println("��ü��");
		} else if (bmi > 18.5) {
			System.out.println("����");
		} else {
			System.out.println("��ü��");
		}
	}
}
