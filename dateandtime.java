import java.util.*;
public class dateandtime {
    public static void main(String[] args){
            Date d=new Date();
            System.out.println(d);

            GregorianCalendar g1=new GregorianCalendar();
            System.out.println(g1.get(GregorianCalendar.YEAR));
            System.out.println(g1.get(GregorianCalendar.DAY_OF_MONTH));

            Random r=new Random();
            System.out.println("random number="+r.nextInt());
            System.out.println("float random number="+r.nextDouble(50));

            //stringTokenizer class
            String s1="abc xyz AAT";
            StringTokenizer t1=new StringTokenizer(s1);
            while (t1.hasMoreTokens()) {
                String a=t1.nextToken();
                System.out.println(a);
            }
    }
}
