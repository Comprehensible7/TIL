import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int birth = sc.nextInt();
		int age = 2020 - birth;

		if (birth < 0 || birth > 2020) {
			System.out.println("잘못 입렵하셨습니다.");
		} else if (age < 20) {
			System.out.println("청소년 입니다.");
		} else {
			System.out.println("성인입니다.");

		}
	}

}
