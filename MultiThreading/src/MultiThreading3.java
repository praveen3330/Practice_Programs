// to get thread name and set name

class Thread3 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class MultiThreading3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());    // to get current name of thread
		Thread3 t = new Thread3();
		t.start();
		
		Thread.currentThread().setName("Harish");  
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}

}
