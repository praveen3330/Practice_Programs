
public class InternMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("sachin");    // one obj will be created in heap and other will be in scp
		
		String s1 = s.intern();      // in above line one obj will be created in scp for that ref will be given
		
		String s2 = "sachin";     //s2 ref will be given for obj
		
		System.out.println(s == s1);   // s and s1 abj are different
		
		System.out.println(s1 == s2);    //  s1 and s2 is referring for same obj  
 
	}

}
