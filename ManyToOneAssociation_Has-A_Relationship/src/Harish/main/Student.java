package Harish.main;

//Target Injection

public class Student {

	 String sName;
	 int sId;
	
	Branch branch;

	public Student(String sName, int sId, Branch branch) {
		super();
		this.sName = sName;
		this.sId = sId;
		this.branch = branch;
	}

	public void getBranchDetails() {
		System.out.println("Branch Name : " + branch.bName);
		System.out.println("Branch Code : " + branch.bCode);
		System.out.println("Student Details :: ");
		System.out.println("Student name: " + sName);
		System.out.println("Student ID: " + sId);
		
		System.out.println();
		System.out.println();
	}
	
	
	
}
