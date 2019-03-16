package journey;

import java.util.ArrayList;
import java.util.Scanner;

public class journey {

	Scanner sc = new Scanner(System.in);

	private ArrayList<costs>journey;
	
	public journey() {
		journey = new ArrayList<costs>();
	}
	public void plan() {
		System.out.println("Introduce the amount of days per city: ");
		int cant = sc.nextInt();
		for (int i = 0; i < cant; i++) {

			System.out.println("Cities avaliable and price per day: ");
			System.out.println("1: CARTAGENA $90.000");
			System.out.println("2: SANTA MARTA $80.000");
			System.out.println("3: SANTA FE DE ANTIOQUIA $50.000");
			System.out.println("4: VILLA DE LEYVA $50.000");
			System.out.println("5: LETICIA $120.000");
			System.out.println("6: SAN ANDRES $150.000");
			System.out.println("Please select the destinations you want to put in your trip:");

				int city = sc.nextInt();

				if(city == 1) {
					costs place = new costs();
					place.setName("CARTAGENA");
					place.setPrice(90000);

					journey.add(place);
				}if(city == 2) {
					costs place = new costs();
					place.setName("SANTA MARTA");
					place.setPrice(80000);

					journey.add(place);
				}if(city == 3) {
					costs place = new costs();
					place.setName("SANTA FE DE ANTIOQUIA");
					place.setPrice(50000);
					
					journey.add(place);
				}if(city == 4) {
					costs place = new costs();
					place.setName("VILLA DE LEYVA");
					place.setPrice(50000);
					journey.add(place);
				}if(city == 5) {
					costs place = new costs();
					place.setName("LETICIA");
					place.setPrice(120000);

					journey.add(place);
				}if(city == 6) {
					costs place = new costs();
					place.setName("SAN ANDRES");
					place.setPrice(150000);

					journey.add(place);
				}


			
		}
	}
	public void showProducts() {
		System.out.println("JOURNEY DATA");
		int totalPrice = 0;
		for (costs trip: journey) {

			if ( trip instanceof costs ) {
				System.out.println("____________CITY______________");
			}
			totalPrice += trip.getPrice();
			trip.datosProductos();
			
		}
		System.out.println();
		System.out.println("YOU'LL NEED AT LEAST: $"+totalPrice+" PESOS FOR THIS TRIP");

	}

}
