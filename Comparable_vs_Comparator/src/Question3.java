//Write a Program to Insert String and StringBuffer Objects into the TreeSet where Sorting Order is Increasing Length Order.

import java.util.*;

	class MyComparator3 implements Comparator {
		public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int i1 = s1.length();
		int i2 = s2.length();
		
		if (i1<i2) {
		return -1;
		}
		else if(i1>i2) {
		return +1;
		}
		else {
		return s1.compareTo(s2);
		}
	}
}
	
	
public class Question3 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator3());
		t.add("a");
		t.add(new StringBuffer("abc"));
		t.add("aa");
		t.add(new StringBuffer("xx"));
		t.add("abc");
		t.add(new StringBuffer("abce"));
		System.out.println(t);
	}

}