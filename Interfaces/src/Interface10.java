//Abstract class accepts Constructor to initialize the variables
//Interface doesnt accepts constructor because the variables in interface are public static final by default

abstract class Student{
	String name;
	int age;
	int id;
	String branch;
	
	Student(String name, int age, int id, String branch) {
		this.name = name;
		this.age = age; 
		this.id = id;
		this.branch = branch;
	}
}

class Person extends Student{
	String adress;
	
	Person(String name, int age, int id, String branch, String adress) {
		super(name,age,id,branch);
		this.adress = adress;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
		System.out.println(branch);
		System.out.println(adress);
	}
}

public class Interface10 {

	public static void main(String[] args) {
	   Person p = new Person("Harish",21,180020034,"Civil","Kurnool");
	   p.display();
	}

}
