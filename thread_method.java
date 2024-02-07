class A1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("thread A1="+i+" is running");
        }
    }    
}
class A2 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("thread A2="+i+" is running");
        }
    }    
}
public class thread_method {
 public static void main(String[] args) {
    A1 aa=new A1();
    A2 bb=new A2();
    aa.start();
    System.out.println("thread is running or not="+aa.isAlive()); //ensure that thread is running or not
    try{

        aa.join(); //waits for A1 thread to finish there execution

        System.out.println("\nthread A1 is running or not="+aa.isAlive()+"\n");

        Thread.sleep(7000);

    }catch(InterruptedException e){  }

       System.out.println("thread A2 is running or not="+bb.isAlive());
       bb.start();
       System.out.println("thread A2 is running or not="+bb.isAlive());

 }   
}
