package java003_statements.prob;

/*
1+
1+2+
1+2+3+
1+2+3+4+
1+2+3+4+5=??

출력결과
sum=35
*/
public class Prob_03 {

	public static void main(String[] args) {
		int sum = 0;
		int plus = 0;
		
		for(int i=1; i<=5; i++) {
			plus += i;
			sum += plus;
		}
		
		System.out.printf("sum=%d\n", sum);

	}// end main()

}// end class
