package harish.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Harish", 180020034);
		Employee e2 = new Employee("Suhas", 180020004);
		Employee e3 = new Employee("Jagadeesh",180020017);

		Employee[] emps = new Employee[3];
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;

		// Constructor Injection
		Department department = new Department(2,"Civil",emps);

		department.departmentDetails();
	}

}
