package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile Kullanici Eklendi.");
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile Kullanici guncellendi.");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile Kullanici silindi.");
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
