/* If two interfaces contain a method with same name but different arguments in the implementation class we have to provide implementation for both 
    methods and these methods acts as a overload methods  */
 

interface L{
	public void methodOne();
}

interface R {
	public void methodOne();
}

class Right1 implements L,R{
	public void methodOne() {
		System.out.println("MethodOne");
	}
	public void methodOne(int i) {
		System.out.println("MethodOne constructor");
	}
}

public class Interface8 {

	public static void main(String[] args) {
		Right1 r = new Right1();
		r.methodOne();
		r.methodOne(10);

	}

}
