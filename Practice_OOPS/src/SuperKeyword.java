import java.util.Scanner;

class Super1{
	int age = 26;
}

class Super2 extends Super1{
	int age = 28;
	public void disp() {
		System.out.println(age);
		System.out.println(super.age);  //super keyword calls the variable of parent class
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super2 s = new Super2();
		s.disp();

	}

}
