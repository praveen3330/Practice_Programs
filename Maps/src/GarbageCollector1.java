import java.util.HashMap;

class Employee
{
	private int empid;
	private String name;
	private String empAddr;
	
	@Override
	public String toString()
	{
		return "hyder";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Garbage Collector collected the object");
	}
	//setter
	//getters
}

public class GarbageCollector1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		HashMap hm=new HashMap();
		hm.put(e, "Hyder");
		//Statements
		//Statements
		e=null; //eleigible for garbage collection
		System.gc();//call to GC
		
		Thread.sleep(4000);
		System.out.println(hm);	
		
	}

}
