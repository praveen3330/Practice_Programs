class Demo1{
	String name = "Harish";
	int age = 21;
	
	void disp() {
		System.out.println("Demo1 " + name + " " + age);
	}
}

class Demo2 extends Demo1{
	
}

class Demo3 extends Demo2{
	
}


public class InheritanceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d = new Demo2();
		d.disp();

	}

}
