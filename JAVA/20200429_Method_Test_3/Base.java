
public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체생성하기
		// 좌측은 선언, 우측은 생성
		// Book b = new Book();

		// int형 등 -> 기본데이터
		// String 등 - > 참조데이터
		
		// 맴버변수는 객체 생성시에 초기화가 진행된다.
		// 지역변수는 사용하기 전에 반드시 초기화를 해야한다.

		// 선언만 된 상태, 즉 값이 없는상태 -> 사용할 수 없는상태
		// int num;
		 int num = 0;
		
		// 선언과 생성이 같이 된 상태 -> 사용할 수 있는 상태
		int i = 3;

		if (i < 5) { // i는 3이니까 3<5 조건물을 검사해서 true일 경우 {}를 실행
			num = 3; // 선언만 됬었던 num변수를 3이라는 값으로 초기화 
					 // 사용할 수 있는 상태로 변경
		}
		System.out.println(num); // num을 출력, num을 사용할수있는 상태이므로 출력가능
	}

}
