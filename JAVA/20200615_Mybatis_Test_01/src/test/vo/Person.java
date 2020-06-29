package test.vo;

public class Person {
	
	private int num;
	private String name;
	private int age;

	// 기본생성자 선언
	public Person() {
		// TODO Auto-generated constructor stub
	}

	// 생성자 선언
	public Person(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}

	// Getter Setter 선언
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	// toString 선언
	// 스트링 형태로 변환해서 출력할 수 있게 해준다.
	@Override
	public String toString() {
		return "Person [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
}
