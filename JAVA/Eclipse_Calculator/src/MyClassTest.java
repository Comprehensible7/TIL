
// [접근 지정자] [클래스 이름] (매개변수)
//		생성자 body

class MyClass {

	int age;
	// MyClass의 생성자
	// 클래스의 이름과 동일한 이름을 가지며 반환 타입은 존재하지 않는다.
	// 생성자가 호출될 때 전달받은 20은 newAge에 파라미터로 전달된다.

	public MyClass(int newAge) {
		age = newAge;
	}
}

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MyClass객체를 생성하면서 생성자에 20을 전달한다.
		MyClass mc = new MyClass(20);

		System.out.println("Age is : " + mc.age);
	}

}
