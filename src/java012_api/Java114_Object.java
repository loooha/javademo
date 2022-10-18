package java012_api;

/*
 * JAVA API(Application Programming Interface)
 * Object
 * 1. 클래스 중에서 최상의 클래스이다.
 * 2. Object를 제외한 모든 클래스들은 Object를 상속받고 있다.
 * 3. java.lang 패키지에서 제공하는 클래스이다.
 */

public class Java114_Object {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());

		int x = 5;
		int y = 5;
		// 값 비교 (기본데이터 타입)
		System.out.printf("x=%d y=%d x==y:%b\n", x, y, x == y);

		Object obt = new Object();
		// == 주소비교(참조데이터 타입)
		System.out.printf("obj==obt:%b\n", obj == obt);

		// .equals( ) : 주소비교 - 객체비교만 가능하다.
		System.out.printf("obj.equals(obt):%b\n", obj.equals(obt));

		// class java.lang.Object
		System.out.println(obj.getClass());

		// java.lang.Object
		System.out.println(obj.getClass().getName());

		int num = obj.hashCode();
		System.out.println(num);
	}

}
