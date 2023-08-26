
public class Reversing_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "harish";
		String s2 = "";
		for(int i=s1.length()-1;i>=0;i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println();
		
		String s3 = "kanumarlapudi harish";
		String s4 = "";
		for(int i=s3.length()-1;i>=0;i--) {
			s4 = s4 + s3.charAt(i);
		}
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println();
		
		String s5[] = s3.split(" ");
		String s6 = "";
		for(int i=s5.length-1;i>=0;i--) {
			s6 = s6 + s5[ i] + " ";
		}
		System.out.println(s6 );
		
		
		
	}

	

}
