import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// 정수형 배열 길이5인것을 생성
		int[] a = new int[5];

		// 총점과 평균 지정해줄 변수 선언
		int total = 0, avg = 0;

		// i번째 학생의 점수를 입력받는다
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + 1 + "번 학생점수 입력 : ");
			a[i] = scan.nextInt();

			// 배열합 구하기
			total += a[i];

		}
		// 배열평균 구하기
		avg = total / a.length;

		System.out.println("\n평균 점수 > " + (double) avg);
		System.out.println();

		// 평균이상인 학생을 출력한다
		for (int i = 0; i < a.length; i++) {
			if (avg <= a[i]) {

				System.out.println(i + 1 + "번 학생의 점수 : " + a[i]);

			}
		}

	}
}
