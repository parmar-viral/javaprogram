class A extends Thread{
    synchronized public void run(){
         for(int i=1;i<=10;i++){
             System.out.println("thread a="+i+" is running");
         }
     }
 }
 class B extends Thread{
    synchronized public void run(){
         for(int i=1;i<=10;i++){
             System.out.println("thread b="+i+" is running");
         }
     }
 }
 public class mul_threading_method {
   
    public static void main(String[] args) throws InterruptedException{
         A a1=new A();
         B b1=new B();
         a1.start();  
         Thread.sleep(5000);        
         Thread.yield(); //
         a1.join();  // waits for the thread to die and ensure that one thread has been completed
         b1.start();
         b1.notify();
         
     }
 }   
 