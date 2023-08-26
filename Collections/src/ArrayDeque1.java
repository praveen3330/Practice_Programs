import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		//it follows double ended queue datastructure
		
		ad.add(10);
		ad.add("Harish");
		ad.add(180020034);
		System.out.println(ad);
		ad.addFirst(8);
		System.out.println(ad);
		ad.addLast(10);
		System.out.println(ad);
		
		System.out.println(ad.peekFirst());   //gives first element and do not remove it
		System.out.println(ad.peekLast());    //gives last element and do not remove it
		
		
		System.out.println(ad.pollFirst());  //gives the first element and removes first element
		System.out.println(ad);
		System.out.println(ad.pollLast());    //gives the last element and removes last element
		System.out.println(ad);
		
		
	//	al.add(2,5);            //in arraydeque adding the element in middle will not be there

	}

}
