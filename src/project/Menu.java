package project;

public class Menu {
	private String name;
	private int price;

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String name, int price) {
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
		// TODO Auto-generated method stub
		return String.format("%5s \t 가격:%4d원\n", name, price);
	}

}
