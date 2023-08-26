//Thread Priority
//Thread.MIN_PRIORITY = 1
// Thread.MAX_PRIORITY = 10
// Thread.NORM_PRIORITY = 5

class MultiThreading implements Runnable{
	public void run() {
		Thread.currentThread().setPriority(10);                    //to set priority of thread
		System.out.println(Thread.currentThread().getPriority());    //to print priority of thread
	}
}
public class MultiThreading4 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());                //to print priority of thread
		Thread.currentThread().setPriority(1);                               //to set priority of thread
		System.out.println(Thread.currentThread().getPriority());              //to print priority of thread
		
        System.out.println();
        
        MultiThreading m = new MultiThreading();
        Thread t = new Thread(m);
        t.start();
	}

}
