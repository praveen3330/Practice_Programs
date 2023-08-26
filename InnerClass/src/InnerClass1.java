class Outerclass{
	int a,b,c;
	public void add() {
		a=10;
		b=20;
		c = a+b;
		System.out.println("The sum of " + a + " and " + b + " is: " + c);
	}
	class Innerclass{
		public void multiply() {
			a=10;
			b=20;
			c=a*b;
			System.out.println("Inner Class is non-static");
			System.out.println("The multiply of " + a + " and " + b + " is: " + c);
		}
	}
}
public class InnerClass1 {

	public static void main(String[] args) {
		// To call outer class
		Outerclass outer = new Outerclass();
		outer.add(); 
		
		//To call Inner class
		Outerclass.Innerclass inner = outer.new Innerclass();
		inner.multiply();
		
		//here we have to call innerclass by using obj of outer class
	}

}
