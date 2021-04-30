package inheritanceDay3HomeWork;

public class User {
	private int id;
	private String nationalIdentity;
	private String email;
	private String firstName;
	private String lastName;
	private String address;
	private String contact;
	private String birthdate;
	private String lesson;
	
	public User() {
		
		
	}
	

	public User(int id, String nationalIdentity, String email, String firstName, String lastName, String address,
			String contact, String birthdate) {
		
		this.id = id;
		this.nationalIdentity = nationalIdentity;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contact = contact;
		this.birthdate = birthdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	public String getLesson() {
		return lesson;
	}


	public void setLesson(String lessons) {
		this.lesson = lessons;
	}

}

//Muhammet Bilgin...@mhmmtbilgin