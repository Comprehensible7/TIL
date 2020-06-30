import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("키를 입력하세요 > ");
		int height = sc.nextInt();

		System.out.println("몸무게를 입력하세요 > ");
		int weight = sc.nextInt();

		double bmi = weight / ((height / 100.0) * (height / 100.0));

		if (bmi > 40) {
			System.out.println("고도비만");
		} else if (bmi > 30) {
			System.out.println("비만");
		} else if (bmi > 25) {
			System.out.println("과체중");
		} else if (bmi > 18.5) {
			System.out.println("정상");
		} else {
			System.out.println("저체중");
		}
	}
}
