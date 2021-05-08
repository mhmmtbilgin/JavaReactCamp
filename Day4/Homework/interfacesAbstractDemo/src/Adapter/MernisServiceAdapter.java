package Adapter;






import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.*;



public class MernisServiceAdapter implements CustomerCheckService{

	
		
	
	@Override
	public boolean checkIfRealPerson(Customer customer){
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		Long kimlik = Long.parseLong(customer.getNationalityId(), 10);
		int dogumYili = customer.getDateOfBirth().getYear();
		try {
			return client.TCKimlikNoDogrula(kimlik, customer.getFirstName(), customer.getLastName(), dogumYili);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 return false;

	}

}

//Muhammet Bilgin...@mhmmtbilgin