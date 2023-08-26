
public class ConcatAndAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sachin";
		s.concat("Tendulkar");
		System.out.println(s);
		
		 
		String s1 = new String("Dhoni");
		s1.concat("chennai");
		System.out.println(s1);

		
		StringBuilder s2 = new StringBuilder("Dhoni ");
		s2.append("chennai");
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("Dhoni ");
		s3.append("chennai");
		System.out.println(s3);
	}

}
