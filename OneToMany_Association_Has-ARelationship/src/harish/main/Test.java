package harish.main;

public class Test {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.seteName("Harish");
		employee1.seteId(180020034);
		
		Employee employee2 = new Employee();
		employee2.seteName("Suhas");
		employee2.seteId(180020004);
		
		Employee employee3 = new Employee();
		employee3.seteName("Jagadeesh");
		employee3.seteId(180020017);
		
		
		
		Department department = new Department();
		department.setdId("18CE2022");
		department.setdName("Civil");
		
		System.out.println("Department details are :: ");
		System.out.println("Department ID : " + department.getdId());
		System.out.println("Department name : " + department.getdName());
		
		System.out.println();
		System.out.println("Employee details are :: ");
		
		System.out.println("Employee1 details are :: ");
		System.out.println("Employee1 name : " + employee1.geteName());
		System.out.println("Employee1 Id : " + employee1.geteId());
		
		System.out.println();
		System.out.println("Employee2 details are :: ");
		System.out.println("Employee2 name : " + employee2.geteName());
		System.out.println("Employee2 Id : " + employee2.geteId());
		
		System.out.println();
		System.out.println("Employee3 details are :: ");
		System.out.println("Employee3 name : " + employee3.geteName());
		System.out.println("Employee3 Id : " + employee3.geteId());
			
		}

}
