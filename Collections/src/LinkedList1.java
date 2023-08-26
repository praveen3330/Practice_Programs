import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		//it follows double linked list datastructure
		
		//adding the elements into collection
		ll.add("Harish");
		ll.add(180020034);
		ll.add("Civil");
		System.out.println(ll);
		
		//adding the elements in first
		ll.addFirst("Kurnool");
		System.out.println(ll);
		
		//adding the elements in middle
		ll.add(2,518002);
		System.out.println(ll);
		
		//adding elements in last
		ll.addLast("Andhra Pradesh");
		System.out.println(ll);

		//Printing the first element
		System.out.println(ll.getFirst());
		
		//Printing the Last element
	    System.out.println(ll.getLast());
	    
	  //Printing the element by index
	    System.out.println(ll.indexOf(180020034));
	    
	    //we can also use offerfirst and offerlast instead of addfirst and addlast
	    ll.offerFirst(5);
	    ll.offerLast(55);
	    //ll.addFirst(5);
	    //ll.addLast(55);
	    System.out.println(ll);
	    
	    //peek and peekfirst gives the first element of list or we can use getfirst also
	    System.out.println(ll.peek());
	    System.out.println(ll.peekFirst());
	    System.out.println(ll);
	    
	    //peeklast gives the last element of list or we can use getlast also 
	    System.out.println(ll.peekLast());
	    System.out.println(ll);
	    
	    //pollfirst removes the first element or we can also use removefirst
	    System.out.println(ll.pollFirst());
	    System.out.println(ll);
	    
	    //polllast removes the last element or we can use removelast also
	    System.out.println(ll.pollLast());
	    System.out.println(ll);
	    
	    //pop also gives the first element
	    System.out.println(ll.pop());
	    
	    //removes all elements
	    ll.clear();
	    System.out.println(ll);
	}

}
