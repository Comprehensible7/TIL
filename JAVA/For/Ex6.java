import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 제어문 문제도 하나 내드릴께요 
		 * 3개의 정수를 입력 받아 if문만 사용하여 오름차순으로 정렬하시오. 
		 * 실행 시 보여지는 화면은 
		 * 1번 째 정수 입력 : 34 
		 * 2번 째 정수 입력 : 15 
		 * 3번 째 정수 입력 : 23 
		 * 15 23 34
		 */

		// 결과값을 받아올 변수를 생성
		// temp는 임시로 사용할 공간임
		int a, b, c, temp;

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 값 > ");
		a = sc.nextInt();

		System.out.println("두번째 값 > ");
		b = sc.nextInt();

		System.out.println("세번째 값 > ");
		c = sc.nextInt();

		// 각 값마다 크기를 비교하는 식을 작성, a,b,c 비교
		// 거짓 참 상관없이 if문으로 검사를 진행
		if (b < a) {
			temp = a;
			a = b;
			b = temp;
		}
		if (c < a) {
			temp = a;
			a = c;
			c = temp;
		}
		if (c < b) {
			temp = b;
			b = c;
			c = temp;
		}
		
		// 오름차순 정렬
		System.out.println("값의 순서는 아래와 같습니다.");
		System.out.println(a + "  " + b + "  " + c);

	}

}
