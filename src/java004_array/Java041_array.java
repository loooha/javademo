package java004_array;

public class Java041_array {

	public static void main(String[] args) {
		int[] data1 = new int[3]; // 0 기본값 - 출력 0
		long[] data2 = new long[3]; // 0L 기본값 - 출력 0
		float[] data3 = new float[3]; // 0.0f 기본값 - 출력 0.0
		double[] data4 = new double[3]; // 0.0 기본값 - 출력 0.0
		char[] data5 = new char[3]; // \u0000 기본값(유니코드) - 출력 (공백)
		boolean[] data6 = new boolean[3]; // false 기본값 - 출력 false
		String[] data7 = new String[3]; //null 기본값 - 출력 null

		for (int i = 0; i < data1.length; i++) {
			System.out.printf("data1[%d]=%d\n", i, data1[i]);
		}

		for (int i = 0; i < data2.length; i++) {
			System.out.printf("data2[%d]=%d\n", i, data2[i]);
		}

		for (int i = 0; i < data3.length; i++) {
			System.out.printf("data3[%d]=%.1f\n", i, data3[i]);
		}

		for (int i = 0; i < data4.length; i++) {
			System.out.printf("data4[%d]=%.1f\n", i, data4[i]);
		}

		for (int i = 0; i < data5.length; i++) {
			System.out.printf("data5[%d]=%c\n", i, data5[i]);
		}

		for (int i = 0; i < data6.length; i++) {
			System.out.printf("data6[%d]=%b\n", i, data6[i]);
		}
		
		for (int i = 0; i < data7.length; i++) {
			System.out.printf("data7[%d]=%s\n", i, data7[i]);
		}

		System.out.println("====================");
		//https://www.techonthenet.com/unicode/chart.php
		char a = ' ';
		char b = '\u0020'; // 공백
		char c = '\u0000';
		char d = 0; // 숫자

		System.out.println(a == b); // true
		System.out.println(c == d); // true
	}

}
