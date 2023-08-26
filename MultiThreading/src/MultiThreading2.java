//multi threading can implemented in 2 ways 1) extends Thread 2)implementing Runnable interface

class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<10;i++){
			System.out.println("Child Thread");
		}
	}
}
public class MultiThreading2 {

	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();             //in runnable interface there is no start method so we will convert it into thread
		
		Thread t = new Thread(my);          //converting interface to thread class which holds start method
		
		t.start();                      //two threads are created main thread and child thread
		for(int i=1;i<=10;i++)
			System.out.println("main thread");
		
	}

}
