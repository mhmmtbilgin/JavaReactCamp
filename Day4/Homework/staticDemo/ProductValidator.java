package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static yapici blok calisti....");
	}

	public ProductValidator() {
		System.out.println("yapici blok calisti....");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
	//InnerClass 
	public static class BaskaBirClass{
		public static void sil() {
			
			
		}
	}
}



//Muhammet Bilgin...@mhmmtbilgin