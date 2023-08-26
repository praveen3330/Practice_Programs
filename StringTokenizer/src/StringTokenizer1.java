import java.util.*;

public class StringTokenizer1 {

	public static void main(String[] args) {
		String data= "sachin ramesh tendulkar";
		StringTokenizer stk = new StringTokenizer(data);
		System.out.println(stk);
		         int count = stk.countTokens();
		         System.out.println(count);
		         
		         System.out.println("-----------------------------");
		         
		         String data1= "sachin$ramesh&tendulkar";
				StringTokenizer stk1 = new StringTokenizer(data1);
				System.out.println(stk1);
		         int count1 = stk1.countTokens();
		         System.out.println(count1);
		         
		         
		         System.out.println("-----------------------------");
		         
		         String data2= "sachin$ramesh$tendulkar";
				StringTokenizer stk2 = new StringTokenizer(data2,"$");
				System.out.println(stk2);
		         int count2 = stk2.countTokens();
		         System.out.println(count2);
		         
		         
		         System.out.println("-----------------------------");
		         
		         String data3= "sachin$ramesh$tendulkar";
				StringTokenizer stk3 = new StringTokenizer(data3,"$");
				System.out.println(stk3);
		         int count3 = stk3.countTokens();
		         System.out.println(count3);
		         
		         while (stk.hasMoreTokens()){
		        String d = stk.nextToken();
		        System.out.println(d);
		         }
	}

}