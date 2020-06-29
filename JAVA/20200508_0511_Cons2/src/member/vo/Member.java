package member.vo;

// 정보를 저장하는곳은 Vo
// 회원정보를 저장하는 클래스
public class Member {

	private String name;
	private int age;
	private String phone;

	// 생성자
	public Member() {

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
