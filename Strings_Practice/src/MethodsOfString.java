
public class MethodsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// length() method
		String s = "Harish";
		System.out.println("The length of " + s + " is : " + s.length());
		
		System.out.println();

		
		//Ignorecase
		String s1 = "Harish";
		System.out.println(s1.equalsIgnoreCase("harish"));
		System.out.println(s1.equals("harish"));              //equals method
		
		System.out.println();
		
		//CharAt
		String s2 = "Harish";
		System.out.println(s2.charAt(3));
				
		System.out.println();
		
		//concat
		String s3 = "Harish";
		String s4 = " hi";
		System.out.println(s3.concat(s4));
				
		System.out.println();
				
		//subString(int begin) and subString(int begin, int end) 
		String s5 = "Harish Dhoni Freakerzz";
		System.out.println(s5.substring(7));  // after 7 will be printed
		System.out.println(s5.substring(0,6));     //where to start and where to end-1       
				
		System.out.println();
		
		//replacing the char
		String s6 = "harish";
		System.out.println(s6.replace('h','a')); 

						
		System.out.println();
		
		//tolowercase 
		String s7 = "HARISH";
		System.out.println(s7.toLowerCase());        
						
		System.out.println();
		
		//touppercase
		String s8 = "harish";
		System.out.println(s8.toUpperCase());        
								
		System.out.println();
		
		//trim - It only removes the spaces from beginning and ending
		String s9 = "   Harish  Dhoni    Freakerzz   ";
		System.out.println(s9.trim());        
								
		System.out.println();
		
		//indexof()
		String s10 = "harish";
		System.out.println(s10.indexOf('r'));
		System.out.println(s10.indexOf('h'));    // it shows the first h
		System.out.println(s10.lastIndexOf('h'));   //to know the lastindex value of h 
										
		System.out.println();
		
		//split
		String s11 = "harish hi";
		String arr[] = s11.split(" ");   //splits the string based on whitespace
		for(String s12 : arr) {
			System.out.println(s12);
		}
		
		System.out.println();
		
		String s12="ABC";
		byte[] b=s12.getBytes(); 
		for(int i=0;i<b.length;i++){ 
		System.out.print(b[i]+" " );

		}
	}

}
