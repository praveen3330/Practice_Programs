//Rethrowing Exception - exception occured in add method and handled there only but also we are intimation the main method that error is occured by throw
//  keyword, here the catch block of add method and main method also will be executed


import java.util.Scanner;

class Demo{
	public void add() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scan.nextInt();
		try {
			int result = num1/num2;
		}
		catch(Exception e) {
			System.out.println("You cannot divide a num with 0");
			System.out.println("The exception was handled in add() method only ");
			throw e;
		}
		finally {
			System.out.println("Finally block will be executed");
		}
	}
}

public class ExceptionHandling4 {

	public static void main(String[] args) throws Exception {
		try {
			Demo d = new Demo();
			d.add();
		}
		catch(Exception e) {
			System.out.println("The exception is handled by main method also");
		}

	}

}
