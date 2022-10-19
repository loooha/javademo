package java013_api;

import java.util.Scanner;

/*
 * 단입력 : 5
 * 5 X 1 = 5
 * 5 X 2 = 10
 * . . .
 * 5 X 9 = 45
 * 계속하시겠습니까? (종료:n, 계속:아무키) n
 * 프로그램종료
 */

public class Java143_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("단입력: ");
			int dan = sc.nextInt();
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %2d\n", dan, i, dan * i);
			}
			System.out.print("계속하시겠습니까?(종료:n, 계속:아무키): ");
			String chk = sc.next();
			// 주의! (chk == "n") 비교연산자로 할경우 주소비교가 일어나서 false값이 되어버림
			if (chk.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램 종료");

	}

}
