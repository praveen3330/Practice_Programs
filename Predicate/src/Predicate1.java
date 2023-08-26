/* In Java, the Predicate interface is a functional interface that represents a boolean-valued function of one argument. 
  It is used to test a condition and returns either true or false.    */


import java.util.function.Predicate;

class MyPredicate implements Predicate{
	
	@Override
	public boolean test(Object t) {
		Integer i = (Integer)t;
		if(i>10) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Predicate1 {

	public static void main(String[] args) {
		MyPredicate p = new MyPredicate();
		System.out.println(p.test(10));
		System.out.println(p.test(20));
		System.out.println(p.test(1));
	}

}
