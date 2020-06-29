import java.util.Scanner;

public class Book2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 스캐너 클래스를 객체로 만든다
		Scanner sc = new Scanner(System.in);

		// Book Class의 객체생성
		Book b = new Book();

		// 책 제목을사용자로부터 입력받아서 Book객체에 저장하고 싶다.
		System.out.print("책 제목을 입력해 주세요 > ");
		String book_title = sc.nextLine();

		System.out.print("가격을 입력해 주세요 > ");
		int book_price = sc.nextInt();

		System.out.print("페이지수를 입력해 주세요 > ");
		int book_page = sc.nextInt();
		// System.out.println(book_title);

		// 1. Book 객체의 책 제목 변수에 직접 접근
		b.title = book_title;
		b.price = book_price;
		b.page = book_page;
		// System.out.println(b.title);

		// 2. Book 객체의 책 제목을 변경할 수 있는 기능을 가진 메소드를 실행
		b.setTitle(book_title);
		b.setPrice(book_price);
		b.setPage(book_page);

		// 3. Book객체의 책 제목을 반환하는 기능을 가진 메소드를 실행
		String return_title = b.getTitle();

		// System.out.println(return_title);

		// 4. Book객체의 전체 속성값을 출력해주는 기능을 가진 메소드를 실행
		b.printBookInfo();
	}

}
