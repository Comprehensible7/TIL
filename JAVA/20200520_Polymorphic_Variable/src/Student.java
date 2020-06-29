// Person이 부모클래스이므로 상속시켜준다
public class Student extends Person {

	private String no;
	
	// 생성자, 				매개변수 전달
	public Student(String name, int age, String no) {
		// 생성한 name, age를 person에게 전달
		super(name, age);
		// student에 내용전달함과 동시에 자식객체에게도 내용전달
		this.no = no;
	}
	
	public String getNo() {
		return no;
	}
	
	@Override
	public String printAll() {
		// super는 부모,부모의 printall을 실행한다
		// No의 값을 추가해준다
		return super.printAll() + " No : " + no;
	}
}
