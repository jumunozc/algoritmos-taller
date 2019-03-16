package cotel;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		preparacion coctel = new preparacion();
		coctel.menu();
		coctel.showCoctails();

	}

}
