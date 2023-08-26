//Handling Exception - Using try and catch 

import java.util.Scanner;
public class ExceptionHandling1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number: ");             
		int num2 = scan.nextInt();
		
		try {
		    int result = num1/num2;           //If we divide a number with 0 then it shows exception and stops the exception
		    System.out.println(result);
	    }
		catch(Exception e) {
			System.out.println("We cannot divide a number with 0");
		}
	}
}
