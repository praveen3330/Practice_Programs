
public class ConstructorsOfStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.
		StringBuffer sb = new StringBuffer();   
		System.out.println("the length of sb is " + sb.length());
		System.out.println("the capacity of sb is " + sb.capacity());   //default capacity is 16
        sb.append("abcdefghijklmnop");
        System.out.println("the length of sb is " + sb.length());       
        System.out.println("the capacity of sb is " + sb.capacity());
        sb.append("q");
        System.out.println("the length of sb is " + sb.length());
        System.out.println("the capacity of sb is " + sb.capacity());  // default capacity is crossed so, new capacity is created (old capacity +1) *2)
        
        System.out.println();
        
        //2.
        StringBuffer sb1 = new StringBuffer(100);  //directly we can give capacity as we want
    	System.out.println("the length of sb1 is " + sb1.length());      
		System.out.println("the capacity of sb1 is " + sb1.capacity());  //100
		
		System.out.println();
		
		//3.
		 StringBuffer sb2 = new StringBuffer("Harish");  
	     System.out.println("the length of sb2 is " + sb2.length());      
		 System.out.println("the capacity of sb2 is " + sb2.capacity());   
		 //If we provide String, capacity is lengthof string + capacity => 16+6 =22
	}

}
