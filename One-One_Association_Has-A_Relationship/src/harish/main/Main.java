package harish.main;

/* 1.One-To-One Association:
              It is a relation between entities, where one instance of an entity should be mapped with exactly one instance of another entity. 
              eg: Every employee should have exactly one Account. */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account(123456789, "Harish" , "Savings");
		
		//constructor injection
		
		Employee employee = new Employee("Harish",180020034,"Kurnool",account);
		
		// System.out.println(employee);    we can also use this like primitive injection
	    employee.getEmployeeDetails();

		
	}

}
