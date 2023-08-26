import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.ArrayList;
public class Iterator1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10); 
		al.add(10.5);
		al.add('c');
		al.add(10.5f);
		
		//Accessing the data in different ways
		
		//System.out.println(al);
		
		//for loop
/*		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i) + " ");
		}    */
		
		//for-each loop
/*		for(Object o : al) {
			System.out.print(o + " ");
		}   */
		
		
		//Iterator
		Iterator itr = al.iterator();
/*		if(itr.hasNext() == true) {
			System.out.println(itr.next() + " ");
			itr.hasNext();	
		}   */
		
/*    	while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}  */
		
/*		while(itr.hasNext())
		{
     		//Integer i=(Integer) itr.next();
			Object o=itr.next();
			System.out.print(o + " ");	
		}   */
		
		//reversing
		//for reveraing all classes not support only 2 classes (Arraylist and linkedlist) will support and also we have to use ListIterator
/*		ListIterator itr1 = al.listIterator(al.size());
		while(itr1.hasPrevious()) {
			System.out.print(itr1.previous()+ " ");
		}   */
		
		
		// what if I want to reverse or access data of other claases in reverse dir?
		//we are adding the treeset values into linkedlist and accessing the reverse order
		
				TreeSet ad=new TreeSet();
				ad.add(10);
				ad.add(20);
				ad.add(30);
				ad.add(40);
				Iterator it=ad.iterator();
				
				while(it.hasNext()==true)
				{
					Integer i=(Integer) it.next();
					System.out.println("Array De" + i);
				}
				
				System.out.println("added linked list");
				LinkedList ll=new LinkedList();
				ll.addAll(ad);
				System.out.println(ll);
				
				ListIterator litr2=ll.listIterator(ll.size());
				System.out.println("Accessing treeset data in reverse");
				while(litr2.hasPrevious())
				{
					System.out.println(litr2.previous());
					
				}
	}
}
