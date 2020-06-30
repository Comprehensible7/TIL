import java.util.Scanner;

public class Book2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스를 객체로 만들어서 사용할때 사용하게됨
		// * 클래스 이름, 객체이름 = new 클래스이름(); *
		// 클래스이름(); - > 생성자(Constructor)
		
		// 기본데이터형을 선언
		//   선언 = 생성
		// int i = 10;
		
		// 참조데이터형을 선언
		// 선언 = 생성
		Book b = new Book();
		
		String s = b.getTitle();	// 반환 됬을때의 값의 형태가 String
									// 저장하기 위해서는 String 변수가 필요한 상황

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

	}

}
