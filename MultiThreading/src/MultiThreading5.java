class A implements Runnable{
	public void run() {
		//Thread.currentThread().setPriority(10);
		//System.out.println(Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class MultiThreading5 {

	public static void main(String[] args) {
		//Thread.currentThread().setPriority(1);
		//System.out.println(Thread.currentThread().getPriority());
		A a = new A();
		Thread t = new Thread(a);
		t.setPriority(7);
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
		
	}
}
