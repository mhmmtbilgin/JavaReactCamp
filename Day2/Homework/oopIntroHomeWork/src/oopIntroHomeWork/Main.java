package oopIntroHomeWork;

public class Main {

	public static void main(String[] args) {
		Courses courses1 = new Courses(
				1,
				0,
				0.0,
				"Yazilim Gelistirici Kampi (Java + React)",
				"Engin Demirog",
				"Java + React",
				"2 ay surecek yazilim gelistirici yetistirme kampi duyurulari burada olacak",
				"Java kurs image");

		Courses courses2 = new Courses(
				2,
				0,
				0.0,
				"Yazilim Gelistirici Yetiştirme Kampi (C# + Angular)",
				"Engin Demirog",
				"C# + Angular", 
				"2 ay surecek yazilim gelistirici yetistirme kampi duyurulari burada olacak",
				"C# kurs image");

		Courses courses3 = new Courses(
				3,
				0,
				0.0,
				"Programlamaya Giris Icin Temel Kurs",
				"Engin Demirog",
				"C# ,Java , Python", 
				"2 ay surecek yazilim gelistirici yetistirme kampi duyurulari burada olacak",
				"kurs image");
		
		Courses[] courses = {courses1,courses2,courses3};
		
		for (Courses course : courses) {
			
			System.out.println(course.id);
			System.out.println(course.progressPercentage);
			System.out.println(course.price);
			System.out.println(course.courseName);
			System.out.println(course.courseTeacher);
			System.out.println(course.useTechnologies);
			System.out.println(course.courseDetail);
			System.out.println(course.courseImages);
		}
		Banners banner1= new Banners(1, "Profile","https://sso.teachable.com/secure/499959/current_user/profile" );
		Banners banner2= new Banners(2, "HomePage","https://www.kodlama.io/" );
		Banners banner3 = new Banners(3, "Kurslarim","https://www.kodlama.io/courses/enrolled" );
		Banners banner4 = new Banners(4, "Tum Kurslar","https://www.kodlama.io/courses" );
		Banners banner5 = new Banners(5, "Kampa Hazirlik","https://www.kodlama.io/p/kampa-hazirlik" );
		Banners banner6 = new Banners(6, "SSS","https://www.kodlama.io/p/sorular" );
		
		Banners[] banners = {banner1,banner2,banner3,banner4,banner5,banner6};
		
		for (Banners banner : banners) {
			System.out.println(banner.id);
			System.out.println(banner.bannerName);
			System.out.println(banner.bannerUrl);
			
		}
		
		CoursesManager courseManager= new CoursesManager();
		courseManager.addCourse(courses1);
		courseManager.updateCourse(courses1);
		courseManager.deleteCourse(courses2);
		courseManager.addCourse(courses3);

		
	}

}
