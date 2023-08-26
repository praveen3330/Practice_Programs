class Harish2{
	private String name;
	private int age;
	private String city;
	
	public Harish2(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
}
public class Constructors1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harish2 h = new Harish2("Harish",21,"kurnool" );
		System.out.println(h.getName());
		System.out.println(h.getAge());
		System.out.println(h.getCity());

	}

}
