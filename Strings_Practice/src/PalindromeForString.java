import java.util.Scanner;

public class PalindromeForString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to check palindrome or not: ");
		String s1 = scan.nextLine();
		String s2 = "";
		for(int i=s1.length()-1;i>=0;i--) {
				s2 = s2 + s1.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
		}

	}

}
