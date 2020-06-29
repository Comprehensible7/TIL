import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 첫번째 값, 두번째 값, 임시변수 선언
		int start, end, temp;

		// 합계 변수 초기화
		int sum = 0;

		System.out.println("첫번째 정수 > ");
		start = sc.nextInt();

		System.out.println("두번째 정수 > ");
		end = sc.nextInt();

		// start가 end보다 크면
		// temp는 start와 같은 값, start는 end와 같은 값, end는 temp와 같은 값;
		if (start > end) {
			temp = start;
			start = end;
			end = temp;
		}
		
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(start + " ~ " + end + "까지의 합계 : " + sum);

	}

}
