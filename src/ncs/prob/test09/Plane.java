package ncs.prob.test09;

public class Plane {
	private String planeName;
	private int fuelSize;

	public Plane() {
		// TODO Auto-generated constructor stub
	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) {

	}

	public void flight(int distance) {

	}
}
