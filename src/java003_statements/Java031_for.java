package java003_statements;

/*
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 * 
 */

public class Java031_for {

	public static void main(String[] args) {
		int data = 1;

		for (int row = 1; row <= 3; row++) { // 첫번째 for문은 열(가로)를 처리
			for (int col = 1; col <= 4; col++) { // 두번째 for문은 행(세로)를 처리
				System.out.printf("%4d", data++); //"%4d" : 4자리 출력

			} // end for col
			System.out.println(); // 단순 줄바꿈

		} // end for row

	} // end main()

} // end class
