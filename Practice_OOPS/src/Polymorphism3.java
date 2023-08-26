class Parent5{
	public void parent() {
		System.out.println("parent is crying");
	}
}

class Child5 extends Parent5{
	public void parent() {                       //method overriding
		System.out.println("child is crying");
	}
	public void child() {                        //specialized method
		System.out.println("child eats more");
	}
}
public class Polymorphism3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent5 p = new Child5();
		p.parent();
     // p.child();        using parent type ref we cannot call child class specialized methods
		((Child5)p).child();     //using downcasting we can call child class specialized method
	}

}
