package harish.main;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account();
		account.setaNumber(123456789);
		account.setaBankName("ANDB");
		
		Employee employee = new Employee();
		employee.seteId(180020034);
		employee.seteName("Harish");
		
		
		System.out.println("Employee Details are ::  ");
		System.out.println(employee.geteName());
		System.out.println(employee.geteId());
		
		System.out.println();
		System.out.println("Account Details are :: ");
		System.out.println(account.getaBankName());
		System.out.println(account.getaNumber());
	}

}
