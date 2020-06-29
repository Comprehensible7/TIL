
public class Professor extends Human {

	private String major;

	public Professor(String sn, String name, int age, String major) {
		super(sn, name, age);
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
