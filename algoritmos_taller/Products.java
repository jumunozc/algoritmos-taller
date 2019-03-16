package algoritmos_taller;

public class Products extends Market{
	private String nombre;
	private int precio;
	
	public void datosProductos() {
		System.out.println("NOMBRE: "+this.nombre);
		System.out.println("PRECIO: $"+this.precio+" PESOS");
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
