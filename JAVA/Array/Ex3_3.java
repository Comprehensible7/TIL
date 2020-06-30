import java.util.Scanner;

public class Ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력 하세요 : ");
		int length = sc.nextInt();

		// 사용자로부터 입력받은 값으로 배열 크기를 지정합니다.
		int[] arr = new int[length];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 값을 입력 하세요 : ");
			arr[i] = sc.nextInt();
			sum += arr[i]; // 누적합을 구하는 방법은 많이 해봤죠?
		}
		System.out.println("배열 요소의 총 합은 : " + sum);

	}

}
