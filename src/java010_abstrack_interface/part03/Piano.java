package java010_abstrack_interface.part03;

public class Piano extends Instrument {
	public Piano() {

	}

	public Piano(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("손가락으로 누른다.");

	}

}
