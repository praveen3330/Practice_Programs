  /*     It stands for variable argument methods.
         In java language,if we have variable no of arguments, then compulsorily new method has to be written till jdk1.4.
         But jdk1.5 version, we can write single method which can handle variable no of arguments(but all of them should be of same type).   */


class Demo {
	public void add(int... x) {
		System.out.println("Var args called");
	}
}


public class VarArgs1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.add(10);
		d.add(10,20);
		d.add(10,20,30);
		d.add(10,20,30,40);
	}

}
