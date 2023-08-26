package Harish.main;

public class Main {

	public static void main(String[] args) {
		
		Branch branch = new Branch("Civil","18CE2022");
		
		Student student1 = new Student("Harish",180020034,branch);
		Student student2 = new Student("Suhas",180020004,branch);
		Student student3 = new Student("Jagadeesh",180020017,branch);
				
		student1.getBranchDetails();
		student2.getBranchDetails();
		student3.getBranchDetails();
	}
}
