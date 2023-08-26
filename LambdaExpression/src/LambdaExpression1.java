// we can achieve lambda expression only by functional interface


@FunctionalInterface
interface Isample {
	void add();
}

public class LambdaExpression1 {

	public static void main(String[] args) {
		Isample i = () -> System.out.println("Add Two Numbers");
		i.add();
	}

}
