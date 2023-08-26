abstract class Loan{
	abstract public void disInt();
	public void welcomeNote() {
		System.out.println("Welcome to xxx bank");
	}
}

class HomeLoan extends Loan{
	public void disInt() {
		System.out.println("Rate Of Interest of HomeLoan is 12%");
	}
}

class EducationalLoan extends Loan{
	public void disInt() {
		System.out.println("Rate Of Interest of EducationalLoan is 10%");
	}
}
public class Abstraction1 {

	public static void main(String[] args) {
		
	//	Loan l = new Loan();   we cannot create objects on abstraction class
		
		HomeLoan l1 = new HomeLoan();
		l1.welcomeNote();
		l1.disInt();

		EducationalLoan l2 = new EducationalLoan();
		l2.welcomeNote();
		l2.disInt();
	}

}
