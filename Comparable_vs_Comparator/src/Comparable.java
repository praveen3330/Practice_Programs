import java.util.TreeSet;

public class Comparable {

	public static void main(String[] args) {

//the o/p will be ascending order because the treeset implements comparable interface, only strings,all wrapper classes implements comparable
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(5);
		t.add(15);
		t.add(1);
		t.add(20);
		// t.add('a');     It throws class cast exception because the data must be in homogeneous only
		//  t.add(null); It throws NullPointer Exception
		System.out.println(t);

//In comparable interface there is only one method i.e compareTo() method

	}
}