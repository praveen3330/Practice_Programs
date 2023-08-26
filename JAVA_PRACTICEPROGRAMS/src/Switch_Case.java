import java.util.*;
public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		switch (number) { 
		case 1 : System.out.println("Sunday");
		         break;
		case 2 : System.out.println("Monday");
                 break;
		case 3 : System.out.println("Tuesday");
                 break;
		case 4 : System.out.println("Wednesday");
                 break;
		case 5 : System.out.println("Thursday");
                 break;
		case 6 : System.out.println("Friday");
                 break;
		case 7 : System.out.println("Satuarday");
                 break;
		default :System.out.println("Invalid Number Please Enter the number between 1 to 7");
                 break;
		}
	}

}
