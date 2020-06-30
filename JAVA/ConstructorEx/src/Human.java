// Vo역할
public class Human {
	
	private String name;
	private int age;
	
	//				매개변수 입력
	public Human(String n, int a) {
		// field값 초기화
		name = n;
		age = a;
	}
	
	// G/S 생성
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
	
	public void showInfo() {
		// 가지고있는 필드에 대한 정보를 출력
		System.out.println("name : " + name + "age : " + age);
	}

}
