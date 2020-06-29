
public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1부터 10까지 1씩 증가하는 반복문
		for(int i = 1; i<=10; i++) {
			
			// 1부터 10까지 모두 출력한다
			// 조건식 이전에 출력문을 실행하여 값이 정상적으로 다 나온다
			System.out.println("Before = " + i);
			
			// i가 5일때는 계속하라는 문장
			// 5의 값은 출력하지 않는다
			if(i == 5) {
				continue;
			}
			
			System.out.println("After = " + i);
		}

	}

}
