package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1= new Product(1,"Lenovo V14",15800,"16 GB Ram",10 );//Referans olusturma, intance olusturma
		/*
		product1.id=1;
		product1.name="Lenovo V14";
		product1.unitPrice=15800;
		product1.detail="16 GB Ram";
		*/
		
		Product product2= new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Icecek");
		
		Category category2 =new Category();
		category2.setId(1);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		
		
		
		
		/*
		Product product3= new Product();
		
		
		
		Product[] products= {product1 , product2, product3};
		
		for (Product product : products) {
			
			System.out.println(product.getName());
		}
		System.out.println(products.length);
		
		Category category1 =new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 =new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		*/
		
		

	}

}


//Muhammet Bilgin...@mhmmtbilgin