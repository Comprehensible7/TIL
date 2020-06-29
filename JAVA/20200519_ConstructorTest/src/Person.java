
public class Person {

	private String name;
	private int age;
	
	// 부모클래스에 생성자가있으면 자식클래스에도 생성자가 필요하다
	public Person(String n, int a) {
		
		name = n;
		age = a;
	}
	
}
