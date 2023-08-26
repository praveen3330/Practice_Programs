//An interface can extend any no of interfaces at a time

interface i1{
	void add();
}

interface i2 {
	void sub();
}

class Harish implements i1,i2{
	public void add() {
		System.out.println("Adding");
	}
	public void sub() {
		System.out.println("Subtracting");
	}
}
public class Interface5 {

	public static void main(String[] args) {
		Harish h = new Harish();
		h.add();
		h.sub();

	}

}
