package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if (ProductValidator.isValid(product)) {
			System.out.println("Veri tabanina eklendi...");
		} else {
			System.out.println("Urun bilgileri gecersizdir...");
		}

	}

}

//Muhammet Bilgin...@mhmmtbilgin