//sleep() - If a thread dont' want to perform any operation for a particular amount of time then we should go for sleep().

public class MultiThreading9 {

	public static void main(String[] args) throws Exception {
		
		for(int i=0;i<=5;i++) {
			Thread.sleep(2000);
			System.out.println("Hi");
		}
	}

}
