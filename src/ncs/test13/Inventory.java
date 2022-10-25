package ncs.test13;

import java.sql.Date;

public class Inventory {
	private String productName; // 상품명
	private Date putDate; // 입고일
	private Date getDate; // 출고일
	private int putAmount; // 입고수량
	private int getAmount; // 출고수량
	private int inventoryAmount; // 재고수량

	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public Inventory(String productName, Date putDate, Date getDate, int putAmount, int getAmount,
			int inventoryAmount) {
		this.productName = productName;
		this.putDate = putDate;
		this.getDate = getDate;
		this.putAmount = putAmount;
		this.getAmount = getAmount;
		this.inventoryAmount = inventoryAmount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

	@Override
	public String toString() {
		return String.format("");
	}

}
