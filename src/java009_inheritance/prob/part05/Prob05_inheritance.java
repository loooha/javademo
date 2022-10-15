package java009_inheritance.prob.part05;

/*
 * 12개월 이하: 병아리반
 * 13~36개월 이하: 토끼반
 * 37~60개월 이하: 기린반
 * 
 * [출력결과]
 * 이름: 김하늘
 * 성별: 여아
 * 개월수: 10개월
 * 반: 병아리반
 * ============
 * 이름: 이 산
 * 성별: 남아
 * 개월수: 22개월
 * 반: 토끼반
 * ============
 * 이름: 신바다
 * 성별: 여아
 * 개월수: 43개월
 * 반: 기린반
 * ============
 * 
 */

public class Prob05_inheritance {

	public static void main(String[] args) {
		Kindergartener kid1 = new Kindergartener("김하늘", "여아", 10);
		kid1.display();

		Kindergartener kid2 = new Kindergartener("이 산", "남아", 22);
		kid2.display();

		Kindergartener kid3 = new Kindergartener("신바다", "여아", 43);
		kid3.display();

	}

}