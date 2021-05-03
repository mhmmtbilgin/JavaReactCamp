package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop", "Asus Laptop" , 5000, 5 ,"Siyah");
		/*
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(5);
		product.setRenk("Mavi");
		
		*/
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		

	}

}

//Muhammet Bilgin...@mhmmtbilgin