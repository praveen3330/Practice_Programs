//Yield() - > It causes to pause current executing Thread for giving chance for  waiting Threads of same priority.
class h1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread");
		}
		Thread.yield();
	}
}
public class MultiThreading6 {

	public static void main(String[] args) {
		
		h1 t = new h1();
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
		}
	}

}
