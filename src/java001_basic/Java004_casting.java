package java001_basic;

/*
 * Ctrl + SpaceBar : 자동완성
 * 
 * Ctrl + / : 한 라인 주석 설정 및 해제
 * 
 * Ctrl + Shift + / : 여러 라인 주석 설정
 * Ctrl + Shift + \ : 여러 라인 주석 해제
 * 
 * Ctrl + Shift + F : 자동정렬
 * 
 * */

//(1byte 안에는 -128 ~ +128까지의 숫자값 할당이 가능)

public class Java004_casting {

	public static void main(String[] args) {
		byte bNum = 2; 
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; //L or l
		float fNum = 2.5f; //F or f
		double dNum = 7.4;
		char cData = 'a';
		boolean eNum = true; //true or false
		
		System.out.println(lNum);
		System.out.println(fNum);
		
		//형변환(casting)
		//묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생
		//명시적 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생
		long gNum = 6; //묵시적 형변환 : int => long
		System.out.println(gNum);
		
		float tNum = (float)2.5; //명시적 형변환 : double => flaot
		System.out.println(tNum);

		//왼쪽에서 오른쪽으로 갈때는 타입 명식 안해도 됨, 오른쪽에서 왼쪽으로 갈땐 반드시 명시할 것.
		//byte < char, short < int < long < float < double
		
		//데이터 손실이 발생되는 경우
		byte data = (byte)128;
		System.out.println(data); //-128
		
	} //end main()

} //end class
