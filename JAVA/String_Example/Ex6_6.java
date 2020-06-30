import java.util.Scanner;

public class Ex6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// 배열크기가 5인 arr을 생성
		int[] arr = new int[5];
		// 합계를 받아줄 변수 생성
		int sum = 0;

		// arr[i]에 값을 입력받고 합을 계산하게 한다 (arr 내부에 값을 입력한다)
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 값 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (sum / arr.length));

	}
}
