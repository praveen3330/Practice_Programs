import java.util.HashMap;

class Student{
	private String name;
	private int id;
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return name + " " +id;
	}	
}
public class Student_ex {
	public static void main(String[] args) {
		Student s1 = new Student("Harish" ,34);
		Student s2 = new Student("Suhas" , 04);
		HashMap hm = new HashMap();
		hm.put(1, s1);
		hm.put(2, s2);
		
		System.out.println(hm);
	}
}
