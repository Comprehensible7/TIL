// Super Class
public class Human {

	// 맴버변수 3개를 작성
	private String sn; 		// 주민등록번호
	private String name; 	// 이름
	private int age; 		// 나이

	// 생성자
	// 			 매개변수를 전달받아서 필드를 초기화하는 기능
	public Human(String sn, String name, int age) {

		this.sn = sn;
		this.name = name;
		this.age = age;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
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
	
	// 필드의 값을 화면에 출력하는 기능
	public void print() {
		System.out.println("주민등록번호 : " + sn);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}
