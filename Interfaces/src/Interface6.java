//Inside the interface we can define variables
// Inside the interface variables define requirement level constants 
// Every variable present inside interface is by default public static final


interface Remote{
	int volume = 10;         //public static final by default 
	// int y;              // in interface the variables are default final, final means compileTime constants we have initialize the variables
}

public class Interface6 implements Remote {

	public static void main(String[] args) {
		//volume = 20;              // it is final by default we cannot change the value
		System.out.println(volume);    //10
		
		int volume = 20;         //it is local variable so we can achieve
		System.out.println(volume);     //20
	}

}
