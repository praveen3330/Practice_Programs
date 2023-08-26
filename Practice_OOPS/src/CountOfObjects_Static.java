//creating without static o/p - 1
/*class Harish6{
	int count;
	public void disp(){
		count++;
	}
}
public class CountOfObjects_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Harish6 h1 = new Harish6();
        h1.disp();
        Harish6 h2 = new Harish6();
        h2.disp();
        Harish6 h3 = new Harish6();
        h3.disp();
        
        System.out.println(h3.count);
        
	}

} */


//creating with static variable o/p - 3
/*class Harish6{
	static int count;
	public void disp(){
		count++;
	}
}
public class CountOfObjects_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Harish6 h1 = new Harish6();
        h1.disp();
        Harish6 h2 = new Harish6();
        h2.disp();
        Harish6 h3 = new Harish6();
        h3.disp();
        
        System.out.println(h3.count);
        
	}

}*/

//CREATING WITH 2 METHODS, in every method there must be count++ if we miss then we get wrong o/p.
/*class Harish6{
	static int count;
	public void disp(){
		count++;
	}
	public void disp2() {
		count++;
	}
}
public class CountOfObjects_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Harish6 h1 = new Harish6();
        h1.disp();
        Harish6 h2 = new Harish6();
        h2.disp2();
        Harish6 h3 = new Harish6();
        h3.disp();
        
        System.out.println(h3.count);
        
	}

}*/


class Harish6{
	int a;
	int b;
	static int count;
	{
		count++;
		System.out.println("Hello");
	}
	public Harish6(){
		this(100);
		System.out.println("First");
	}
	public Harish6(int a) {
		System.out.println(a);
		this.a = a;
	}
	public Harish6(int a, int b) {
		this.a = a;
		this.b = b;
	}
}


public class CountOfObjects_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Harish6 h1 = new Harish6();
        Harish6 h2 = new Harish6(10,20);
        Harish6 h3 = new Harish6(10);
        
        System.out.println(Harish6.count);
        
	}

}
