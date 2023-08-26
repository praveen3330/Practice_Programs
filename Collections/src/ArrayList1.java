import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//homogenious type of data is allowed
		ArrayList al = new ArrayList();
		//it follows dynamic data structure
		
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		
		System.out.println();
		
		//Heterogenius type of data is also allowed
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add('a');
		al1.add("Harish");
		al1.add(20.52);
		System.out.println(al1);
		
		System.out.println();
		
		//Adding all elements into another collection
		ArrayList al2 = new ArrayList();
		al2.addAll(al1);
		System.out.println(al2);
		
		System.out.println();
		
		ArrayList al3 = new ArrayList();
		al3.add(11);
		al3.add(22);
		al3.add(33);
		
		System.out.println("existing data " + al3);
		al3.add(1,55);
		System.out.println("after adding in 1st index "+ al3);
		al3.add(0,5);
		System.out.println("after adding in 0th index "+al3);
		al3.add(3,66);
		System.out.println("after adding in rear index "+al3);
		
		al3.addAll(al2);
		System.out.println("after adding in 0th index "+al3);
		
		System.out.println();
		
		ArrayList al4 = new ArrayList();
		al4.add(10);
		al4.add(20);
		al4.add(30);
		al4.add(40);
		System.out.println(al4);
		
		System.out.println();
		
		//check the data is available in collection or not
		System.out.println(al4.contains(10));
		System.out.println(al4.contains(22));
		
		System.out.println();
		
		//to find the index of data
		System.out.println(al4.indexOf(20));
		System.out.println(al4.indexOf(200));
		
		System.out.println();
		
		//checking the collection is empty or not
		System.out.println(al4.isEmpty());
		
		System.out.println();
		
		//Giving the capacity for collection
		al4.ensureCapacity(10);
		
		//printing the size of collection
		System.out.println(al4.size());
		
		//Triming the size
		al4.trimToSize();
		
		//printing the name of the class
		System.out.println(al4.getClass());
		
		System.out.println();
		
		//CLearing the data
		al4.clear();
		System.out.println(al4);
		System.out.println(al4.size());

	}

}
