import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("정수를 입력해 주세요 > ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if ((num % 3 == 0) && (num % 9 != 0)) {
			System.out.println("해당 숫자는 3의 배수이면서 9의 배수는 아니다.");
		} else {
			System.out.println("그 외의 결과입니다.");
		}

	}

}
