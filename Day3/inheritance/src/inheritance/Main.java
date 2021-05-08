package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer muhammet =new IndividualCustomer();
		muhammet.id=1;
		muhammet. customerNumber="12345";
		muhammet.firstName="Muhammet";
		muhammet.lastName="Bilgin";
		muhammet.nationalIdentity="1000000000";
		
		
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.companyName="Hepsi Burada";
		hepsiBurada.customerNumber="78910";
		
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="99999";
		
		
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {muhammet ,hepsiBurada, abc};
		
		//customerManager.add(hepsiBurada);
		//customerManager.add(muhammet);
		//customerManager.add(abc);
		customerManager.addMultiple(customers);
		
	}

}
//Muhammet Bilgin...@mhmmtbilgin
