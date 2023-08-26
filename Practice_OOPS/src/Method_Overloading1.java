
 public class Method_Overloading1 {
	
	// Method Overloading means same method name but different parameters
	
	void add(int a , int b) {
		int res = a+b;
		System.out.println(res);
	}
	
	void add(int a , int b , int c) {
		int res = a+b+c;
		System.out.println(res);
	}
	
	void add(int a , int b , float c) {
		float res = a+b+c;
		System.out.println(res);
	}
	
	void add(int a , float b) {
		float res = a+b;
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading1 calc = new Method_Overloading1();
		calc.add(10, 20);
		calc.add(10, 20, 30);
		calc.add(10, 20, 10.0f);
		calc.add(10, 20.0f);
 
	}

}
