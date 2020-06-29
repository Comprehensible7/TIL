import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요 : ");
		int num = sc.nextInt();

		int fac = 1;
		for (int i = num; i > 0; i--) {
			fac *= i;
			
			// for문 내부에 출력을 하면 반복횟수만큼 출력됨
			System.out.println(fac);
			
		}
		// 결과값 1개만 나옴
		// System.out.println(fac);

	}

}
