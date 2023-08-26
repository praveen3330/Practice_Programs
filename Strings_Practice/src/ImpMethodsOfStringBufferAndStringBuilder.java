
public class ImpMethodsOfStringBufferAndStringBuilder {

	public static void main(String[] args) {
		
		//1. length
		 StringBuffer sb1 = new StringBuffer("Harish");
		 System.out.println("The length of sb1 is " + sb1.length());
		 
		 System.out.println();
		 
		//2. capacity
		 StringBuffer sb2 = new StringBuffer("Harish");
		 System.out.println("The capacity of sb1 is " + sb2.capacity());  // default capacity is 16 and lenght of sb2 is 6, so 16+6=22 is capacity of sb2
		 
		 System.out.println();
		 
		//3.charat
		 StringBuffer sb3 = new StringBuffer("Harish");
		 System.out.println("the char at 1st position in sb3 is " + sb3.charAt(1));
		 
		 System.out.println();
		 
		//4.replace charat
		 StringBuffer sb4 = new StringBuffer("Harish");
		 sb4.setCharAt(0, 'h');
		 System.out.println("the char at 0th position is replace with 'h' in sb3 is " + sb4);
		 
		 System.out.println();
		 
		 //5.append 
		 StringBuffer sb5 = new StringBuffer();
		 sb5.append("PI value is :: ");
		 sb5.append(3.1414);
		 sb5.append(" This is exactly true");
		 System.out.println(sb5);
		 
		 System.out.println();
		 
		 //6.insert method
		 StringBuffer sb6 = new StringBuffer("abcdefgh");
		 sb6.insert(2,"xyz");
		 System.out.println(sb6);
		 sb6.insert(9,11);
		 sb6.insert(sb6.length(),"dhoni");
		 System.out.println(sb6);
		 
		 System.out.println();
		 
		 //7.delete method
		 StringBuffer sb7 = new StringBuffer("sachinrameshtendulkar");
		 sb7.delete(6,12);
		 System.out.println(sb7);
		 sb7.deleteCharAt(13);
		 System.out.println(sb7);
		 
         System.out.println();
		 
		 //8.reverse string
		 StringBuffer sb8 = new StringBuffer("harish");
		 sb8.reverse();
		 System.out.println(sb8);
		 
         System.out.println();
		 
		 //9.to set length
		 StringBuffer sb9 = new StringBuffer("sachinrameshtendulkar");
		 System.out.println(sb9.length());
		 sb9.setLength(6);
		 System.out.println(sb9);
		 
         System.out.println();
		 
		 //10.to trim size
		 StringBuffer sb10 = new StringBuffer(1000);
		 System.out.println(sb10.capacity());    //1000
		 sb10.append("harish");
		 System.out.println(sb10.capacity());    //1000
		 sb10.trimToSize();
		 System.out.println(sb10.capacity());
		 
         System.out.println();
		 
		 //11.to ensure capacity
		 StringBuffer sb11 = new StringBuffer();
		 System.out.println(sb11.capacity());
		 sb11.ensureCapacity(1000);             //Increasing the capacity dynamically
		 System.out.println(sb11.capacity());
		 
		 

	}

}
