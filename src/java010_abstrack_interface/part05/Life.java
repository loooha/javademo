package java010_abstrack_interface.part05;

//extends ~~~ implements ~~~,~~~
public class Life extends Animal implements SampleA, SampleB {
	public Life() {
		System.out.println("Life");
	}

	@Override
	public void call() {
		System.out.println("Call");

	}

	@Override
	public void prn() {
		System.out.println("prn");

	}

}