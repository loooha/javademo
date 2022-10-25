package ncs.test03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		Calendar toDay = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");

		System.out.println(format.format(toDay));

	}

}
