
//	다중 구현(인터페이스만 가능)
public class A8 implements Printable, Showable {

	public void print() {
		System.out.println("Hello");
	}
	
	public void show() {
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A8 obj = new A8();
		obj.print();
		obj.show();
		
	}

}
