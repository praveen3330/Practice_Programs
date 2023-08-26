//Here if we give catch block in same method and main method, same method catch block will be given importance if there is no catch block in same method then
//   main method catch block will be executed

import java.util.Scanner;

class Harish{
	public void divide() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scan.nextInt();
		try {
			int result = num1/num2;
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("You cannot divide a num with 0");
			System.out.println("The exception was handled in add() method only ");
		}
		finally {                             // finally block cannot write alone there must be try
			System.out.println("Finally block will be executed");
		}
	}
}
public class ExceptionHandling5 {

	public static void main(String[] args) throws Exception {
		try {
			Harish h = new Harish();
			h.divide();
		}
		catch(Exception e) {
			System.out.println("The exception handled in main method");
		}

	}

}
