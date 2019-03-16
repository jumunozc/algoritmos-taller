package cotel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;



public class preparacion {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	Scanner sc = new Scanner(System.in);

	private ArrayList<coctelFav>coctel;

	public preparacion() {

		coctel = new ArrayList<coctelFav>();

	}
	public void menu() throws IOException {
		bw.write("Introduce the amount of people: "+"\n");
		bw.flush();
		String entrada = br.readLine();
		int cantPersonas = Integer.parseInt(entrada);
		bw.write("Is everyone gonna drink the coctail: YES/NO"+"\n");
		bw.flush();
		String respuesta = br.readLine();
		if(respuesta.equals("YES")) {
			System.out.println();
			bw.write("ALEXANDER COCTAIL"+"\n");
			bw.flush();
			bw.write("3 CL COÑAC OR BRANDY"+"\n");
			bw.flush();
			bw.write("3 CL CACAO CREAM"+"\n");
			bw.flush();
			bw.write("3 CL LIQUID NATA"+"\n");
			bw.flush();
			
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
			bw.write("Introduce the amount of people who's gonna drink: "+"\n");
			bw.flush();
			String cant = br.readLine();
			int cantNueva = Integer.parseInt(cant);
			System.out.println();
			bw.write("ALEXANDER COCTAIL"+"\n");
			bw.flush();
			bw.write("3 CL COÑAC OR BRANDY"+"\n");
			bw.flush();
			bw.write("3 CL CACAO CREAM"+"\n");
			bw.flush();
			bw.write("3 CL LIQUID NATA"+"\n");
			bw.flush();
			
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
	
	public void showCoctails() throws IOException {
		bw.write("FINAL DATA"+"\n");
		bw.flush();
		int brandyFinal = 0;
		int cacaoCream = 0;
		int liquidNata = 0;
		
		for (coctelFav coctelTemp : coctel) {
			if (coctelTemp instanceof coctelFav ) {
				bw.write("____________COCTAIL INFO______________"+"\n");
				bw.flush();
			}
			brandyFinal += coctelTemp.getCantIngrediente1();
			cacaoCream += coctelTemp.getCantIngrediente2();
			liquidNata += coctelTemp.getCantIngrediente3();
			coctelTemp.datosGenerales();
			
		}
		System.out.println();
		bw.write("THE AMOUNT OF BRANDY OR COÑAC REQUIRED TO PREPARE THE COCTAILS IS: "+brandyFinal+"CL");
		bw.flush();
		bw.write("THE AMOUNT OF CACAO CREAM REQUIRED TO PREPARE THE COCTAILS IS: "+cacaoCream+"CL");
		bw.flush();
		bw.write("THE AMOUNT OF LIQUID NATA REQUIRED TO PREPARE THE COCTAILS IS: "+liquidNata+"CL");
		bw.flush();
	}

}
