package java009_inheritance.prob.part05;

public class Kindergartener extends Kindergarten {

	public Kindergartener(String name, String sex, int age) {
		super(name, sex, age);
	}

	private String kinderGroup() {
		if (age <= 12) {
			return "병아리반";
		} else if (age > 12 && age <= 36) {
			return "토끼반";
		} else {
			return "기린반";
		}
	}

	@Override
	public void display() {
		System.out.println("이름: " + name);
		System.out.println("성별: " + sex);
		System.out.println("개월수: " + age + "개월");
		System.out.println("반: " + kinderGroup());
		System.out.println("============");
	}

}
