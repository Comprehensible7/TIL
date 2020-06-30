import java.util.Scanner;

public class Example1_if_for_while_con_brk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 점수를 받아온다
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("점수를 입력하세요 > ");

			int score = sc.nextInt();

			if (score >= 80) {
				if (score >= 95) {
					System.out.println("A+ 입니다.");
				} else if (score >= 93) {
					System.out.println("A0 입니다.");
				} else if (score >= 90) {
					System.out.println("A- 입니다.");
				} else if (score >= 85) {
					System.out.println("B+ 입니다.");
				} else if (score >= 83) {
					System.out.println("B0 입니다.");
				} else if (score >= 80) {
					System.out.println("B- 입니다.");
				}
			} else {
				System.out.println("어잌쿠 미끄러졌넹!");

			}

			if (score >= 100) {
				System.out.println("Wunderbar!");
				break;
			} else if (score < 79) {
				System.out.println("조금만 더 힘냅시다!");
				break;
			}
		}

	}
}
