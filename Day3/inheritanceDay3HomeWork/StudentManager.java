package inheritanceDay3HomeWork;

public class StudentManager extends UserManager {
	
	public void addStudent(User user) {
		
		System.out.println(user.getFirstName() + " isimli ogrenci olarak eklendi.." );
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli ogrenci kaydi silindi.." );
	}
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli ogrenci kaydi guncellendi.." );
		
	}

}

//Muhammet Bilgin...@mhmmtbilgin