@FunctionalInterface
interface Demo2{
	int add(int a);
}

public class LambdaExpression3 {

	public static void main(String[] args) {
		Demo2 d = (int a) ->  a+5;
		d.add(5);
	}
}
