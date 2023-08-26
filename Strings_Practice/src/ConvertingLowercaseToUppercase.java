
public class ConvertingLowercaseToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "harish";
		String s1 = "";
		for(int i=0;i<s.length();i++) {
			 s1 = s1 + (char) (s1.charAt(i) -32);
			 
			
		}
		System.out.println(s1);

	}

}
