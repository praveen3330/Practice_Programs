//Multiple Iheritane - extends doesnt supports multiple inheritane it can extend only one class but interface supports multiple inheritance it can 
// implement more than one interface


interface AA{
	 void add();
}

interface BB{
	void sub();
}

class CC implements AA, BB{
	public void add() {
		System.out.println("Add");
	}
	public void sub() {
		System.out.println("Sub");
	}
}
public class Interface3 {

	public static void main(String[] args) {
		CC c = new CC();
		c.add();
		c.sub();

	}

}
