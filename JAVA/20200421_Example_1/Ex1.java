import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		int a;

		// 값을 나누었을때 나머지가 0인수를 구하는것이 약수를 구하는것
		for (a = 1; a <= num; a++) {
			if ((num % a) == 0) {
				System.out.println(a);
			}
		}

	}

}
