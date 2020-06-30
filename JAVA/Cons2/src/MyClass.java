
public class MyClass {

	int age;
	// MyClass의 생성자
	// 클래스의 이름과 동일한 이름을 가지며 반환타입은 존재하지 않는다.
	// 생성자가 호출될 때 전달받은 값은 newAge에 파라미터로 전달된다.
	String name;
	boolean isMale;

	public MyClass() {

	}

	public MyClass(int newAge, String newName, boolean newMale) {
		age = newAge;
		name = newName;
		isMale = newMale;

	}

	// 사용자로부터 나이를 입력받아서 멤버변수 age에 대입하는 기능
	public void setAge(int age) {
		this.age = age;
	}

}
