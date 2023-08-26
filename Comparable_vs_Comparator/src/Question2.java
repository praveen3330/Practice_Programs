//Write a Program to Insert StringBuffer Objects into the TreeSet where Sorting Order is Alphabetical Order:

import java.util.*;


	class MyComparator2 implements Comparator{
		public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return s1.compareTo(s2);
	}
}



public class Question2 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator2());
		t.add(new StringBuffer("Harish"));
		t.add(new StringBuffer("Suhas"));
        t.add(new StringBuffer("Jagadesh"));
        t.add(new StringBuffer("Justus"));
        t.add(new StringBuffer("Chakri"));
        System.out.println(t);
        //here if we compile directly without using comparator interface then it shows classcastexception because the stringbuffer class
        // doesnt inherit the comparable interface so we have to use comparator
	}

}