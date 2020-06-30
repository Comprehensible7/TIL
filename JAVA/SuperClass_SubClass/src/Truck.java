
// sub class -> super class 로 상속시킨다
// 오버라이딩은 상속일때만 사용가능하다
// 트럭에 대한 내용이 들어간다
public class Truck extends Vehicle {

	double maxLoad; // 최대 적재량

	// 생성자
	public Truck(int w, int s, double max, double maxW) {
		
		// 숨어있는 구문, 상속과 관계없이 항상 숨어있는 구문
		super();	// Vehicle();, 기본생성자임, 해당하는클래스의 부모클래스를 말한다
		// 부모클래스의 생성자를 호출
		// super라는것 자체가 부모를 뜻하고 ()가 들어가서 생성자가 된다.
		
		// SuperClass의 객체생성 이후에 SubClass의 객체가 생성
		System.out.println("Truck 생성자 호출");
		numberOfWheel = w;
		numberOfSeat = s;
		maxLoad = max;
		weight = maxW;
	}

	// 화물을 짐칸에 싣는다
	public void load() {

	}

	// Vehicle의 start 메소드를 truck이 오버라이딩 해서 재정의 한 기능
	// 이미 vehicle에 start라는 메소드가 존재하지만 오버라이딩을 진행

	// 어노테이션 (Annotation) : 오버라이드 어노테이션
	// 재정의
	@Override
	public void start() {
		System.out.println("Truck 출발 기능");

	}

	// == 오버라이딩 조건 ==
	// 1. 상속관계에서만 가능
	// 2. 부모의 메서드 모양과 동일해야 한다
	
	// 참조자료형(String 등)에서는 == 등을 사용할 수 없는 이유가 주소값을 비교하기때문에 값을 알 수 없다.
	// equals 등을 사용해야한다

}
