import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			Scanner sc = new Scanner(System.in);

			System.out.println("첫번째 정수입력 > ");
			int a = sc.nextInt();

			System.out.println("두번째 정수입력 > ");
			int b = sc.nextInt();

			int sum = a + b;

			if(sum>=0) {
				System.out.println(">> 현재까지 입력된 정수의 합 : " + sum);
				break;
			} else if(sum<=0) {
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
		} while (true);

	}

}
