
public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			summary();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	// int n, m을 전달받았음
	// 예외를 넘겨준다(어떤 예외가 발생하던간에 실행한쪽으로 예외를 넘겨라 라는 의미)
	public static int divide(int n, int m) throws Exception{
		return n/m;
	}

	public static void summary() throws Exception{
		
		try {
			//					위에서 던져준 예외가 여기서발생
			System.out.println("계산결과 : " + divide(10, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("계산 오류");
		}
		
	}
}
