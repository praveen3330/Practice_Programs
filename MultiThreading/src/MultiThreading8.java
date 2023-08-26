// we can also wait for main thread until its execution 

class H3 extends Thread {
	static Thread h;
	public void run()  {
		try {
			h.join();
		}
		catch (Exception e) {
			
		}
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread");
		}
	}
}
public class MultiThreading8 {

	public static void main(String[] args) {
		H3.h = Thread.currentThread();
		
		H3 t = new H3();
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
		}

	}

}
