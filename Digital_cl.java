import java.util.*;
import java.text.SimpleDateFormat;
class thrd extends Thread{
    public void run(){
        try {
                while (true) {
                    
                    Date d=new Date();
                    SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss");

                    // Print the current time to the console
                    System.out.print("\r"+"Current Time="+ sd.format(d)+" and current Date="+d);
                    Thread.sleep(1000); // Sleep for 1 second
                              
                }
              
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class Digital_cl {
    public static void main(String[] args) {
        
        thrd th1=new thrd();
        th1.start();
    }
}
