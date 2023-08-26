class Harish1{
	private int age;
	private String name;
	private String city;
	private boolean married;
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public boolean isMarried() {
		return married;
	}
	
	
}
public class Encapsulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harish1 h1 = new Harish1();
		h1.setAge(21);
		h1.setName("Harish");
		h1.setCity("Kurnool");
		h1.setMarried(false);
		
		System.out.println(h1.getAge());
		System.out.println(h1.getName());
		System.out.println(h1.getCity());
		System.out.println(h1.isMarried());
		
	}

}
