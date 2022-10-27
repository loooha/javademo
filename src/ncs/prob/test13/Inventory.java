package ncs.prob.test13;

import java.util.Date;

public class Inventory {
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;

	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
	}

	public void setGetDate(Date setDate) {
		this.getDate = getDate;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

}
