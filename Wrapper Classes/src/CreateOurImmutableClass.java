//we can create our own immutable class

final class Test{
	int i;
	Test(int i){
		this.i = i;
	}
	public Test modify(int i) {
		if(this.i == i) {
			return this;
		}
		else {
			return new Test(i);
		}
	}
}
public class CreateOurImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test(10);
		Test t1 = t.modify(10);
		Test t2 = new Test(100);
		Test t3 = t2.modify(100);
		
		System.out.println(t==t1);
		System.out.println(t==t2);
		System.out.println(t==t3);
		System.out.println(t2==t3);
		
		
	}

}
