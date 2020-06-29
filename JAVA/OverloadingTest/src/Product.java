
public class Product {
	private final int defaultPrice = 10000;
	private String name;
	private int price;
	
	// �⺻������
	public Product() {
		// super();�� ��������
	}
	
	public Product(String name) {
		this.name = name;
		this.price = defaultPrice;
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}
