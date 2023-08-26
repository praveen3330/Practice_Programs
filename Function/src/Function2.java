import java.util.function.Function;

public class Function2 {

	public static void main(String[] args) {
		Function<String,Integer> mf = name -> name.length();
		int output = mf.apply("Harish");
	    System.out.println(output);
	}
}
