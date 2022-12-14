package generation.italy.shop;

import java.util.Random;

public class Prodotto{
	
	Random rnd = new Random();
	
	int code;
	int price;
	int iva;
	String name;
	String description;
	
	public Prodotto(String name, String description, int price) {
		
		this.name = name;
		this.description = description;
		this.price= price;
		
		code = rnd.nextInt(10000, 99999);
		iva = 20;
	}
	
	public int price(int price) {
		
		return price;
	}
	
	public int priceIva() {
		
		return price + ((price * iva) / 100);
	}
	
	@Override
	public String toString() {

//		return super.toString();
		
		return "Prodotto: " + name
				+ "\ncodice: " + code
				+ "\ndescrizione: " + description
				+ "\nprezzo: " + price + "€"
				+ "\nprezzo + iva: " + priceIva() + "€";
	}
}
