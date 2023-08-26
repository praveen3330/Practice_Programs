package harish.main;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		course course1 = new course("Java" , 8000);
		course course2 = new course("Python" , 6000);
		course course3 = new course("c#" , 5000);

		course course[] = new course[3];
		course[0] = course1;
		course[1] = course2;
		course[2] = course3;
		
		Student student1 = new Student("Harish",180020034,course);
		Student student2 = new Student("Suhas",180020004,course);
		Student student3 = new Student("Jagadeesh",180020017,course);
		
		student1.getStudentDetails();
		student2.getStudentDetails();
		student3.getStudentDetails();
	}

}
