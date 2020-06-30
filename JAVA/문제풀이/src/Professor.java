// Sub Class
public class Professor extends Human {
	
	private String major;		// 전공
	
	// 기본 부모클래스의 내용은 가져오고 자식클래스에서 추가할 내용을 넣어준다
	public Professor(String sn, String name, int age, String major) {
		super(sn, name,age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("전공 : " + major);
	}
}
