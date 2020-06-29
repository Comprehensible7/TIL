
public class ExceptionTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			int a = 10, b = 5;

			System.out.println("Start");
			System.out.println(a / b);

			// 배열을 선언
			int aa[] = null;
			// 배열 생성없이 사용하려고 하니 예외가 발생함
			aa[0] = 1;

			System.out.println("End");

		} catch (ArithmeticException ae) {
			// TODO Auto-generated catch block
			System.out.println("Exception Catch : " + ae.getMessage());

		} catch (NullPointerException npe) {
			System.out.println("NullPointerException Catch : " + npe.getMessage());
		}

	}

}
