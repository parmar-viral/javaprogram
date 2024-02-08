import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

class THRD extends Thread{
    public void run(){
        while (true) {
            SimpleDateFormat sd=new SimpleDateFormat("dd/MM/YYYY  HH:mm:ss");
            GregorianCalendar g=new GregorianCalendar();
            System.out.println(sd.format(g.getTime()));

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception:"+e);
            }
        }
    }
}
class clock{
    public static void main(String[] args) {
        THRD t1=new THRD();
        t1.start();
    }
}