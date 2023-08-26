// Write a Predicate to check whether the given String length is >=3 or not?


import java.util.function.Predicate;

class MyPredicate1 implements Predicate{
	@Override
	public boolean test(Object t) {
		String s = (String)t;
		int i = s.length();
		if(i>=3) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Predicate3 {

	public static void main(String[] args) {
		MyPredicate1 mp = new MyPredicate1();
		System.out.println(mp.test("Harish"));
		System.out.println(mp.test("Ha"));
	}
}
