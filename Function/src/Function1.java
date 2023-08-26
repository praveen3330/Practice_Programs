import java.util.function.Function;

class MyFunction implements Function<String, Integer>{

	@Override
	public Integer apply(String name) {
	   return name.length();
	}
}
public class Function1 {

	public static void main(String[] args) {
		MyFunction mf = new MyFunction();
		System.out.println(mf.apply("harish"));
	}
}