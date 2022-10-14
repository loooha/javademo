package java009_inheritance.part02;

public class MyChild extends MyFather {
	public MyChild() { // 2
		super(); // 3
		// super : 자손에서 부모를 호출할 때 사용
		System.out.println("MyChild"); // 11
	}
}
