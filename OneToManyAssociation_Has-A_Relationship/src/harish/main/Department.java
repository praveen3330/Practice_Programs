package harish.main;

// Target Injection
public class Department {

	private int dId;
	private String dName;
	
	Employee[] emp;
	
	public Department(int dId, String dName, Employee emp[]) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.emp = emp;
	}
	
	public void departmentDetails() {
		System.out.println("Department Details are ------ ");
		System.out.println("Department Id - " + dId);
		System.out.println("Department Name - " + dName);
		
		System.out.println();
		
		System.out.println("Employee Details are --- ");
		for (Employee employee : emp) {
			System.out.println("Employee id     :: " + employee.eId);
			System.out.println("Employee name   :: " + employee.eName);
 
			System.out.println();
		}
	}
}
