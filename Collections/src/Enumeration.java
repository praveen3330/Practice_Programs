import java.util.*;

public class Enumeration {

	public static void main(String[] args) {
		//vector classes
		
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		java.util.Enumeration em = v.elements();
		while(em.hasMoreElements()) {
			System.out.print(em.nextElement() + " ");
		}
	}

}
