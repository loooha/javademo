package java1005_basic;

/*
 * 리터널(literal): 그 자체의 값(1, 2, 3, ..., 'a','b','c',...., true, false)
 * 변수(variable): 하나의 값을 저장하기 위한 메모리 공간
 * 
 * 자바에서 제공하는 테이터 타입
 * 1. Primitive DataType (기본 데이터 타입)
 *   문자 - char(2byte)
 *   숫자 - 정수 - byte(1byte), short(2byte), int(4byte), long(8byte)
 *       - 실수 - float(4byte), double(8byte)
 *   논리 - boolean(1byte)
 *   
 * 2. Reference DataType (참조 데이터 타입)
 *   Array, Class, Interface
 *
 * 시스템에서 인식하는 데이터 타입 크기
 *  byte < char, short < int < long < float < double
 *  
 * */

public class Java003_dateType {
	public static void main(String[] args) {
		//(1)변수 선언
		int data; //데이터타입 변수명;
		
		//(2)값을 할당
		data =3; //data변수에 3값을 할당(저장)
		
		//int data = 3;
		
		System.out.println(data); //3
		
		data =10;
		System.out.println(data); //10
		
		double avg = 4;
		//Type mismatch: cannot convert from double to int
		//크기 값이 다르기때문에 저장이 안됨
		//int num = 4.0;
		
		//Type mismatch: cannot convert from float to long
		//강제 저장시킬 수는 있지만 큰데이터를 작은 공간에 넣을때 데이터 손실이 일어날 수 있음
		//long ko = 4.0F;
		
		int x = 0101; //8진수 표현
		System.out.println(x); //65
		
		int y = 65; //10진수 표현
		System.out.println(y); //65
		
		int z = 0B101; //2진수 표현 (0B101 == 0b101)
		System.out.println(z); //5
		
		int k = 0X101; //16진수로 표현 (0X101 == 0x101)
		System.out.println(k); //257
		
	}
	
}
