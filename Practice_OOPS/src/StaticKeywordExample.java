import java.util.Scanner;

class Harish7{
	private int principalAmount;
	private float timeDuration;
	private double simpleInterest;
	static float rateOfInterest;
	
	static {
		rateOfInterest = 2.5f;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the amount to take as loan: ");
		principalAmount = scan.nextInt();
		System.out.println("Enter the time duration (in months) to pay back the amount: ");
		timeDuration = scan.nextFloat();
		compute();
	}
	
	public void compute() {
		simpleInterest = (principalAmount * timeDuration * rateOfInterest) / 100;
		display();
	}
	
	public void display() {
		System.out.println("The Simple Interest provided on your money is: " + simpleInterest);
		System.out.println("Thank You for choosing this bank");
	}
}
public class StaticKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to xxx Bank");
		
		Harish7 farmer1 = new Harish7();
		farmer1.input();
		
		Harish7 farmer2 = new Harish7();
		farmer2.input();

	}

}
