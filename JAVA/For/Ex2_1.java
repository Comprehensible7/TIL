import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 > ");
		int num = sc.nextInt();

		int fac = 1;

		for (int i = 1; num > 0; num--) {
			fac *= num;
			
			// for문 내부에 출력을 하면 반복횟수만큼 출력됨
			System.out.println(fac);
		}
		// 결과값 1개만 나옴
		// System.out.println(fac);
	}

}
