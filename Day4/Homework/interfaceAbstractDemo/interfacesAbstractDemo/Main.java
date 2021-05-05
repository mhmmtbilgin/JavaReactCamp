package interfacesAbstractDemo;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter()) ;
		customerManager.save(new Customer(1,"Muhammet","BILGIN",LocalDate.of(1995, 03, 22),"34151373300"));
		
		
		
		/*
		Customer customer = new Customer();
		customer.setId(2);
		customer.setFirstName("Huseyin");
		customer.setLastName("Dayanir");
		customer.setDateOfBirth(LocalDate.of(1995, 8, 23));
		customer.setNationalityId("1551515355313");
		customerManager.save(customer);
		
		
		Customer customer2 = new Customer();
		customer2.setId(3);
		customer2.setFirstName("Emre");
		customer2.setLastName("Goc");
		customer2.setDateOfBirth(LocalDate.of(1995, 6, 13));
		customer2.setNationalityId("12412412414");
		customerManager.save(customer2);
		
		*/
		
	}

}


//Muhammet Bilgin...@mhmmtbilgin