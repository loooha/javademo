package java007_class.part04;

public class Insurance {
	String code; // 상품코드
	String name; // 상품이름
	String type; // 상품타입
	int payment; // 가격

	public Insurance() {
		// TODO Auto-generated constructor stub
	}

	public Insurance(String code, String name, String type, int payment) {
		this.code = code;
		this.name = name;
		this.type = type;
		this.payment = payment;
	}

	public String toString() {
		return String.format("%s %s %s %d\n", code, name, type, payment);
	}

}
