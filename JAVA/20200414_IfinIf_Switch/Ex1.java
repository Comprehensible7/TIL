import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("점수입력 > ");
		int score = sc.nextInt();

		// 0점보다 작거나 100점보다 클 경우에는 잘못된 입력입니다를 출력
		if (!(score < 0 || score > 100)) {
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("잘못된 입력입니다.");
		}

	}

}
