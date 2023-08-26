// Write a Program to Insert Employee Objects into the TreeSet where DNSO is Based on
// Ascending Order of EmployeeId and
// Customized Sorting Order is Based on Alphabetical Order of Names:

import java.util.*;

class Employee implements Comparable {
	int id;
	String name;

	Employee(int id , String name){
		this.id = id;
		this.name = name;
	}

	public int compareTo(Object obj)  {
		int id1 = this.id;
		Employee emp = (Employee)obj;
		int id2= emp.id;
			
		if(id1<id2) {
			return -1;
		}
		else if (id1>id2) {
			return 1;
		}
		else {
			return 0;
		}
	}
}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Employee e1 = (Employee) obj1;
		Employee e2 = (Employee) obj2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
}

public class Question4 {

	public static void main(String[] args) {

		Employee e1 = new Employee(16,"Harish");
		Employee e2 = new Employee(4,"Suhas");
		Employee e3 = new Employee(10,"Chakri");
		
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		
		System.out.println(t);
		System.out.println(t1);
	}
}
