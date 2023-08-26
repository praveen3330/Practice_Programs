// Finally block we can write when there must be try 

class Suhas{
	public int disp() {
		try {
			System.out.println("HI");
			return 10;
		}
		finally {
			System.out.println("Finally block will execute");
		}
	}
}
public class ExceptionHandling6 {

	public static void main(String[] args) {
		Suhas s = new Suhas();
		s.disp();

	}

}
