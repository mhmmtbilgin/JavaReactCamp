package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class AuthGoogle implements UserDao {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("Google ile Kullanici Eklendi: " + user.getFirstName() + " " +user.getLastName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
//Muhammet Bilgin...@mhmmtbilgin