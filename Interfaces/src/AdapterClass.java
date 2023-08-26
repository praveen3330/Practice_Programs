/* AdapterClass - It is a design pattern allowed to solve the problem of direct implementation of interface methods  */
//it is a sample class that implements an interface only with empty implementation for every method

interface X {
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();	
}

abstract class AdapterX implements X{
	public void m1() {};
	public void m2() {};
	public void m3() {};
	public void m4() {};
	public void m5() {};	
}

class TestApp extends AdapterX{
	public void m3() {
		System.out.println("I am from m3()");
	}
}
public class AdapterClass {

	public static void main(String[] args) {
		TestApp t = new TestApp();
		t.m3();
	}

}
