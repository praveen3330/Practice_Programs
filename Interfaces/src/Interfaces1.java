/* Interface corresponds to Service Requirement Specification (SRS) or Contract between client and service provider or 100% abstract class */

interface ISample {       //SRS class name starts with I
	void m1();             //the methods are public and abstract by default
	void m2();
}

class SampleImpl implements ISample{
	public void m1() {
		System.out.println("Body for m1 ");
	}
	public void m2() {
		System.out.println("Body for m2 ");
	}
}
public class Interfaces1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleImpl sample = new SampleImpl();
		sample.m1();
		sample.m2();
	}

}
