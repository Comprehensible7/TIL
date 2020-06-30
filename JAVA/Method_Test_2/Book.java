
public class Book {

	
	// * 메인 메소드가 없으면 그 클래스는 실행하는 클래스가 아니다 * 
	
	// 맴버변수 혹은 전역변수
	
	String title; // 책 제목, 참조데이터
	int page; // 페이지 수, 기본데이터
	int price; // 가격, 기본데이터
	int[] ary; 
			
	// * null = 어떠한 데이터도 없는상태 *
	
	// 메소드
	public String getTitle() {
		return title;
	}

	// 메소드
	public void setTitle(String bookTitle) {
		// title을 반환한다.
		// title이 뭔데 그리고 어디로 반환하는데?
		this.title = bookTitle;
	}

	// 메소드
	public int getPage() {
		return page;
	}

	// 메소드
	public void setPage(int bookPage) {
		this.page = bookPage;
	}

	// 메소드
	public int getPrice() {
		return price;
	}

	// 메소드
	public void setPrice(int bookPrice) {
		this.price = bookPrice;
	}

	// 메소드
	public void printBookInfo() {
		System.out.println("Title : " + title + ", Page : " + page + ", Price : " + price);
	}

}
