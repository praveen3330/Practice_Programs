package harish.main;

//Dependant Injection

public class Employee {

	String eName;
	int eId;
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eId=" + eId + "]";
	}
	
}
