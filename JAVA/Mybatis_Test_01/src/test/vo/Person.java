package test.vo;

public class Person {
	
	private int num;
	private String name;
	private int age;

	// �⺻������ ����
	public Person() {
		// TODO Auto-generated constructor stub
	}

	// ������ ����
	public Person(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}

	// Getter Setter ����
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

	
	// toString ����
	// ��Ʈ�� ���·� ��ȯ�ؼ� ����� �� �ְ� ���ش�.
	@Override
	public String toString() {
		return "Person [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
}
