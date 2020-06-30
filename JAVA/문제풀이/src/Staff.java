// Sub Class
public class Staff extends Human {

	// 맴버변수 지정
	private String field;		// 부서

	// 생성자 매개변수 (String, String, int, String) 받고 부모클래스의 멤버변수와 부서 속성까지 초기화
	public Staff(String sn, String name, int age, String field) {
		super(sn,name,age);
		this.field = field;
	}
	
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	// 부모클래스의 print()를 오버라이드한 메서드
	public void print() {
		
		// 부모가 가지고있는 프린트를 실행시켜라
		super.print();
		System.out.println("부서 : " + field);
	}
	
}
