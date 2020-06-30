
public class Person {
	
	String name;
	int age;
	
	// 생성자
	public Person(String name, int age) {
		
		// 매개변수가 동일하므로 값을 동일하게 받아오기위해 위에 선언해준 private 내용과 일치시켜준다
		this.name = name;
		this.age = age;
	}
	
	// 출력까지 가능한 메서드
	public String printAll() {
		return "Name : " + name + " Age : " + age;
	}

}
