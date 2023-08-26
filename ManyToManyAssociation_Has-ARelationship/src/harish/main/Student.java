package harish.main;

public class Student {

	private String sName;
	private int sID;
	
	course[] course;

	public Student(String sName, int sID, course[] course) {
		super();
		this.sName = sName;
		this.sID = sID;
		this.course = course;
	}
	
	public void getStudentDetails() {
		System.out.println("Student Details : ");
		System.out.println("Student Name : " + sName);
		System.out.println("Student Id : " + sID);
		System.out.println("Course Details : ");
		for(course c : course) {
			System.out.println("Course Name : " + c.cName);
			System.out.println("Course Name : " + c.cCost);
		}
		System.out.println();
	}
	
	
	
}
