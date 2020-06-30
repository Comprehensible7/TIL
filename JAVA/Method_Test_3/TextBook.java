
public class TextBook {

	// int 자료형의 '값'을 반환한다.
	public int fnc1() {
		int a = 10;
		return a;
	}
	
	public String fnc2() {
		return "문자열";
	}
	
	// 참조자료형 전달할때는 그 참조자료형을 가지고 있는 객체,변수를 전달
	public int[] fnc3() {
		int[] ary = new int[3];
		return ary;
	}
	

	// 객체생성하기
	// 좌측은 선언, 우측은 생성
	// Book b = new Book();
	
//	public Book fnc4() {	
//		Book b = new Book();
//		return b;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 메서드는 객체의 행위(기능)를 나타낸다.

		// public
		// 접근지정자, 외부, 내부로부터의 접근 제어를 나타낸다.

		// void 반환형(return type)
		// 메소드가 종료되었을때 메소드를 호출한곳으로 반환하는 데이터 타입
		// 기본자료형, 참조자료형, void 등이 올수있다.

		// setPage : 메소드의 이름
		// 관례상 소문자로 시작하고 다음 구분 단어의 첫 글자 마다 대문자로 표현

	}

}
