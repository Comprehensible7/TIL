import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 값을 입력받을 변수
		int num;

		Scanner sc = new Scanner(System.in);

		// 배열크기 입력
		System.out.print("배열의 크기를 입력 > ");
		num = sc.nextInt();

		// 입력한 값이 배열로 생성
		int[] ary = new int[num];

		// 입력받은 값(배열 값) 만큼 값을 입력하게 해줌
		for (int i = 0; i < ary.length; i++) {
			System.out.print(i + 1 + "번째 값을 입력하세요 : ");
			ary[i] = sc.nextInt();

		}

		/*
		 * for(초기값; 조건식; 증감식) { 문장 }
		 */

		System.out.println();
		System.out.print("역순출력 결과값 > ");
		// 배열의 길이 -1만큼 해야 끝부터 시작함, 배열의 시작이 0이므로 i는 0보다 크거나 같다고 해줘야 함
		for (int i = ary.length - 1; i >= 0; i--) {
			// 역순으로 출력실행
			System.out.print(ary[i] + " ");
		}

	}

}