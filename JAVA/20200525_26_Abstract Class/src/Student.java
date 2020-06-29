
class Student extends Person {

	private int grade;
	
	public Student(String name, int age, String addr, int grade) {
		super(name, age, addr);
		// TODO Auto-generated constructor stub
		this.grade = grade;
	}

	@Override
	public void printInfo() {
		
		System.out.println("name : " + name + "\n age : " + age + "\n addr : " + addr + "\n grade : " + grade);
		
	}
	
	public void study() {
		System.out.println("study");
	}
	
}
