import java.util.Scanner;

public class Book2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ĳ�� Ŭ������ ��ü�� �����
		Scanner sc = new Scanner(System.in);

		// Book Class�� ��ü����
		Book b = new Book();

		// å ����������ڷκ��� �Է¹޾Ƽ� Book��ü�� �����ϰ� �ʹ�.
		System.out.print("å ������ �Է��� �ּ��� > ");
		String book_title = sc.nextLine();

		System.out.print("������ �Է��� �ּ��� > ");
		int book_price = sc.nextInt();

		System.out.print("���������� �Է��� �ּ��� > ");
		int book_page = sc.nextInt();
		// System.out.println(book_title);

		// 1. Book ��ü�� å ���� ������ ���� ����
		b.title = book_title;
		b.price = book_price;
		b.page = book_page;
		// System.out.println(b.title);

		// 2. Book ��ü�� å ������ ������ �� �ִ� ����� ���� �޼ҵ带 ����
		b.setTitle(book_title);
		b.setPrice(book_price);
		b.setPage(book_page);

		// 3. Book��ü�� å ������ ��ȯ�ϴ� ����� ���� �޼ҵ带 ����
		String return_title = b.getTitle();

		// System.out.println(return_title);

		// 4. Book��ü�� ��ü �Ӽ����� ������ִ� ����� ���� �޼ҵ带 ����
		b.printBookInfo();
	}

}
