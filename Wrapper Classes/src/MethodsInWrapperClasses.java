/*Wrapper to String -      toString()
  String to Wrapper -      valueOf()
  String to Primitive -    parsexxx()
  primitive to string -    toString()
  primitive to wrapper-    valueOf()
  wrapper to primitive-    xxxValue()  */

 // for autoboxing valueOf() is used


public class MethodsInWrapperClasses {

	public static void main(String[] args) {
		
		//valueOf()  ---- To convert any type to Wrapper then we use valueOf()
		Integer i = Integer.valueOf(10);
		Integer i1 = Integer.valueOf("10");
		Double d = Double.valueOf("10.5");
		Boolean b = Boolean.valueOf("Harish");
        System.out.println(i + " " + i1 + " " + d + " " + b);
        
        System.out.println();
        
        //xxxValue()   ------  Wrapper to primitive 
        Integer i2 = new Integer(500);
        Byte b1 = i2.byteValue();
        System.out.println(i2.byteValue());
        System.out.println(i2.shortValue());
        System.out.println(i2.intValue());
        System.out.println(i2.longValue());
        System.out.println(i2.floatValue());
        System.out.println(i2.doubleValue());
        
        Character c=new Character('c');
        char ch= c.charValue();
        System.out.println(ch);
        
        Boolean b2=new Boolean("nitin");
        boolean b3=b2.booleanValue();
        System.out.println(b1);//false
        
        System.out.println();
        
        //parsexxx() --- to convert string to primitive
      //commandline arguments => String inputs = args[0],args[1] we know that args will consider the input in string, so to convert string to 
                        // primitive we use parseXXX()
        
	}

}
