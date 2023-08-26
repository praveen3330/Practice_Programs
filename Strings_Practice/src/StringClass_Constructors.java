
public class StringClass_Constructors {

	public static void main(String[] args) {
		
		// 1. creates Empty string
		String s = new String();
		System.out.println(s);
		
		//creates string
		String s1 = new String("Dhoni");
		System.out.println(s1);
		
		//creates an equivalent string object for string buffer
		StringBuilder sb = new StringBuilder("Hi");
		String s2 = new String(sb);
		System.out.println(sb);
		
		//creates an equivalent string object for character array
		char ch[] = {'J','A','V','A'};
		String s3 = new String(ch);
		System.out.println(s3);
		
		//creates an equivalent string object for byte array
				byte b[] = {65,66,67,68};
				String s4 = new String(b);
				System.out.println(s4);
		
	}

}
