import java.util.*;

public class ReverseIterations {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		ListIterator li = ll.listIterator(ll.size());
		while(li.hasPrevious()) {
			System.out.print(li.previous() + " ");
		}
		
		
		/// LinkedList, ArrayDeque and TreeSet
		
		
				LinkedList ll2=new LinkedList();
				ll2.add(100);
				ll2.add(200);
				ll2.add(300);
				ll2.add(400);
				ll2.add(500);
				System.out.println(ll2);
				
				
				Iterator ditr=ll2.descendingIterator();
				
				while(ditr.hasNext())
				{
					//Integer i=(Integer) ditr.next();
					System.out.print( ditr.next()+ " ");
				}
				
	}

}
