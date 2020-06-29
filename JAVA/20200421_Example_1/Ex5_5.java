import java.util.Scanner;

public class Ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// 화폐 비율 선언
		double won = 1000; // 1000원
		double dollar = 0.82; // 1000원 -> 달러
		double yen = 88.24; // 1000원 -> 엔화
		double euro = 0.78; // 1000원 -> 유로화

		// 스위치문에서 사용할 변수 선언
		int choice;
		// 원 단위 금액 입력 변수 선언
		int incur;
		// 스위치문에서 값을 계산하기위한 변수
		double outcur;

		System.out.print("원 단위 금액 입력 : ");
		incur = input.nextInt();

		// 값이 0일경우 exit 실행
		if (incur < 0) {
			System.out.println("잘못 입력했습니다.");
			System.exit(0);
		}

		// 스위치문에서 선택 가능한 변수 선언
		System.out.print("환전할 화폐 (1:달러, 2:엔화, 3:유로화) : ");
		choice = input.nextInt();

		switch (choice) {
		case 1:
			outcur = incur * dollar / won;
			System.out.println(incur + "원은 " + outcur + "달러입니다.");
			break;
		case 2:
			outcur = incur * yen / won;
			System.out.println(incur + "원은 " + outcur + "엔입니다.");
			break;
		case 3:
			outcur = incur * euro / won;
			System.out.println(incur + "원은 " + outcur + "유로입니다.");
			break;
		default:
			System.out.println("잘못 입력했습니다.");
		}

	}

}
