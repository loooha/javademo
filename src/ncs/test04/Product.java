package ncs.test04;

public class Product extends ProductTest {
	private String name;
	private int price;
	private int quantity;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void getInformation() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price + " 원");
		System.out.println("수량: " + quantity + " 개");
		System.out.printf("총 구매가격: %d 원", price * quantity);
	}

}
