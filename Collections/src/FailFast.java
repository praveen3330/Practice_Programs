import java.util.*;

public class FailFast {

	public static void main(String[] args) {
		//we can achieve failfast by using iterators 

		
	
        ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		//for-loop
/*		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			al.add(100);
		}     */
		
		
		//iterator
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			al.add(100);
		}
	}

}
