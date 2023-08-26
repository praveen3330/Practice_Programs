class Harish1{
	int a,b,c;
	
	
	public void sum() {
		a=10;
		b=20;
		c=a+b;
		System.out.println("The sum of " + a + " " + b + " is: " + c);
	}
	static class Harish2{
		public static void multiply() {
			int x =10;
			int y=20;
			int z=x*y;
			System.out.println("Inner Class is static");
			System.out.println("The sum of " + x + " " + y + " is: " + z);
		}
	}
}
public class InnerClass2 {

	    public static void main(String[] args) {
		
		Harish1.Harish2 inner = new Harish1.Harish2();
	    //inner.multiply();
		Harish1.Harish2.multiply();
		
		// we can call by using above two ways
		
	   //Here we are calling inner class which is static, so no need to create obj. we can call with class name only.
	    
	}

}
