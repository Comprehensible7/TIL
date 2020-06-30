import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 입력받을 정수
		int num;
		
		// 약수를 보여줄 값을 입력
		int factor = 1;

		System.out.print("정수 입력 > ");
		num = sc.nextInt();

		// factor값이 num보다 작거나 같을때
		while (factor <= num) {
			
			// 값을 나누었을때 나머지가 0인수를 구하는것이 약수를 구하는것
			// num을 factor로 나눈 나머지가 0일때
			if (num % factor == 0) {
				System.out.println(factor);
			}
			factor++;
		}

	}

}
