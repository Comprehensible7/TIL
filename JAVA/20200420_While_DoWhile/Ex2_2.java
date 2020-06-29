import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = 0; // do 밖에서도 사용하기 위해 생성함
		// double num = 0;

		do {
			System.out.println("100 이상의 정수를 입력하세요 : ");
			num = sc.nextInt();
			// num = sc.nextDouble();

		} while (num < 100); // 답이 나올때까지 반복 질문
		System.out.println(num + "-> 100 이상 정상 입력 완료!");
	}

}
