
public class InDecrementOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt = 10;
		
		System.out.println("cnt : " + cnt);
		System.out.println("cnt++ : " + cnt++); // 후위연산자 : 나중에 계산함
		System.out.println("cnt ++ 처리 후 : " + cnt);
		System.out.println("++cnt : " + ++cnt); // 앞에있는 연산자는 먼저 계산됨
		
		// 출력을 먼저하느냐 연산된 상태로 출력을 하느냐 차이가 있음
		// 출력 후 계산 : 2번째 예시, 출력당시는 10이지만 출력과 동시에 값이 1 증가함
		// 출력 전 계산 : 4번째 예시, 출력하기 전에 먼저 1을 더한 후 출력을 진행
	
		// int a = Integer.parseInt(b);
		// Double a = Double.parseDouble(b);
	}

}
