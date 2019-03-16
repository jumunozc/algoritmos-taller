package cotel;

public class coctelFav extends preparacion{

	private String nombre;
	private String ingredientes1;
	private String ingredientes2;
	private String ingredientes3;
	private int cantIngrediente1;
	private int cantIngrediente2;
	private int cantIngrediente3;
	
	
	public void datosGenerales() {
		System.out.println("COCTAIL NAME: "+this.nombre);
		System.out.println("INGREDIENT 1: "+this.ingredientes1+" AMOUNT REQUIRED: "+this.cantIngrediente1+"CL");
		System.out.println("INGREDIENT 2: "+this.ingredientes2+" AMOUNT REQUIRED: "+this.cantIngrediente2+"CL");
		System.out.println("INGREDIENT 3: "+this.ingredientes3+" AMOUNT REQUIRED: "+this.cantIngrediente3+"CL");
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIngredientes1() {
		return ingredientes1;
	}


	public void setIngredientes1(String ingredientes1) {
		this.ingredientes1 = ingredientes1;
	}


	public String getIngredientes2() {
		return ingredientes2;
	}


	public void setIngredientes2(String ingredientes2) {
		this.ingredientes2 = ingredientes2;
	}


	public String getIngredientes3() {
		return ingredientes3;
	}


	public void setIngredientes3(String ingredientes3) {
		this.ingredientes3 = ingredientes3;
	}


	public int getCantIngrediente1() {
		return cantIngrediente1;
	}


	public void setCantIngrediente1(int cantIngrediente1) {
		this.cantIngrediente1 = cantIngrediente1;
	}


	public int getCantIngrediente2() {
		return cantIngrediente2;
	}


	public void setCantIngrediente2(int cantIngrediente2) {
		this.cantIngrediente2 = cantIngrediente2;
	}


	public int getCantIngrediente3() {
		return cantIngrediente3;
	}


	public void setCantIngrediente3(int cantIngrediente3) {
		this.cantIngrediente3 = cantIngrediente3;
	}
	

	
	
}
