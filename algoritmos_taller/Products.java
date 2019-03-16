package algoritmos_taller;

public class Products {
	private String nombre;
	private int precio;
	
	public void datosProductos() {
		System.out.println("NAME: "+this.nombre);
		System.out.println("PRICE: $"+this.precio+" PESOS");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int precio() {
		return precio;
	}
	
}
