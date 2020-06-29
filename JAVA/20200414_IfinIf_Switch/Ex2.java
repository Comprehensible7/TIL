import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("출생년 입력?");
		int year = sc.nextInt();

		if (year < 0 || year < 2020) {
			if (year > 2001) {
				System.out.println("청소년입니다.");
			} else if (year <= 2001) {
				System.out.println("성인입니다.");
			}

		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}

}
