package java010_abstrack_interface.part04;

public interface CarRun {
	int carCount = 5; // public static final catCount = 5;
	// public CarRun() {}
	// static {System.out.println("CarRun");}

	void prn(); // abstract public
	// void display(){ }

	class Sun {
		public Sun() {
			System.out.println("Sun Constructor");
		}
	}

}
