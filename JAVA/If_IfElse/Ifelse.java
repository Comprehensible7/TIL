import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Insert Your Score : ");

		Scanner inputValue = new Scanner(System.in);

		int score = inputValue.nextInt();

		if (score >= 70) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}

	}

}
