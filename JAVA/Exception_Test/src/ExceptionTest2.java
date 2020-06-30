
public class ExceptionTest2 {

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

		// 각각 다르게 예외를 처리할것이라면 catch문을 여러개 사용해야함
		// 그게 아니고 동일하게 예외처리를 하려면 아래와 같이 진행
		} catch (Exception ae) {
			// TODO Auto-generated catch block
			System.out.println("All kind of Exception Catch : " + ae.getMessage());
		}
	}
}
