
public class Human {

	private String name;
	private String sn;
	private int age;
	
	// 기본생성자
	public Human() {
		
	}
	
	// 오버로딩
	public Human(String name) {
		
	}
	
	// 오버로딩
	public Human(int age) {
		
	}
	
	// 매개변수가 들어가고 내용이 정의된 생성자
	// 이름이 같고 매개변수가 다른것을 오버로딩 되었다고 한다.
	public Human(String name, String sn, int age) {
		this.name = name;
		this.sn = sn;
		this.age = age;
	}
	
	// Getter Setter 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
