package inheritanceDay3HomeWork;

public class InstructorManager extends UserManager {
	
	public void addInstructor(User user) {
		System.out.println(user.getFirstName() + " isimli egitmen olarak eklendi.." );
		
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli egitmen kaydi silindi.." );
	}
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli egitmen kaydi guncellendi.." );
		
	}
}

//Muhammet Bilgin...@mhmmtbilgin