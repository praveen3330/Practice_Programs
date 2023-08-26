package harish.main;

// Dependancy Injection

public class Account {
    // we use this toString method when we write as primitive injection we can also use it for associations also
	/* @Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", accountName=" + accountName + ", accountType=" + accountType + "]";
	} */

	int accountNum;
	String accountName;
	String accountType;
	
	public Account(int accountNum, String accountName, String accountType) {
		super();
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.accountType = accountType;
		
	}
	
	
}
