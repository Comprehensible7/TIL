
public class AbstractTest {

	public static void doPrint(Person p) {
		if(p instanceof Student) {
			p.printInfo();
			Student s = (Student)p;
			s.printInfo();
			s.study();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Student("홍길동", 28, "어느시 어느구 어느동", 90);
		doPrint(p);
		
	}

}
