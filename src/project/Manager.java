package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	ArrayList<Menu> mList = new ArrayList<Menu>(); // 메뉴리스트(메뉴판)
	ArrayList<Menu> oList = new ArrayList<Menu>(); // 주문내역
	ArrayList<Integer> count = new ArrayList<Integer>(); // 주문수량
	Menu m = new Menu();

	// 1. 메뉴추가
	public void addMenu(Scanner sc) {
		System.out.print("추가할 메뉴의 이름 입력: \n");
		String name = sc.next();
		System.out.print("추가할 메뉴의 가격 입력: \n");
		int price = sc.nextInt();
		mList.add(new Menu(name, price));
		System.out.println("====추가 완료====");
	}

	// 2. 메뉴삭제
	public void removeMenu(Scanner sc) {
		System.out.print("삭제할 메뉴의 번호 입력: \n");
		int menuNum = sc.nextInt();
		mList.remove(menuNum - 1);
		System.out.println("삭제되었습니다.");
	}

	// 3. 메뉴판(메뉴리스트)
	public void menuList() {
		int menuNum = 1;
		System.out.println("----메뉴----");
		for (int i = 0; i < mList.size(); i++) {
			System.out.print("메뉴번호 " + menuNum + "." + mList.get(i));
			menuNum++;
		}
		System.out.println("------------");
	}

	// 4. 주문
	public void orderMenu(Scanner sc) {
		System.out.println("주문할 메뉴의 번호를 입력해주세요.");
		System.out.print("입력 > ");
		int orderNum = sc.nextInt();
		int price = mList.get(orderNum - 1).getPrice();
		System.out.println("선택한 메뉴의 주문 수량을 입력해주세요.");
		System.out.print("수량 > ");
		int orderCnt = sc.nextInt();
		String menu = mList.get(orderNum - 1).getName();
		System.out.println("주문이 추가 되었습니다.");
		System.out.printf("주문 메뉴: %5s \t 가격:%5d원\n", menu, price);
		System.out.println("주문 수량: " + orderCnt);
		System.out.println("합계 금액: " + price * orderCnt);
		oList.add(mList.get(orderNum - 1));
		count.add(orderCnt);
		System.out.println("----주문 완료----");
	}

	// 5. 주문내역확인
	public void orderList() {
		int sum = 0;
		int cnt;
		System.out.println("----주문 내역----");
		for (int i = 0; i < oList.size(); i++) {
			System.out.print(oList.get(i));
			System.out.println(count.get(i) + "개");
			cnt = (oList.get(i).getPrice()) * (count.get(i));
			sum = sum + cnt;
		}
		System.out.println("주문 총액: " + sum + "원");
	}

	// 6. 주문수정
	public void changOrder(Scanner sc) {
		System.out.println("주문 변경 할 메뉴의 번호를 입력해주세요.");
		System.out.print("입력 > ");
		int num = sc.nextInt();
		System.out.println("변경 할 수량을 입력해주세요.");
		System.out.print("입력 > ");
		count.set(num - 1, sc.nextInt());
		System.out.println("변경이 완료되었습니다. 주문내역을 다시 확인해주세요.");
	}

}
