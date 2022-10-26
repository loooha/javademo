package java020_thread.part05;

public class FamilyThraed extends Thread {
	private Washroom wr;
	private String who;

	public FamilyThraed() {
		// TODO Auto-generated constructor stub
	}

	public FamilyThraed(Washroom wr, String who) {
		this.wr = wr;
		this.who = who;
	}

	@Override
	public void run() {
		wr.openDoor(who);
	}

}
