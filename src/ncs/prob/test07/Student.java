package ncs.prob.test07;

public class Student extends Human {
	private String number;
	private String major;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int height, int weihht, String number, String major) {
		super(name, age, height, weihht);
		this.number = number;
		this.major = major;
	}

	@Override
	public String toString() {
		return String.format("");
	}

}
