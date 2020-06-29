
// 클래스 명
public class IntegerType 

//중괄호 시작부분이 클래스 범위 
{	
	
	// 메인 메소드 : 클래스 내부에서 동작을 진행
	// public protected private는 접근지정자를 말한다
	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		// 메소드 내부에는 변수가 존재, 자료형 선언 및 변수 선언
		// 정수형
		byte b = 10;
		short s = 20;
		int i = 1000;
		long l = 10000000000L;

		// 출력 ( 얘도 메서드인데 자바가 원래 제공해줌 )
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);

		// 실수형
		float f = 3.14f;
		double d = 3.141592;

		System.out.println(f);
		System.out.println(d);

		// 문자형
		char c1 = 'a';
		char c2 = '\u0061';

		System.out.println(c1);
		System.out.println(c2);

		// 논리형
		boolean b1 = true;
		boolean b2 = false;

		System.out.println(b1);
		System.out.println(b2);

		// 연산자
		int intValue1, intValue2, intValue3;
		intValue1 = intValue2 = intValue3 = 100;

		intValue2 = 50;

		System.out.println(intValue1);
		System.out.println(intValue2);
		System.out.println(intValue3);

	} // 메소드 범위 종료

}	// 클래스 범위 종료
