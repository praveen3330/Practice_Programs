// this is the example without encapsulation
/* class Harish{
	public int age ;         //it is public
	private String name;     // it is private
	
}


public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harish h = new Harish();
		h.age = 11;             // we can access age directly because it is public
		h.name = "Harish";      //we cannot access name directly it is private so we have to use get set methods
		System.out.println(h.age);
		System.out.println(h.name);
		
	}

} */


//this is the example for encapsulation(Private)
class Harish{
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
}


public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harish h = new Harish();
		h.setAge(21);
		System.out.println(h.getAge());
		
		h.setName("harish");
		System.out.println(h.getName());

	}

} 

