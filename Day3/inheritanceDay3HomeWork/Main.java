package inheritanceDay3HomeWork;

public class Main {

	public static void main(String[] args) {

		
		Student students = new Student();
		students.setId(1); 
		students.setNationalIdentity("6789123456");
		students.setFirstName("Muhammet");
		students.setLastName("Bilgin");
		students.setEmail("muhammetbilginn@gmail.com");
		students.setAddress("Istanbul, Turkey");
		students.setContact("0500 000 00 00");
		students.setBirthdate("30 / 04 / 2021");
		students.setLesson("Java & React Egitimi");
		students.setStudentNumber("202000002"); 
		students.setStudentEducationDegree("Lisans"); 
		
		Instructor instructors = new Instructor();
		instructors.setId(2); 
		instructors.setNationalIdentity("22222");
		instructors.setFirstName("Engin");
		instructors.setLastName("Demirog");
		instructors.setEmail("engindemirog@gmail.com");
		instructors.setAddress("Ankara, Turkey");
		instructors.setContact("0500 000 00 00");
		instructors.setBirthdate("01 / 01 / 1988");
		instructors.setLesson("Java & React Egitimi | C# & Angular Egitimi");
		instructors.setInstructorNumber("20200430001");
		instructors.setInstructorAbout("..........");
		
		User[] users = {students, instructors};
		
		System.out.println("Burasi User Ekleme");
		UserManager usermanager = new UserManager();
		usermanager.addMultiple(users);
	
		
		System.out.println("_____________________________________________");
		
		System.out.println("Burasi Student Ekleme, Silme, Guncelleme");
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(students);
		studentManager.delete(students);								
		studentManager.update(students);
		
		
		System.out.println("_____________________________________________");
		
		System.out.println("Burasi Egitmen Ekleme, Silme, Guncelleme");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructors); 
		instructorManager.delete(instructors); 	
		instructorManager.update(instructors); 
	}

}

//Muhammet Bilgin...@mhmmtbilgin