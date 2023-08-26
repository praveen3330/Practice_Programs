
public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sachin";
		String s1 = new String("Sachin");
		
		System.out.println(s==s1);       // == compares the object reference
		System.out.println(s.equals(s1));    // equals method compares the content
		
		
		StringBuilder s2 = new StringBuilder("Dhoni ");
		StringBuilder s3 = new StringBuilder("Dhoni ");
		System.out.println(s2==s3);      // == compares the object reference
		
		
		StringBuilder s4 = new StringBuilder("Dhoni ");
		StringBuilder s5 = new StringBuilder("Dhoni ");
		System.out.println(s4.equals(s5));      // == compares address of the object not content, to check content convert stringBuilder to tostring
		
       // StringBuilder methods all are same in stringBuffer 
		
	}

}
