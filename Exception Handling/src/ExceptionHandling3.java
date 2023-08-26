// Ex for ducking

public class ExceptionHandling3 {

	public static void main(String[] args) throws Exception {
		System.out.println("Before Sleep");
		Thread.sleep(4000);                   // here if we dont write throws it shows error but we know that there will be no exception so we use ducking 
		System.out.println("after Sleep");
	}

}
