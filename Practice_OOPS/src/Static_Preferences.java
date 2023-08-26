class Harish5{
	//Static variables
	static int a;
	static int b;

	//Static block
	static {
		System.out.println("Static block is called...");
		 a = 10;
		 b = 20;
	}
	
	//Static method
	public static void disp() { 
		System.out.println("Static method is called...");
		System.out.println(a);
		System.out.println(b);
	}
	
	//instance variables
	int c;
	int d;

	//Non Static block
	{
		c = 10;
		d = 20;
		System.out.println(" Non Static Java block is called...");
	}
	
	//Constructor is called
	public Harish5() {
		System.out.println("Constructor is called...");
	}

	//non static method
	public void disp1() {
		System.out.println("Non Static method is called...");
		System.out.println(c);
		System.out.println(d);
		
	}
	
	void disp2(){
	disp1();
	}
}


public class Static_Preferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harish5 h = new Harish5();
		Harish5.disp();
		h.disp1();
		

	}

}
