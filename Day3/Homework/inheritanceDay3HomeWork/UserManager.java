package inheritanceDay3HomeWork;

public class UserManager {
	public void add(User user){
		System.out.println(user.getId()+ " idli " + user.getFirstName() + " isimli kullanici eklendi.." );
		
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
		
		
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli kullanici silindi.." );
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli kullanici guncellendi.." );
		
	}
}

//Muhammet Bilgin...@mhmmtbilgin
