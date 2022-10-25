package ncs.test15;

import ncs.test05.Book;

public class BookListTest {

	public static void main(String[] args) {
		Book[] book = new Book[3];
		book[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15);
		book[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2);
		book[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);

	}

}
