
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 여기서 i는 세로의 줄 수를 의미한다.
		for (int i = 0; i < 4; i++) {
			
			// 여기서 k는 가로의 줄 수를 의미한다.
			// 중요한 포인트는 k<=i; 조건식 부분
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}
}
