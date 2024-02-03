public class wrapper_cl {
 public static void main(String[] args) {
    int a=100;
    Integer ob=Integer.valueOf(a);

    double d=3.1416;
    Double dob=Double.valueOf(d);

    char c='a';
    Character cob=Character.valueOf(c);

    boolean b=true;    
    Boolean bob=Boolean.valueOf(b);

    System.out.println("a="+a+" ob="+ob);
    System.out.println("d="+d+" dob="+dob);
    System.out.println("c="+c+" cob="+cob);
    System.out.println("b="+b+" bob="+bob);

    //autoboxing
    int i=20;
    Integer iobj=i;
    System.out.println("i="+i+" iobj="+iobj);

    //unboxing
    int i2=iobj;
    System.out.println("after unboxing...i2="+i2);

    //for boolean autoboxing

    boolean bool=true;
    Boolean B1=bool;
    System.out.println("autoboxing B1="+B1);

    //unboxing of Boolean
    boolean b1=B1;
    System.out.println("after unboxing="+b1);
 }   
}
