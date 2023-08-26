/*  Interupting a Thread
    ====================
    public void interrupt()
     => If thread is in sleeping state or in waiting state we can interupt a thread.  */

class H10 extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Child Thread");
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {
			System.out.println("The method is Interrupted");
		}
	}
}
public class MultiThreading10 {

	public static void main(String[] args) {
		H10 h = new H10();
		h.start();
		h.interrupt();  // if we use this then the method will get interupt if we dont use this then child thread will execute for 5 times without exception
	}

}
