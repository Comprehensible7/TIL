import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 단을 입력 : ");

		int num = sc.nextInt();
		int i = 1; // 곱할 수
		int mul = 0; // 곱한 합

		if (num >= 1 && num <= 9) // 1부터 9까지 확인
		{
			while (i < 10) // 1부터 9까지 곱셈연산
			{
				mul = num * i;
				System.out.println(num + "*" + i + "=" + mul);
				i++; // i가 계속 증가해야 while문이 무한르파가 안됨
			}
		} else {
			System.out.println("1부터 9까지의 정수만 입력 가능합니다.");
		}

	}

}
