package java017_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * [문제]
 * phone.txt파일에 저장된 값들을  phoneProduct()메서드에서
 * SmartPhone에 저장한 후 ArrayList에 추가한후 리턴하고,
 * prnDisplay()메소드에서 프로그램 실행결과처럼 출력하는 프로그램을
 * 구현하시오.
 * 
 * [프로그램 실행결과]
 * << 1 번째 상품 >>
	제품 아이디 : PROD-00001
	제품명 : 아이폰5
	가격 : 940000
	수량 : 4
	제조사 : 애플
   << 2 번째 상품 >>
	제품 아이디 : PROD-00002
	제품명 : 갤럭시S
	가격 : 860000
	수량 : 3
	제조사 : 삼성전자

 */
public class Prob003_ArrayList {

	public static void main(String[] args) {
		String pathFile = "./src/java017_collection/prob/phone.txt";
		ArrayList<SmartPhone> phoneList = phoneProduct(pathFile);
		prnDisplay(phoneList);
	}// end main()

	private static ArrayList<SmartPhone> phoneProduct(String pathFile) {
		// phone.txt파일의 데이터를 ArrayList에 저장한후 리턴하는 프로그램을 구현하시오.
		ArrayList<SmartPhone> smp = new ArrayList<SmartPhone>();
		try {
			Scanner sc = new Scanner(new File(pathFile));
			String[] data = sc.nextLine().split(":");
			SmartPhone sp = new SmartPhone();
			sp.setProductId(data[0]);
			sp.setName(data[1]);
			sp.setPrice(Integer.parseInt(data[2]));
			sp.setAmount(Integer.parseInt(data[3]));
			sp.setMaker(data[4]);
			smp.add(sp);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return smp;
	}// end phoneProduct( )

	private static void prnDisplay(ArrayList<SmartPhone> phoneList) {
		// phoneList매개변수의 저장된 값을 출력하는 프로그램을 구현하시오.
		for (int i = 0; i < phoneList.size(); i++) {
			System.out.printf("<< %d 번째 상품 >>\n", i + 1);
			System.out.println("제품 아이디 : " + phoneList.get(i).getProductId());
			System.out.println("제품명 : " + phoneList.get(i).getName());
			System.out.println("가격 : " + phoneList.get(i).getPrice());
			System.out.println("수량 : " + phoneList.get(i).getAmount());
			System.out.println("제조사 : " + phoneList.get(i).getMaker());
		}

	}// end prnDisplay( )

}// end class
