interface A{
	void add();
	void sub();
}

abstract class B implements A{    // here we give abstarct class because there is another abstarct method which the body is not implemented
	public void add() {
		System.out.println("Add method is drived");
	}
}

class C extends B{
	public void sub() {
		System.out.println("Sub method is derived");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		C c = new C();
		c.add();
		c.sub();

	}

}
