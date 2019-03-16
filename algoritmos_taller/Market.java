package algoritmos_taller;

import java.util.*;

public class Market {

	Scanner sc = new Scanner(System.in);

	private ArrayList<Products>productos;

	public Market() {

		productos = new ArrayList<Products>();
	}

	public void compras() {
		System.out.println("Ingrese cantidad de productos: ");
		int cant = sc.nextInt();
		for (int i = 0; i < cant; i++) {

			System.out.println("Productos disponibles en la tienda: ");
			System.out.println("1: LECHE $15.000");
			System.out.println("2: PAN $7.000");
			System.out.println("3: NARANJAS $16.000");
			System.out.println("4: GALLETAS $11.000");
			System.out.println("5: ARROZ $18.000");
			System.out.println("6: LENTEJAS $9.000");
			System.out.println("7: SHAMPOO $25.000");
			System.out.println("8: JABON $5.000");
			System.out.println("9: DETERGENTE $35.000");
			System.out.println("10: ESPONJAS $10.000");
			System.out.println("11: GUANTES(LATEX) $20.000");
			System.out.println("Favor seleccione los productos que desea llevar:");

				int producto = sc.nextInt();

				if(producto == 1) {
					Products item = new Products();
					item.setNombre("LECHE");
					item.setPrecio(15000);

					productos.add(item);
				}if(producto == 2) {
					Products item = new Products();
					item.setNombre("PAN");
					item.setPrecio(7000);

					productos.add(item);
				}if(producto == 3) {
					Products item = new Products();
					item.setNombre("NARANJAS");
					item.setPrecio(16000);
					productos.add(item);
				}if(producto == 4) {
					Products item = new Products();
					item.setNombre("GALLETAS");
					item.setPrecio(11000);
					productos.add(item);
				}if(producto == 5) {
					Products item = new Products();
					item.setNombre("ARROZ");
					item.setPrecio(18000);

					productos.add(item);
				}if(producto == 6) {
					Products item = new Products();
					item.setNombre("LENTEJAS");
					item.setPrecio(9000);

					productos.add(item);
				}if(producto == 7) {
					Products item = new Products();
					item.setNombre("SHAMPOO");
					item.setPrecio(25000);
					productos.add(item);
				}if(producto == 8) {
					Products item = new Products();
					item.setNombre("JABON");
					item.setPrecio(5000);
					productos.add(item);
				}if(producto == 9) {
					Products item = new Products();
					item.setNombre("DETERGENTE");
					item.setPrecio(35000);

					productos.add(item);
				}if(producto == 10) {
					Products item = new Products();
					item.setNombre("ESPONJAS");
					item.setPrecio(10000);
					productos.add(item);
				}if(producto == 11) {
					Products item = new Products();
					item.setNombre("GUANTES(LATEX)");
					item.setPrecio(20000);
					productos.add(item);
				}


			
		}
	}
	
	public void showProducts() {
		System.out.println("RECOPILACION DEL MERCADO");
		int precioTotal = 0;
		for (Products productoTemp: productos) {

			if (productoTemp instanceof Products ) {
				System.out.println("____________ PRODUCTO______________");
			}
			precioTotal += productoTemp.getPrecio();
			productoTemp.datosProductos();
			
		}
		System.out.println();
		System.out.println("SU PRESUPUESTO DEBE DE SER MINIMO DE: $"+precioTotal+" PESOS");

	}

}
