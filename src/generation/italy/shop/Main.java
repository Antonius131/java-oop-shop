package generation.italy.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto product = new Prodotto("Camicia", "Una bella camicia", 30);
		System.out.println(product);
		
		Prodotto product2 = new Prodotto("Maglia", "Una bella maglia", 10);
		System.out.println(product2);		
	}
}
