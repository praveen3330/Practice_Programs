import java.util.function.Predicate;

public class Predicate2 {
	public static void main(String[] args) {
	      Predicate<Integer> p = i->i>10;
	    		  System.out.println(p.test(10));
	              System.out.println(p.test(100));
	}
}
