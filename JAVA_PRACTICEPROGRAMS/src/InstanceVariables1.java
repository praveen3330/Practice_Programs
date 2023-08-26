
public class InstanceVariables1 {
	int a;     // 0 will be stored by default and it is a instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(a);  
		// we cannot call directly because the variable is outside method
		
		
		
		InstanceVariables1 i = new InstanceVariables1();   // we have to create object
		System.out.println(i.a);   // 0 will be printed 
		
		
	}

}
