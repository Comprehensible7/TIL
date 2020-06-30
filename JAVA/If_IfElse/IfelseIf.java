import java.util.Scanner;

public class IfelseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Insert Your Score : ");

		Scanner inputValue = new Scanner(System.in);

		// 정수만 표기 시
		//int score = inputValue.nextInt();
		
		// 실수까지 표기 시
		double score = inputValue.nextDouble();
		
		if (score >= 90) {
			System.out.println("Your Score is A");
		} else if (score >= 80) {
			System.out.println("Your Score is B");
		} else if (score >= 70) {
			System.out.println("Your Score is C");
		} else {
			System.out.println("Your Score is D");
		}

	}

}
