
public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i < 100; i++) {
			// 1 ~ 99 까지 1씩 증가하는 반복문
			
			System.out.println("i = " + i);
			
		// 출력은 하지만 만약 i값이 50이라면 종료
		// 만약 출력문 위에서 아래의 조건이 들어갈경우 50일때 종료하지만 결과는 49가 나옴
			if (i == 50) {
				break;
			}
		}
		
	}

}
