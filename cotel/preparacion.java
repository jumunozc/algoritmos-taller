package cotel;

import java.util.*;



public class preparacion {
	Scanner sc = new Scanner(System.in);

	private ArrayList<coctelFav>coctel;

	public preparacion() {

		coctel = new ArrayList<coctelFav>();

	}
	public void menu() {
		System.out.println("Introduce the amount of people: ");
		int cantPersonas = sc.nextInt();
		System.out.println("Is everyone gonna drink the coctail: YES/NO");
		String respuesta = sc.next();
		if(respuesta.equals("YES")) {
			System.out.println();
			System.out.println("ALEXANDER COCTAIL");
			System.out.println("3 CL COÑAC OR BRANDY");
			System.out.println("3 CL CACAO CREAM");
			System.out.println("3 CL LIQUID NATA");

			for (int i = 0; i < cantPersonas; i++) {



				coctelFav coctail = new coctelFav();
				coctail.setNombre("ALEXANDER COCTAIL");
				coctail.setIngredientes1("COÑAC OR BRANDY");
				coctail.setCantIngrediente1(3);
				coctail.setIngredientes2("CACAO CREAM");
				coctail.setCantIngrediente2(3);
				coctail.setIngredientes3("LIQUID NATA");
				coctail.setCantIngrediente3(3);
				coctel.add(coctail);
			}
		}else {
			System.out.println("Introduce the amount of people who's gonna drink: ");
			int cantNueva = sc.nextInt();
			System.out.println();
			System.out.println("ALEXANDER COCTAIL");
			System.out.println("3 CL COÑAC OR BRANDY");
			System.out.println("3 CL CACAO CREAM");
			System.out.println("3 CL LIQUID NATA");
			
			for (int i = 0; i < cantNueva; i++) {


				coctelFav coctail = new coctelFav();
				coctail.setNombre("ALEXANDER COCTAIL");
				coctail.setIngredientes1("COÑAC OR BRANDY");
				coctail.setCantIngrediente1(3);
				coctail.setIngredientes2("CACAO CREAM");
				coctail.setCantIngrediente2(3);
				coctail.setIngredientes3("LIQUID NATA");
				coctail.setCantIngrediente3(3);
				
				coctel.add(coctail);
			}
			
		}

	}
	
	public void showCoctails() {
		System.out.println("FINAL DATA");
		int brandyFinal = 0;
		int cacaoCream = 0;
		int liquidNata = 0;
		
		for (coctelFav coctelTemp : coctel) {
			if (coctelTemp instanceof coctelFav ) {
				System.out.println("____________COCTAIL INFO______________");
			}
			brandyFinal += coctelTemp.getCantIngrediente1();
			cacaoCream += coctelTemp.getCantIngrediente2();
			liquidNata += coctelTemp.getCantIngrediente3();
			coctelTemp.datosGenerales();
			
		}
		System.out.println();
		System.out.println("THE AMOUNT OF BRANDY OR COÑAC REQUIRED TO PREPARE THE COCTAILS IS: "+brandyFinal+"CL");
		System.out.println("THE AMOUNT OF CACAO CREAM REQUIRED TO PREPARE THE COCTAILS IS: "+cacaoCream+"CL");
		System.out.println("THE AMOUNT OF LIQUID NATA REQUIRED TO PREPARE THE COCTAILS IS: "+liquidNata+"CL");
	}

}
