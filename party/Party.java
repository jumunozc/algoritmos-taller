package party;

import java.util.*;


public class Party {

	Scanner sc = new Scanner(System.in);

	private ArrayList<Implements>itemsParty;

	public  Party() {
		itemsParty = new ArrayList<Implements>();
	}

	public void menu() {
		System.out.println("Introduce the amount of people that's going to assist to the party: ");
		int people = sc.nextInt();

		System.out.println("How many of them drink Beer: ");
		int beerPeople = sc.nextInt();
		
		if(people < beerPeople) {
			System.out.println("That's impossible");
		}else {
			
				Implements items = new Implements();
				items.setNameImplements("BEER");
				System.out.println("Introduce the amount of beers per person: ");
				items.setAmountImplements(sc.nextInt());
				items.setPriceImplements(1800*items.getAmountImplements());
				itemsParty.add(items);
			
		}
		System.out.println("Time to hire a DJ");
		System.out.println("1) (Alesso) 1.200.000 per hour");
		System.out.println("2) (Hardwell) 1.500.000 per hour");
		System.out.println("3) (Steve Aoki) 2.000.000 per hour");
		System.out.println("Pick one of the Dj's you wish to hire for the party: ");
		int pickDj = sc.nextInt();
		if(pickDj == 1) {
			Implements dj = new Implements();
			dj.setDj("Alesso");
			dj.setDjPrice(1200000);
			itemsParty.add(dj);
		}else if(pickDj == 2) {
			Implements dj = new Implements();
			dj.setDj("Harwell");
			dj.setDjPrice(1500000);
			itemsParty.add(dj);
			
		}else if(pickDj == 3) {
			Implements dj = new Implements();
			dj.setDj("Steve Aoki");
			dj.setDjPrice(2000000);
			itemsParty.add(dj);
		}




	}
	
	public void showParty() {
		System.out.println("DATA OF THE PARTY");
		int finalPrice = 0;
		int finalDj = 0;
		for (Implements partyItems : itemsParty) {
			
			if(partyItems instanceof Implements ) {
				System.out.println("_________PARTY__________");
			}
			finalPrice += partyItems.getPriceImplements();
			finalDj += partyItems.getDjPrice();
			partyItems.showData();
		}
		System.out.println("The final price of implements is: "+finalPrice);
		System.out.println("The price of the selected Dj is: "+finalDj);
		int fin = finalPrice+finalDj;
		System.out.println("Final price: "+fin);
		
	}

}
