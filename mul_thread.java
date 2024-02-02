class a extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("i="+i);
        }
    }
}
class b extends Thread{
    public void run(){
        for(int j=1;j<=10;j++){
            System.out.println("j="+j);
        }
    }
}
class c extends Thread{
    public void run(){
        for(int k=1;k<=10;k++){
            System.out.println("k="+k);
        }
    }
}
public class mul_thread {

    public static void main(String[] args) {
        a a1=new a();
        b b1=new b();
        c c1=new c();
        a1.start();
        b1.start();
        c1.start();
    }
}