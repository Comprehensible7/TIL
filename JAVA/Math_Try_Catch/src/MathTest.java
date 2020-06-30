
public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 절대값
		int abs = Math.abs(-1);
		
		System.out.println(abs);
		
		// 최대값
		int max = Math.max(100, 50);
		
		System.out.println("max : " + max);
		
		// 최소값
		int min = Math.min(100, 50);
		// int min = Math.min(Math.min(100, 50),10);
		
		System.out.println("min : " + min);
		
		// 돌려받는값도 더블형
		// 소숫점 올려버림
		double ceil = Math.ceil(10.1);
		
		System.out.println("ceil : " + ceil);
		
		// 소숫점자리 버림
		double floor = Math.floor(10.9);
		
		System.out.println("floor : " + floor);
		
		// 반올림
		long round = Math.round(10.5);
		
		System.out.println("round : " + round);
	}

}
