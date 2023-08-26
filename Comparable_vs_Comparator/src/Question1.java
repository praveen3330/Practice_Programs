// question - Write a Program to Insert String Objects into the TreeSet where the Sorting Order is of Reverse of Alphabetical Order:


import java.util.*;

class MyComparator1 implements Comparator{
	public int compare(Object obj1, Object obj2) {
		String s1 = (String)obj1;
		String s2 = (String)obj2;

		return s2.compareTo(s1);
	}
}

public class Question1 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator1());
		t.add("Harish");
		t.add("Suhas");
        t.add("Jagadesh");
        t.add("Justus");
        t.add("Chakri");
        System.out.println(t);
	}
}