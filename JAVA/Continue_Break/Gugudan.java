
public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이중 포문을 사용하여 1단부터 9단까지 모두 출력한다
		for(int i = 1; i < 10; i++) {
			// 1 2 3 4 5 6 7 8 9 
			for(int j = 1; j < 10; j++) {
				// 1 2 3 4 5 6 7 8 9 
				
				System.out.println(i + " * " + j + " = " + i * j);
			}
		// for ( 초기값; 조건식; 증감식 )
		// 결과값 첫번째 숫자는 i ( 앞의 숫자 증가, 1번씩 실행됨 )
		// 결과값 두번째 숫자는 j ( 앞의 수와는 다르게 1부터 9까지 반복, 포문 종료시까지 실행 )
		// 결과값 세번째 숫자는 결과값
		}

	}

}
