package eCommerce;


import eCommerce.bussines.abstracts.LoginService;
import eCommerce.bussines.abstracts.UserService;
import eCommerce.bussines.concretes.LoginManager;
import eCommerce.bussines.concretes.UserManager;
import eCommerce.core.JMailManagerAdapter;
import eCommerce.dataAccess.concretes.AuthGoogle;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		UserService userService = new UserManager(new AuthGoogle(), new JMailManagerAdapter());
		User user1= new User(1, "Muhammet",	"Bilgin", "muhammet@gmail.com", "123546");
		userService.add(user1);
		System.out.println("_______________________________________________________________");
		LoginService loginService= new LoginManager(user1);
		loginService.login("muhammet@gmail.com", "123546");
	}

}

//Muhammet Bilgin...@mhmmtbilgin