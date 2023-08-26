import java.util.TreeSet;
public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		//It follows binary search tree datastructure
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
	    ts.add(75);
		ts.add(125);
		ts.add(175);

		System.out.println(ts);
		
		System.out.println();
		System.out.println(ts.ceiling(50));   // if the value is present then that will only be o/p
		System.out.println(ts.higher(50));    //it gives next value of 50
		System.out.println(ts.floor(50));       // if the value is present then the value only will be o/p
		System.out.println(ts.lower(50));      //it gives less than 50 value
		System.out.println("******************");
		
		System.out.println(ts.ceiling(40));   //40 is not present so it gives next value of it
		System.out.println(ts.higher(40));     //it gives next value of it
		System.out.println(ts.floor(40));      //40 is not present so it gives lesser value of 40
		System.out.println(ts.lower(40));        //it gives less than 40 value
	}

}
