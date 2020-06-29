import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열을 선언하고 생성하는 방법
		// 생성시 크기를 지정해줘야 한다.
		int[] arr = new int[10];

		Scanner sc = new Scanner(System.in);

		// 배열변수명.length
		// 배열 사용 시 i = 0은 국룰임
		// 배열의 인덱스는 0부터 시작하기때문에 0부터 시작함
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 데이터 > ");
			arr[i] = sc.nextInt();
		}

		System.out.println();

		System.out.println("**** 입력된 데이터 목록 ****");

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
