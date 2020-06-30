
public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverridingTest2 t = new OverridingTest2();
		Student2 student2 = new Student2();
		// 내용은 Person2 p로 전달된다
		// person2가 부모의 형태라서 전달이 가능하다
		// t.method(student2); // 메소드 실행

		Teacher teacher = new Teacher();
		t.method2(teacher);
	}

	public void method(Person2 p) {
		// instanceof는 상속일때만 사용가능하다
		if (p instanceof Student2) {
			Student2 s = ((Student2) p);
			System.out.println(s.who);
		} else if (p instanceof Teacher) {
			Teacher t = ((Teacher) p);
			System.out.println(t.who);
		}
	}

	// Person p = new Person2(); / name, age
	// Person p = new Student2(); / (name,age) who 중에서 name,age만 가져옴
	// 뭐가 오느냐에따라서 값이 달라진다
//	public void method(Person2 p) {
//		
//		// 앞에있는 객체가 뒤에있는 타입이냐고 체크하는것이다. True or False
//		if (p instanceof Student2) {
//			// 객체 형변환 진행
//			Student2 s = ((Student2) p);
//			System.out.println(s.who);
//		} else {
//			System.out.println("I don't know");
//		}
//	}

	public void method2(Teacher t) {
		System.out.println(t.who);
	}
}
