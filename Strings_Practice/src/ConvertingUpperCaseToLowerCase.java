import java.util.Scanner;

public class ConvertingUpperCaseToLowerCase {

	public static void main(String[] args) {
		String s1 = "HARISH";
		String s2 = "";
		for(int i=0;i<s1.length();i++) {
			s2 = s2 + (char)(s1.charAt(i)+32);
		}
		System.out.println(s2);

	}

}
