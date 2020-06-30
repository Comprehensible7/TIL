package test.vo;

public class Person {

	// 정보은닉을 위한 private 선언
	private int num;
	private String name;
	private int age;
	
	// 기본생성자
	public Person() {
		// TODO Auto-generated constructor stub
		super();
	}

	// 생성자
	public Person(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}

	// Getter Setter
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

	// toString Generate
	@Override
	public String toString() {
		return "Person [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
