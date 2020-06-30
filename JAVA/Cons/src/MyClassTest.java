import com.sesoc.scit.MyClass2;

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MyClass객체를 생성하면서 생성자에 각 값의 내용을 전달한다.

		MyClass mc = new MyClass(20, "Q", true);
		
		System.out.println("age is : " + mc.age);
		System.out.println("name is : " + mc.name);
		System.out.println("isMale is : " + mc.isMale);
		
		MyClass mc2 = new MyClass();
		mc2.setAge(30);
		
		System.out.println("age is : " + mc2.age);
		
		MyClass2 mc3 = new MyClass2();
		
		
	}

}
