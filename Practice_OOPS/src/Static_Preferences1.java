
public class Static_Preferences1 {
	
	static int a;
	static int b;
	
	static {
		System.out.println("Static block is called...");
		a = 10;
		b = 20;
	}
	
	public static void disp1(){
		System.out.println("Static method is called..method.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method is called...");
	}
}
