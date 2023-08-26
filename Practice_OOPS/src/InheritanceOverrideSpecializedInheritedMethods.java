class Demo {
	public void disp() {
		System.out.println("disp");
	}
	public void hi() {
		System.out.println("hi");
	}
}
class Demo4 extends Demo{
	
	// hi is Inherited method
	public void disp() {                      //MethodOverride 
		System.out.println("disp all");
	}
	public void hello() {                        //Specialized  method
		System.out.println("Hello");
	}
}
public class InheritanceOverrideSpecializedInheritedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo4 d = new Demo4();
        d.disp();
        d.hi();
        d.hello();
	}

}
