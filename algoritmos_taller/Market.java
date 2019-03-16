package algoritmos_taller;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Market {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	

	private ArrayList<Products>productos;

	public Market() {

		productos = new ArrayList<Products>();
	}

	public void compras() throws IOException {
		bw.write("Introduce the amount of products you wish: "+"\n");
		bw.flush();
		String amount_ = br.readLine();
		int amount = Integer.parseInt(amount_);
		bw.write("Products avaliable on the Store: "+"\n");
		bw.flush();
		bw.write("1: MILK $15.000"+"\n");
		bw.flush();
		bw.write("2: BREAD $7.000"+"\n");
		bw.flush();
		bw.write("3: ORANGES $16.000"+"\n");
		bw.flush();
		bw.write("4: COOKIES $11.000"+"\n");
		bw.flush();
		bw.write("5: RICE $18.000"+"\n");
		bw.flush();
		bw.write("6: LENTIL $9.000"+"\n");
		bw.flush();
		bw.write("7: SHAMPOO $25.000"+"\n");
		bw.flush();
		bw.write("8: SOAP $5.000"+"\n");
		bw.flush();
		bw.write("9: CLOTHES SOAP $35.000"+"\n");
		bw.flush();
		bw.write("10: SPONGE $10.000"+"\n");
		bw.flush();
		bw.write("11: GLOVES(LATEX) $20.000"+"\n");
		bw.flush();
		bw.write("Please select the products:"+"\n");
		bw.flush();
		for (int i = 0; i < amount; i++) {
			String amountt = br.readLine();
				int product = Integer.parseInt(amountt);

				if(product == 1) {
					Products item = new Products();
					item.setNombre("MILK");
					item.setPrecio(15000);

					productos.add(item);
				}if(product == 2) {
					Products item = new Products();
					item.setNombre("BREAD");
					item.setPrecio(7000);

					productos.add(item);
				}if(product == 3) {
					Products item = new Products();
					item.setNombre("ORANGES");
					item.setPrecio(16000);
					productos.add(item);
				}if(product == 4) {
					Products item = new Products();
					item.setNombre("COOKIES");
					item.setPrecio(11000);
					productos.add(item);
				}if(product == 5) {
					Products item = new Products();
					item.setNombre("RICE");
					item.setPrecio(18000);

					productos.add(item);
				}if(product == 6) {
					Products item = new Products();
					item.setNombre("LENTIL");
					item.setPrecio(9000);

					productos.add(item);
				}if(product == 7) {
					Products item = new Products();
					item.setNombre("SHAMPOO");
					item.setPrecio(25000);
					productos.add(item);
				}if(product == 8) {
					Products item = new Products();
					item.setNombre("SOAP");
					item.setPrecio(5000);
					productos.add(item);
				}if(product == 9) {
					Products item = new Products();
					item.setNombre("CLOTHES SOAP");
					item.setPrecio(35000);

					productos.add(item);
				}if(product == 10) {
					Products item = new Products();
					item.setNombre("SPONGE");
					item.setPrecio(10000);
					productos.add(item);
				}if(product == 11) {
					Products item = new Products();
					item.setNombre("GLOVES(LATEX)");
					item.setPrecio(20000);
					productos.add(item);
				}


			
		}
	}
	
	public void showProducts() throws IOException {
		System.out.println("MARKET DATA");
		int finalPrice = 0;
		for (Products productTemp: productos) {

			if (productTemp instanceof Products ) {
				bw.write("____________ PRODUCT______________"+"\n");
				bw.flush();
			}
			finalPrice += productTemp.getPrecio();
			productTemp.datosProductos();
			
		}
		System.out.println();
		bw.write("THE MINIMUM AMOUNT OF MONEY YOU REQUIRE TO BUY ALL OF THIS IS: $"+finalPrice+" PESOS");
		bw.flush();

	}

}
