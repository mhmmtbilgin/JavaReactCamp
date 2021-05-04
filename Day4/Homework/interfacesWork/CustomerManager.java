package interfacesWork;

public class CustomerManager {
	private CustomerDal customerDal;
	
	public CustomerManager(CustomerDal customerDal) {
		
		this.customerDal=customerDal;
	}

	public void add() {
		//Burda is kodlari yazilir.
		customerDal.add();
	}
}


//Muhammet Bilgin...@mhmmtbilgin