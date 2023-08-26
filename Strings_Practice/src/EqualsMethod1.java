
public class EqualsMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("Dhoni");
		String s1 = new String("Dhoni");
		
		System.out.println(s==s1);      // == compares the object and it creates new objects 

		
		String s2 = "sachin";
		String s3 = "sachin";
		System.out.println(s2==s3);     //== compares the object and here only one object will be created and s2,s3 shares it
	}

}
