
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		short s = 20;
		char c = 'A';
		double d;
		byte b;
		
		float f = 3.14f;
		
		d = i;			// 자동 형변환
		b = (byte)s;	// 강제 형변환
		
		System.out.println();
		System.out.println("i = " + i);
		System.out.println("s = " + s);
		System.out.println("c = " + (int)c);
		System.out.println("d = " + d);
		System.out.println("b = " + b);
	}

}
