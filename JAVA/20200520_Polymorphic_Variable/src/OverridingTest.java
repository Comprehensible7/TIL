
public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 부모의 모양을 가지고 있는 객체
		// 부모의 형태로 저장을하면 다른 자식객체들도 내용전달하면서 저장이 가능하다
		Person person = new Student("영희", 20, "0123457");
		// 자식의 모양을 가지고 있는 객체
		Student student = new Student("철수", 21, "0123456");
		
		// Person에 존재하지 않아서 사용 불가
		// String number = person.getNo();
		
		String report2 = student.printAll();
		String report1 = person.printAll();
		
		System.out.println("Student Report");
		// 오버라이드 된 메서드가 실행된다. 
		// 부모클래스에 메서드가 있더라도 자식쪽에서 진행하면 자식쪽에서 실행됨
		// 가장 가까운게 실행된다. 오버라이딩시 부모의 내용과 자식의 내용 둘다 들어간다
		System.out.println(report1);
		System.out.println(report2);
		
	}

}
