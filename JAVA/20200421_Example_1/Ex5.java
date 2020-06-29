import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int slt = 0; // 원 단위 값
		int curr = 0; // 환율 값 선택

		do {
			System.out.println("원 단위 금액 입력 : ");
			slt = sc.nextInt();

			// 선택한 원단위 값 / 1000.0
			double a = slt / 1000.0;
			// 환율 값 나올녀석을 계산하게 해줄아이
			double b = 0.0;

			// 음수값이 들어갈 경우 break 처리
			if (slt < 0) {
				System.out.println("틀린값을 입력하셨습니다.");
				break;

			} else {
				System.out.println("환전할 화폐 (1 : 달러, 2 : 엔화, 3 : 유로 : )");
				curr = sc.nextInt();
				switch (curr) {

				case 1:
					b = a * 0.82;
					System.out.println(slt + " 원은 " + b + " 달러 ");
					break;

				case 2:
					b = a * 88.24;
					System.out.println(slt + " 원은 " + b + " 엔 ");
					break;

				case 3:
					b = a * 0.78;
					System.out.println(slt + " 원은 " + b + " 유로 ");
					break;

				default:
					System.out.println("잘못 입력하였습니다.");
					break;
				}
			}

			// 반복문 종료
		} while (false);

	}

}
