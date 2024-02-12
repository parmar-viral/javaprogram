import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

class THRD extends Thread{
    public void run(){
        try {
            while (true) {
                GregorianCalendar g=new GregorianCalendar();
                SimpleDateFormat sd=new SimpleDateFormat("dd/MM/YYYY  HH:mm:ss");  

                System.out.print("\r"+"Current Date And Time="+ sd.format(g.getTime()));         
                Thread.sleep(1000);

            }
            
        } catch (Exception e) {
            System.out.println("Exception:"+e);
        }       
    }
}
class clock{
    public static void main(String[] args) {
        THRD t1=new THRD();
        t1.start();
    }
}