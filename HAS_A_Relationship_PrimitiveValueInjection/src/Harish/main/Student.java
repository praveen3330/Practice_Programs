package Harish.main;

public class Student {

	private int age;
	private int id;
	private String name;
	
	//this is done by constructor
	
	Student(int age , int id, String name){	
		this.age = age;
		this.id = id;
		this.name = name;
		
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	// to string method is overridden because if we do not override it gives the reference of object only once try without override you can understand
	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
	

	

}
