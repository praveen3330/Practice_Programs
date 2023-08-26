import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	//the letters which we have used must be same in 2 strings

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string s1 to check anagram or not: ");
		String s1 = scan.nextLine();
		System.out.println("Enter the string s2 to check anagram or not: ");
		String s2 = scan.nextLine();
		
		s1.replace(" " , "");
		s2.replace(" " , "");
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("The given strings are anagram");
		}
		else {
			System.out.println("The given strings are not anagram");
		}
		
		for(char ch11:ch1) {
			System.out.print(ch11 + " ");
		}
		
		System.out.println();
		
		for(char ch12:ch2) {
			System.out.print(ch12 + " ");
		}

	}

}
