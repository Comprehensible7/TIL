import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" 값을 입력하세요 > ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}

	}

}
