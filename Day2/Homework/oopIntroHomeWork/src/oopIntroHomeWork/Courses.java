package oopIntroHomeWork;

public class Courses {
	int id;
	int progressPercentage;
	double price;
	String courseName;
	String courseTeacher;
	String useTechnologies;
	String courseDetail;
	String courseImages;

	public Courses(int id, int progressPercentage, double price, String courseName, String courseTeacher,
			String useTechnologies, String courseDetail, String courseImages) {
		this.id = id;
		this.progressPercentage = progressPercentage;
		this.price = price;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
		this.useTechnologies = useTechnologies;
		this.courseDetail = courseDetail;
		this.courseImages = courseImages;

	}

}
