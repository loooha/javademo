package java015_exception;

public class Java156_exception {

	public static void main(String[] args) {
		String data1 = "a";
		String data2 = "0";

		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			int res = x / y;
			System.out.println(res);
		} catch (ArithmeticException ex) {
			System.out.println(ex.toString());
		} catch (NumberFormatException ex) {
			System.out.println(ex.toString());
		} catch (RuntimeException ex) {
			// 상속관계에 있을땐 제일 상위 속성값을 제일 아래로 빼야함.
			System.out.println(ex.toString());
		}

	}

}
