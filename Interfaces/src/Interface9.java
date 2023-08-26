/* If two interfaces contains a method with same signature but different return types then it is not possible to implement both in simultaneously */

interface Jagadesh{
	 void add();
}

interface Jagadesh11{
	 int add();
}

//this shows compile time error 
/* java class can implement two interfaces simultaneously but except when the two interfaces contains a method with same signature but different 
    return types it is not possible  */ 

/* class Harish1 implements Jagadesh,Jagadesh11{
	
	 public void add() {
			System.out.println("ADD");
	 }
	 
	 public int add() {
			int x=10;
			return x;
		}  
} */ 


class Harish1 implements Jagadesh{
	public void add() {
		System.out.println("add");
	}
}


class Harish2 implements Jagadesh11{
	public int add() {
		int x = 10;
		return x;
	}
}


public class Interface9 {

	public static void main(String[] args) {
	     Harish2 h2 = new Harish2();
	     System.out.println(h2.add());
	     
	     Harish1 h1 = new Harish1();
	     h1.add();
	}

}
