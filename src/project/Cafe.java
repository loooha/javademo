package project;

import java.util.Scanner;

// 1.메뉴추가 | 2.메뉴삭제 | 3.메뉴판 | 4.주문 | 5.주문내역확인 | 6.주문수정 | 7.종료
public class Cafe {

	public static void main(String[] args) {
		Manager mg = new Manager();
		Scanner sc = new Scanner(System.in);

		int selectNum = 1;
		while (selectNum != 7) {
			System.out.println("원하시는 서비스의 번호를 입력해주세요.");
			System.out.println("1.메뉴추가 | 2.메뉴삭제 | 3.메뉴판 | 4.주문 | 5.주문내역확인 | 6.주문수정 | 7.종료");
			System.out.print("입력 > ");
			selectNum = sc.nextInt();
			switch (selectNum) {
			case 1:
				mg.addMenu(sc);
				break;
			case 2:
				mg.removeMenu(sc);
				break;
			case 3:
				mg.menuList();
				break;
			case 4:
				mg.orderMenu(sc);
				break;
			case 5:
				mg.orderList();
				break;
			case 6:
				mg.changOrder(sc);
				break;
			case 7:
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
