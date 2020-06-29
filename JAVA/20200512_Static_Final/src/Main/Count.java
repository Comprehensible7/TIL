package Main;

public class Count {
	
	public int serialNumber;
	
	public static int counter = 0;

	public Count() {
		
		counter++;
		serialNumber = counter;
		
	}
	
	// 특정 기능을 나타내는 메소드a(), 굉장히 많이 사용되는 메소드(횟수)
	// 하나의 클래스가 아니라 여러개의 클래스에서 계속적으로 사용되어야 하는 메소드
	
}
