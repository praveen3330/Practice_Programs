/* Almost all the Wrapper class have 2 constructors
        a. one taking primitive type.
        b. one taking String type.    
        
        Except float, character -  float accepts float,double,string
                                   character accepts only character
                                   
         Note: In case of Boolean constructor, boolean value be treated as true w.r.t to case insensitive
           part of "true",for all others it would be treated as "false".
           
           If we are passing String argument then case is not important and content is not  important. 
           If the content is case insensitive String of true then it is treated as true  in all other cases it is treated as false. 
            */

public class InitializingVariablesThroughConstructor {

	public static void main(String[] args) {
		
		Boolean b1 =new Boolean("yes");//false
		Boolean b2 =new Boolean("no");//false
		System.out.println(b1);
		System.out.println(b2);

		System.out.println(b1.equals(b2));//false.equals(false)-> true
		System.out.println(b1 == b2);//false

		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1);//10 
		System.out.println(i2);//10 
		System.out.println(i1.equals(i2));//true 
		
		
	}

}
