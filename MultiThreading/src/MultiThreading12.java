//synchronized() - 
//if we declare a method/block as synchronized then at a time only one thread can execute that method/block on that object.

class Display{
    public synchronized void wish(String name){
           for (int i=1;i<=3 ;i++ )
            {
                 System.out.print("Good Morning: ");
                  try{
                     Thread.sleep(2000);
                   }
                  catch (InterruptedException e){
                  }
              System.out.println(name);
            }
       }
}

class MyThread extends Thread{
      Display d;
      String name;
       MyThread(Display d,String name){
            this.d=d;
             this.name=name;
       }
       @Override
       public void run(){
               d.wish(name);
       }
}

public class MultiThreading12 {
        public static void main(String... args)throws InterruptedException{
               Display d=new Display();
               MyThread t1= new MyThread(d,"dhoni");
               MyThread t2= new MyThread(d,"yuvi");
               t1.start();
                t2.start();
          }
}