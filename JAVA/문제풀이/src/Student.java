// Sub Class
public class Student extends Human {

	private String ssn;		// 학번
	
	public Student(String sn, String name, int age, String ssn) {
		super(sn, name, age);
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("학번 : " + ssn);
	}
}
