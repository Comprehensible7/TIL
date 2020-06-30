import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			System.out.println("100 이상의 정수를 입력하세요 > ");

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			if (num >= 100) {
				System.out.println("100 이상 정상 입력 완료!");
				break;
			} else {
				System.out.println("다시 입력");
			}

		} while (true);

	}

}
