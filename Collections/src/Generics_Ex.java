import java.util.*;
public class Generics_Ex {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();  // we can add only Integer values
		al.add(10);
		al.add(20);
		//al.add("Harish");    shows error because arraylist adding only Integer
		System.out.println(al);
	}

}
