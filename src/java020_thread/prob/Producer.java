package java020_thread.prob;

public class Producer implements Runnable {
	private VendingMachine vm;

	public Producer() {
		// TODO Auto-generated constructor stub
	}

	public Producer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + "음료수 No. " + i + " 자판기에 넣기");

			vm.putDrink("음료수 No. " + i);
		}

	}

}
