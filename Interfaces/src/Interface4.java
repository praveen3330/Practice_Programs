//class can extend another class as well as implement an interface

interface One{
	void add();
}

class Two{
	public void sub() {
		System.out.println("Sub");
	}
}

class Three extends Two implements One{
	public void add() {
		System.out.println("add");
	}
}
public class Interface4 {

	public static void main(String[] args) {
		Three c = new Three();
		c.add();
		c.sub();
	}
}
