package java009_inheritance.prob.part01;

public class ClassTest_2 extends ClassTest_1 {
	String department;

	public ClassTest_2() {

	}

	public ClassTest_2(String department) {
		this.department = department;
	}

	public ClassTest_2(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	void callSuperThis() {
		prn();
		System.out.println("서브클래스");
	}

	@Override
	public void getInformation() {
		System.out.println("이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + department);
	}
}
