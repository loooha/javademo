package ncs.test02;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double sum = 0;

		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			double data = Double.parseDouble(arr[i]);
			sum = sum + Double.parseDouble(arr[i]);

		}
		System.out.printf("합계: %.3f\n", sum);
		System.out.printf("평균: %.3f\n", sum / 5);

	}
}
