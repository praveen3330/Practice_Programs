class H11 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
		}
		System.out.println("Thread is entering into sleep state");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {
			System.out.println();
			ie.printStackTrace();

		}
	}
}
public class MultiThreading11 {

	public static void main(String[] args) {
		H11 h = new H11();
		h.start();
		h.interrupt();       //use this check once and by commenting this line check once

	}

}
