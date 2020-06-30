
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 10, b = 2;
			
			System.out.println("시작");
			System.out.println(a/b);
			System.out.println("끝");
			
		} catch (ArithmeticException e) {
			System.out.println("예외 캐치 : " + e.getMessage());
		}
	}
}
		