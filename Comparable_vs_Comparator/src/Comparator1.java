import java.util.*;

class MyComparator implements Comparator{

// to get descending order
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		if(i1<i2) {
		return +1;
		}else if(i1>i2) {
		return -1;
		}
		else {
		return 0;
		}

/*we can also write instead of if else statements directly i.e
   return I1.compareTo(I2);    //gives ascending order
return -I1.compareTo(I2);   //descending order
return I2.compareTo(I1);    //descending order
return -I2.compareTo(I1);   //ascending order
return +1;                  //Insertion order
return -1;                  //reverse of insertion order
return 0;                   //only first element will be inserted
*/
	}
}


public class Comparator1 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(5);
		t.add(15);
		t.add(1);
		t.add(20);
	    System.out.println(t);
	}
}