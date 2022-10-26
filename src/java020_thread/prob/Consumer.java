package java020_thread.prob;

public class Consumer implements Runnable {
	private VendingMachine vm;

	public Consumer() {
		// TODO Auto-generated constructor stub
	}

	public Consumer(VendingMachine vm) {
		this.vm = vm;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + "음료수 No. " + i + " 꺼내먹음\n");

			//vm.getDrink("음료수 No. " + i);
		}

	}

}
