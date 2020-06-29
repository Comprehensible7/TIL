import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 초기화 및 설정
		int a, b, sum = 0;

		System.out.print("첫번째 정수 입력 : ");
		a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		b = sc.nextInt();

		if (a > b) {
			int sub = a;
			a = b;
			b = sub;
		}
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "부터 " + b + "의 합 " + sum);
	}

}
