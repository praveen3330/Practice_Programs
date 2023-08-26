
public class CopyingStringToAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "Harish";
        String s1 = s;
        System.out.println(s1);
        
        String s2 = "Harish";
        String s3 = "";
        for(int i=0;i<s2.length();i++) {
        	s3 = s3 + s2.charAt(i);
        }
        System.out.println(s3);
	}

}
