
public class Book {

	
	// * ���� �޼ҵ尡 ������ �� Ŭ������ �����ϴ� Ŭ������ �ƴϴ� * 
	
	// �ɹ����� Ȥ�� ��������
	
	String title; // å ����, ����������
	int page; // ������ ��, �⺻������
	int price; // ����, �⺻������
	int[] ary; 
			
	// * null = ��� �����͵� ���»��� *
	
	// �޼ҵ�
	public String getTitle() {
		return title;
	}

	// �޼ҵ�
	public void setTitle(String bookTitle) {
		// title�� ��ȯ�Ѵ�.
		// title�� ���� �׸��� ���� ��ȯ�ϴµ�?
		this.title = bookTitle;
	}

	// �޼ҵ�
	public int getPage() {
		return page;
	}

	// �޼ҵ�
	public void setPage(int bookPage) {
		this.page = bookPage;
	}

	// �޼ҵ�
	public int getPrice() {
		return price;
	}

	// �޼ҵ�
	public void setPrice(int bookPrice) {
		this.price = bookPrice;
	}

	// �޼ҵ�
	public void printBookInfo() {
		System.out.println("Title : " + title + ", Page : " + page + ", Price : " + price);
	}

}
