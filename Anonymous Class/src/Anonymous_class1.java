class Anonymous{
	public void add() {
		System.out.println("Add");
	}
}
public class Anonymous_class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anonymous a = new Anonymous() { //Anonymous class
			public void add(){
			    System.out.println("Add 2 numbers");
		   }
		};
		a.add();
	}
}


//Here there are totally 3 classes

/* Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at the same time. 
They are like local classes except that they do not have a name. Use them if you need to use a local class only once. */