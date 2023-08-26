package Harish.main;

//  For this writing the package name must be same 

/* Dependancy Injection
==================
 The process of injecting dependant object into target object is called as "Dependancy injection". */

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student(34,180020034,"Harish");
		Student st1 = new Student(4,180020004,"Suhas");
		
		System.out.println(st);
		System.out.println(st1);
		
	}

}
