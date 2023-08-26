class Parent1{
	public void disp() {
		System.out.println("Parent1 class is calling");
	}
	public void parent1() {
		System.out.println("Parent1 class  and parent1 method is calling");
	}
}

class Child1 extends Parent1{
	public void disp() {
		System.out.println("Child1 class is calling");
	}
	public void child1() {
		System.out.println("Child1 class and child1 method is calling");
	}
}

class Child2 extends Child1{
	public void disp() {
		System.out.println("Child2 class is calling");
	}
	public void child2() {
		System.out.println("Child2 class and child2 method is calling");
	}
}

//Real time polymorphism can achieve only if there is parent class only

public class Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Child1 c1 = new Child1();   //tight coupling
		c1.disp();
		
		Child2 c2 = new Child2();    //tight coupling
		c2.disp(); 
		
		Parent1 p1 = new Child2();    //loose coupling it is real polymorphism
		p1.disp();
		p1.parent1();
		
		
	}

}
