package journey;

public class costs {
	private String name;
	private int price;
	
	public void datosProductos() {
		System.out.println("City: "+this.name);
		System.out.println("Price per day: $"+this.price+" PESOS");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
