import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 참고자료
		// char 값 지정 후 
		// char c = ((num%2)==0) ? '짝' : '홀' ; 
		
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("정수값을 넣으세요 > ");
		
		a = sc.nextInt();

		// 홀수는 a%2==1 (a를 2로 나눈 나머지) 1은 계산한 나머지값이 홀수이고 뒤의 1과 같다면 홀수
		// 짝수는 a%2==0 (a를 0으로 나눈 나머지) 0은 계산한 나머지값이 짝수이고 뒤의 0과 같다면 짝수
		// % 나눈 나머지 값을 계산, == a와 b가 같음
		// a가 
		if(a%2==1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");

		}
	
	}

}
