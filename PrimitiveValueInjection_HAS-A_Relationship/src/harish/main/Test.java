package harish.main;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std1 = new Student();
		std1.setsName("Harish");
		std1.setsId(180020034);
		std1.setsBranch("Civil");
		
		Student std2 = new Student();
		std2.setsName("Suhas");
		std2.setsId(180020004);
		std2.setsBranch("Civil");
	
		
		System.out.println("First Student is  ------");
		
		System.out.println(std1.getsName());
		System.out.println(std1.getsId());
		System.out.println(std1.getsBranch());
		
		System.out.println();
		System.out.println("Second Student is  ------");
		System.out.println(std2.getsName());
		System.out.println(std2.getsId());
		System.out.println(std2.getsBranch());
		
		
		
	}

}
