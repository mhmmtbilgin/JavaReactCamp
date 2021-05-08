package eCommerce.bussines.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.bussines.abstracts.UserService;
import eCommerce.core.MailService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private MailService mailService;
	String regex = "^(.+)@(.+)$";
	

	public UserManager(UserDao userDao ,MailService mailService) {
		this.userDao = userDao;
		this.mailService=mailService;
	}

	@Override
	public void add(User user) {
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());

		if (!(user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 && matcher.matches() == true
				&& user.getPassword().length() >= 6)) {

			System.out.println("Kullanici Eklenemedi: " + user.getFirstName());
			return;
		}
		this.userDao.add(user);
		this.mailService.mailTo("Dogrulama e-postasi: " + user.getEmail() + "'e gonderildi.");
		this.mailService.verificationLink("Link'e tikladi : " + user.getEmail());

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
//Muhammet Bilgin...@mhmmtbilgin
