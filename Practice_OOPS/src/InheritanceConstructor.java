class Parent{
	int a,b,c;
	Parent(){
		a = 10;
		b = 20;
		System.out.println("Parent Constructor");
	}
	Parent(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Parent constructor with parameters");
	}
}


class Child extends Parent {
	//In this line there will be super method which calls parent class constructor
	int x, y;
	Child(){
		x = 100;
		y=200;
		System.out.println("Child Constructor");
	}
	Child(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Child Constructor with parameters");
	}
	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}


public class InheritanceConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.display();

	}

}
