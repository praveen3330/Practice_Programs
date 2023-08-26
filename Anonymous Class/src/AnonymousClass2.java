abstract class A{           //class 1
	public abstract void add();
}
public class AnonymousClass2 {  //class 2

	public static void main(String[] args) {
		
		A a = new A() {          // class 3 (Anonymous class)
			public void add() {
				System.out.println("Add The numbers------");
			}
		};
		a.add();
	}
}


//here there are totally 3 classes