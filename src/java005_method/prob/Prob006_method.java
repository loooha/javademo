package java005_method.prob;

public class Prob006_method {

	public static void main(String[] args) {
		System.out.println("<< 15 까지의 소수 >>");
		primeNumber(15);
		System.out.println("<< 32 까지의 소수 >>");
		primeNumber(32);
	}//end main( )

	private static void primeNumber(int num) {
		// 구현하세요.
		for(int i=0; i <= 15; i++) {
			if(15%i == 0) {
				primeNumber(15);
			}
			i=0;
			if(32%i==0) {
				primeNumber(32);
			}
		}

	}// end primeNumber( )
}//end class