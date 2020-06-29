import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 기본 배열
		int[] ary = { 20, 25, 30, 10, 15, 5 };
		// 변경을 위한 변수선언
		int chg1, chg2, temp;

		System.out.print("첫번째 인덱스 번호 > ");
		chg1 = sc.nextInt();
		System.out.print("두번째 인덱스 번호 > ");
		chg2 = sc.nextInt();

		// 임시변수에 값을 대입
		// 1 -> 2 // 2 -> 3 // 3 -> 1 
		temp = ary[chg1];
		ary[chg1] = ary[chg2];
		ary[chg2] = temp;

		System.out.print("바뀐 배열 > ");
		for (int i = 0; i < ary.length; i++) {
			// 배열 출력
			System.out.print(ary[i] + " ");

			}
			
		}
	}


