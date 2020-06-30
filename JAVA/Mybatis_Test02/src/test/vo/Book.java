package test.vo;

public class Book {
	
	private int id;				// 등록번호
	// 도서번호, 도서이름, 도서가격, 출판사, 등록일자
	private String num, name, price, company, regidate; 
	
	// 기본생성자
	public Book() {
		// TODO Auto-generated constructor stub
	}

	// 생성자
	public Book(int id, String num, String name, String price, String company, String regidate) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.price = price;
		this.company = company;
		this.regidate = regidate;
	}
	
	// id없는 생성자
	public Book(String num, String name, String price, String company, String regidate) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.company = company;
		this.regidate = regidate;
	}

	// Getter Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRegidate() {
		return regidate;
	}

	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", num=" + num + ", name=" + name + ", price=" + price + ", company=" + company
				+ ", regidate=" + regidate + "]";
	}
}
