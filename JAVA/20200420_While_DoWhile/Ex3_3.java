import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0; // 사용자가 입력한 숫자
		int count = 1; // 횟수 체크를 위한 변수
		int sum = 0; // 합계

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(count + "번째 정수 입력(-1 종료) : ");
			num = sc.nextInt();
			sum += num;
			count++;
		} while (num != -1);
		sum += 1;

		System.out.println(">> 현재까지 입력된 정수의 합 : " + sum);

	}

}
