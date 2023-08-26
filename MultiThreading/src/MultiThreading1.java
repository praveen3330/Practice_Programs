//without writing run() method we cannot execute any thing in parent class, you can try without writing run method 
//multi threading can implemented in 2 ways 1) extends Thread 2)implementing Runnable interface

class Thread1 extends Thread{
	public void Thread1(){
		System.out.println("Thread1");
	}
	
	@Override
	public void run(){               // this is the inherited method from Thread class
		System.out.println("run method is called");
	}
}

public class MultiThreading1 {

	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();                     // it calls run method (if there is no run method then it doesnt execute anything)  and it calls another thread
	}

}
