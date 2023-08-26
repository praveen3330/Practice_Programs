@FunctionalInterface
interface Demo1{
	void add(int a, int b);
}

public class LambdaExpression2 {

	public static void main(String[] args) {
		Demo1 d = (int a, int b) -> {
			int result = 0;
			result = a+b;
			System.out.println("Sum is " + (a+b));
		};
		d.add(10, 20);

	}

}
