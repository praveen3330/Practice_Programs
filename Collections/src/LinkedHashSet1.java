import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		
		//LinkedHashset follows hashing algorithm. it is combination of hashTable and hash function. only difference between hashset and linkedhashset 
		// is only linkedhashset follows insertionOrder.
		
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(125);
		
		System.out.println(lhs);

	}

}
