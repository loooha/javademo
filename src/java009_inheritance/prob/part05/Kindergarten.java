package java009_inheritance.prob.part05;

public class Kindergarten {
	String name;
	String sex;
	int age;

	public Kindergarten(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public void display() {
		System.out.println("이름: " + name);
		System.out.println("성별: " + sex);
		System.out.println("개월수: " + age + "개월");
		System.out.println("============");
	}

}
