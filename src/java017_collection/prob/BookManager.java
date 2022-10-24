package java017_collection.prob;

import java.util.ArrayList;
import java.util.Iterator;

public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
		int sum = 0;
		for (BookDTO bk : bookList) {
			if (bk.getKind().equals(kind))
				sum += bk.getRentalPrice();
		}
		return sum;
	}// end getRentalPrice()
}// end class
