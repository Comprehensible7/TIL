
public class LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 논리연산자
		int i = 10;
		
		// AND 연산자, 둘다 참이면 참, 그 외에는 모두 거짓
		System.out.println((i != 0) && (100/i > 10));
		
		// OR 연산자, 둘중 하나만 참이면 참, 둘다 거짓이면 거짓
		System.out.println((i == 10) || (100/i > 10));
		
		// XOR 연산자, A와 B가 다르면 참, 같으면 거짓
//		System.out.println((i < 0) ^ (i ==10));
		
		// NOT 연산자, 참이면 거짓, 거짓이면 참
		System.out.println(!(i > 1));
		
		
		// 혼합연산자
		int a = 5;
		int b = 7;
		int c = 10;
		
		a+=b; // a = a+b, 누적 합
//		a-=b; // a = a-b, 누적 빼기
//		a*=b; // a = a*b, 누적 곱
//		a/=b; // a = a/b, 누적 나누기
//		a%=b; // a = a%b, 누적 나머지
//		
//		a+=c; // a = a+c
		
		System.out.println(a);
		
	}

}
