// join()- If the thread has to wait untill the other thread finishes its execution then we need to go for join().
class H2 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread");
		}
	}
}
public class MultiThreading7 {

	public static void main(String[] args) throws Exception {
		H2 t = new H2();
		t.start();
		
		//we can use any of this three
		t.join();
	//	t.join(2000);
	//	t.join(10000,200);
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
		}
	}

}
