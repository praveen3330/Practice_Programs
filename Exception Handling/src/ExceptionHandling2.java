//Ducking Exception - using throws keyword it intimates that there will occur an exception
// for unchecked exception we must not use throws keyword or ducking Exception
// for checked exception also if we know that there will be no exception but compiler is giving exception then we can use throws keyword

import java.util.Scanner;

class Alpha{
	void alpha() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number: ");             
		int num2 = scan.nextInt();
		int result = num1/num2;           //If we divide a number with 0 then it shows exception and stops the exception
	    System.out.println(result);
		System.out.println("We cannot divide a number with 0");
	}
}

class Beta {
	void beta() throws Exception {
		Alpha a = new Alpha();
		a.alpha();
	}
}
public class ExceptionHandling2 {

	public static void main(String[] args) {
		try{
			Beta b = new Beta();
			b.beta();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exception finally handled in main");
		}
		

	}

}
