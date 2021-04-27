package classesWithAttributes;

public class Product {
	
	public Product(int id , String name, String description, double price, int stockAmount, String renk ) {
		System.out.println("Yapici Blok1 Calisti...");
		this.id=id;
		this.renk = renk;
		this.name=name;
		this.price=price;
		this.description=description;
		this.stockAmount = stockAmount;
		
	}
	public Product() {
		System.out.println("Yapici Blok2 Calisti...");
	}

	// Attribute || field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getDescription() {
		return description;
	}
	void setDescription(String description) {
		this.description = description;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	int getStockAmount() {
		return stockAmount;
	}
	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	String getRenk() {
		return renk;
	}
	void setRenk(String renk) {
		this.renk = renk;
	}
	private String getKod() {
		return kod;
	}
	private void setKod(String kod) {
		this.kod = kod;
	}

	
	



}
//Muhammet Bilgin...@mhmmtbilgin
