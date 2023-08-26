interface Demo{
	void disp();
	void add(int a, int b);
}
public class AnonymousClass3 {

	public static void main(String[] args) {
		Demo d = new Demo() {
			public void disp() {
				System.out.println("Hello");
			}
			public void add(int a , int b) {
				System.out.println("Sum is " + (a+b));
			}
		};
		d.disp();
		d.add(10, 20);

	}

}
