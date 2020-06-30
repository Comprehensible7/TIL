
// SuperClass
// 차량에 대한 공통적인 사항이 들어간다
public class Vehicle {
	
	// 3개의 속성
	int numberOfWheel; // 바퀴의 수
	int numberOfSeat; // 좌석의 수
	double weight; // 차량의 무게

	// 기본생성자
	public Vehicle () {
		
		super(); // 숨어있는 구문, object();
		
		// 상속 시 SuperClass의 생성자가 생성되고, 객체가 만들어지고 출력된다
		System.out.println("Vehicle 생성자 호출");
	}
	
	// 2개의 메서드
	public void start() { // 차량을 출발시킴
		// Truck에서 오버라이딩을 해줬기때문에 여기의 메소드는 실행하지 않는다
		System.out.println("Vehicle 출발 기능");
	}

	public void stop() { // 차량을 정지시킴

		System.out.println("Vehicle 정지 기능");
	}

	// == 오버라이딩 조건 ==
	// 1. 상속관계에서만 가능
	// 2. 부모의 메서드 모양과 동일해야 한다

}
