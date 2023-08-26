package harish.main;

// Target Injection

public class Employee {

	private String name;
	private int id;
	private String adress;
	
	Account account;

	public Employee(String name, int id, String adress, Account account) {
		super();
		this.name = name;
		this.id = id;
		this.adress = adress;
		this.account = account;
	}

	//we use it when we like as primitive injection we can also use for associations also
/*	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getAdress() {
		return adress;
	}

	public Account getAccount() {
		return account;
	}*/

	// we use this toString method when we write as primitive injection we can also use it for associations also
	/* @Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", adress=" + adress + ", account=" + account + "]";
	} */
	
	public void getEmployeeDetails() {
		System.out.println("Employee Details are :: ");
		System.out.println("EMPID   ::  " + id);
		System.out.println("EMPNAME ::  " + name);
		System.out.println("EMPADDR ::  " + adress);
		System.out.println("==========================================");
		System.out.println("ACCOUNT Details are :: ");
		System.out.println("ACCNO   ::  " + account.accountNum);
		System.out.println("ACCNAME ::  " + account.accountName);
		System.out.println("ACCTYPE ::  " + account.accountType);
	}

}
