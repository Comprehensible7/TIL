import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("구구단 실행! > ");
		int num = sc.nextInt();

		// 입력받은 숫자와 i값을 곱한다.
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}

	}

}
