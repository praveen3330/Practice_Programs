class Harish3{
	private int age;
	private String name;
	
	public Harish3() {
		this("Harish" , 21);
	}
	
	public Harish3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}


public class Constructor_UsingThisSuperMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harish3 h = new Harish3();   //it calls constructor of 0 parameters
		System.out.println(h.getAge());
		System.out.println(h.getName());
		
		Harish3 h2 = new Harish3("Sheru" , 6);  //it calss constructor of 2 parameters
		System.out.println(h2.getAge());
		System.out.println(h2.getName());
		

	}

}
