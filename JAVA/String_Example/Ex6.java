import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 값을 입력받을 변수
		int num;

		// 총합
		int res = 0;

		Scanner sc = new Scanner(System.in);

		// 배열크기 입력
		System.out.print("배열의 크기를 입력 > ");
		num = sc.nextInt();
		System.out.println();

		// 입력한 값이 배열로 생성
		int[] ary = new int[num];
		
		// 입력받은 값(배열 값) 만큼 내부값을 입력하게 해줌
		for (int i = 0; i < ary.length; i++) {
			System.out.print(i + 1 + "번째 값을 입력하세요 : ");
			ary[i] = sc.nextInt();

			// 총합
			res += ary[i];
		}
		System.out.println();
		System.out.print("< 총합 > " + res + "\n");
		System.out.print("< 평균 > " + res / num);
	}

}
