package ncs.test05;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] book = new Book[3];
		book[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		book[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		book[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);

		for (Book data : book)
			System.out.printf("%s %s %d원 %s %2.0f%%할인\n할인된 가격: %.0f 원\n", data.getTitle(), data.getAuthor(),
					data.getPrice(), data.getPublisher(), data.getDiscountRate() * 100,
					data.getPrice() - (data.getPrice() * data.getDiscountRate()));

	}

}
