package eCommerce.bussines.concretes;

import eCommerce.bussines.abstracts.LoginService;
import eCommerce.entities.concretes.User;


public class LoginManager implements LoginService {
	
	private User user;

	public LoginManager() {
		
	}

	public LoginManager(User user) {
		this.user = user;
	}

	@Override
	public void login(String mail, String password) {
		// TODO Auto-generated method stub
		if (user.getEmail()== mail && user.getPassword()== password) {
			System.out.println("Hos geldiniz : " + user.getFirstName());
			return;
			
		}else {
			System.out.println("Kullanici adi veya sifre gecersiz.");
		}
		
	
		
		
	}
	
	


}


//Muhammet Bilgin...@mhmmtbilgin