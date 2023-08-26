import java.util.concurrent.*;
import java.util.*;

public class FailSafe {

	public static void main(String[] args) {
		
		//here we have to use package copyonwrite to get failsafe
		
        CopyOnWriteArrayList cal = new  CopyOnWriteArrayList();
		
		cal.add(1000);
		cal.add(2000);
		cal.add(3000);
		cal.add(4000);
	    
		
		Iterator itrr= cal.iterator();
		while(itrr.hasNext())
		{
			System.out.println(itrr.next());
			cal.add(12345);
		}

	}

}
