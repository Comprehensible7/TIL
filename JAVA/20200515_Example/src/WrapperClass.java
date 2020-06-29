
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 3;
		int i = 257;
		
		// 생성자 생성
		// 위의 b값을 생성자에 대입
		Byte b2 = new Byte(b);
		// 위에 i값을 생성자에 대입
		Integer i2 = new Integer(i);
		
		// 대입한 값을 출력
		System.out.println(b2);
		System.out.println(i2);
		
		// 데이터를 byte타입으로 변환한다
		byte b3 = b2.byteValue();
		// 데이터를 int타입으로 변환한다
		int i3 = i2.intValue();
		
		// 타입변환한 값을 출력한다
		System.out.println("b3 = " + b3);
		System.out.println("i3 = " + i3);
		
		// String에 문자열을 넣는다.
		// 스트링에서 다뤄지는것은 문자열이기때문
		String strNum3 = "10";
		// String으로 작성한 값을 Int타입으로 형변환한다
		int i4 = Integer.parseInt(strNum3);
		
		// 위의 형변환식은 메서드로 본다면 아래와 같다
		// 클래스이름.함수 호출
		// static은 자원을 공유할때 사용
		// 자주사용하거나 유틸성이 있는 메서드를 만들때 static을 사용
//		public static int parseInt(String s) {
//			
//		} 
		long l4 = Long.parseLong(strNum3);
		double d4 = Double.parseDouble(strNum3);
		
		// 형변환 한 값을 출력
		System.out.println("i3 + i4 = " + (i3 + i4));
		
		
		String birth = "1990-12-21";
		String subStr = birth.substring(0, 4);
		int age = 2020-Integer.parseInt(subStr)+1;
		System.out.println();
		System.out.println("나이는 : " + age);

	}

}
