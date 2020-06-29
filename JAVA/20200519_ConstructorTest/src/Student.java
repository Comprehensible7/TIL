
public class Student extends Person {
	private String no;

	// 부모클래스에 생성자가있으면 자식클래스에도 생성자가 필요하다
	public Student(String name, int age, String n) {
		// 구문을 호출한것이지 클래스를 상속시키는게 아니다
		// Person();이라고 작성했으면 상속받는게 된다
		
		// Person(name,age);
		super(name, age);	 // 부모 클래스의 생성자를 호출
		no = n;
	}

}
