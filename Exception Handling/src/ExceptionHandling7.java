class Justus{
	public void disp() {
		try {
			System.out.println("HI");
			System.exit(0);             //here thye program will exit dont print any statements
		}
		finally {
			System.out.println("Finally block will execute");
		}
	}
}
public class ExceptionHandling7 {

	public static void main(String[] args) {
		Justus j = new Justus();
		j.disp();
		System.out.println("Main method will execute");
	}

}
