
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck truck = new Truck(6, 3, 11.5, 20.0);
//		System.out.println("Truck의 바퀴의 수는 : " + truck.numberOfWheel + "개 이다");
//
//		System.out.println("Truck의 최대 적재량은 : " + truck.maxLoad + "톤 이다");
//		System.out.println("Truck의 무게는 : " + truck.weight + " 톤 이다");

		// 차량 클래스의 start 부분
		// truck부분에서 오버라이딩 했기때문에 vehicle의 start는 실행하지 않는다
//		truck.start();

		// 트럭에는 존재하지 않으니 vehicle의 stop이 실행된다
//		truck.stop();

		// == 오버라이딩 조건 ==
		// 1. 상속관계에서만 가능
		// 2. 부모의 메서드 모양과 동일해야 한다
		
	}

}
