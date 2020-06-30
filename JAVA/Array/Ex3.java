import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 값을 입력받아올 변수선언
		int number;

		// 총 합을 받아올 변수를 초기화
		int res = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력 하세요 : ");
		// 배열의 크기를 입력한다
		number = sc.nextInt();

		// 입력한 만큼의 배열값을 생성해줌
		int[] arr = new int[number];
		for (int i = 0; i < number; i++) {

			// 증가한 i값만큼 출력된다.
			System.out.print(i + "번째 값을 입력 하세요 : ");
			// 입력받을 배열 값
			arr[i] = sc.nextInt();

			// 총합
			res += arr[i];
		}

		// 입력하였던 값의 총합을 출력한다
		System.out.print("배열 요소의 총 합은 : " + res);
	}

}
