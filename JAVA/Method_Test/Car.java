
public class Car {

	// 속성은 변수
	int car_wheel;		// 바퀴의 개수
	double car_length;	// 차의 길이
	double car_height;	// 차의 높이
	double car_weight;	// 차의 무게
	int car_seat;		// 차의 좌석수
	
	// 행동방식, 즉 기능은 메소드(함수)로 표현
	public void start() {
		// 시동을 걸다
		System.out.println("시동을 겁니다.");
	}
	
	public void stop() {
		// 브레이크를 밟다
		System.out.println("브레이크를 밟다");
	}
	
	public void handle() {
		// 핸들을 틀다
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		
		System.out.println("Hello World!");

	}

}
