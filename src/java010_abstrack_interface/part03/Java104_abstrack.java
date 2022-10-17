package java010_abstrack_interface.part03;

public class Java104_abstrack {

	public static void main(String[] args) {
		Flute f = new Flute("Flute");
		System.out.println(f.name);
		f.play();

		Piano p = new Piano("Piano");
		System.out.println(p.name);
		p.play();

	}

}
