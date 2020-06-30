package Main;

public class CountTest {
	
	/*
	 * public static void test() { System.out.println("test"); }
	 */
	
	// Static은 Static에서 생성한 애들은 사용가능하나 그외의 메서드들은 사용불가
	// 사용하려고 한다면 동일하게 Static으로 변환해주어야 한다
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 위의 test메서드를 static으로 변경하면 아래에서 실행이 가능하다 test();
		 */
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();

		System.out.println("c1.serialNumber : " + c1.serialNumber);
		System.out.println("c2.serialNumber : " + c2.serialNumber);
		System.out.println("c3.serialNumber : " + c3.serialNumber);

		// static 선언된 클래스 변수는 클래스의 이름으로 접근 가능하다.
		System.out.println("Count.counter : " + Count.counter);

		// 맴버변수처럼 객체의 이름으로도 접근이 가능하다.
		System.out.println("c2.counter : " + c2.counter);
	}

}
