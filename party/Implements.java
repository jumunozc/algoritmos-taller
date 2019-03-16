package party;

public class Implements extends Party {
	
	private String nameImplements;
	private int amountImplements;
	private int priceImplements;
	private int djPrice;
	private String dj;
	
	public int getDjPrice() {
		return djPrice;
	}

	public void setDjPrice(int djPrice) {
		this.djPrice = djPrice;
	}

	public String getDj() {
		return dj;
	}

	public void setDj(String dj) {
		this.dj = dj;
	}

	public void showData() {
		System.out.println("Item: "+this.nameImplements+" amount: "+this.amountImplements+" Price: "+this.priceImplements);
		System.out.println("Dj name: "+this.dj+" Cost of the Dj: "+this.djPrice);
	}
	
	public String getNameImplements() {
		return nameImplements;
	}
	public void setNameImplements(String nameImplements) {
		this.nameImplements = nameImplements;
	}
	public int getAmountImplements() {
		return amountImplements;
	}
	public void setAmountImplements(int amountImplements) {
		this.amountImplements = amountImplements;
	}
	public int getPriceImplements() {
		return priceImplements;
	}
	public void setPriceImplements(int priceImplements) {
		this.priceImplements = priceImplements;
	}
	
	

}
