
abstract class Person {

	String name;
	int age;
	String addr;
	
	// 생성자
	public Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public abstract void printInfo();
	
}
