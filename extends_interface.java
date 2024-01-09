/*
interface i{
void ip1();
void ip2();

}	
interface i2 extends i{
void ip3();
}
class inter implements i2{
	public void ip1(){
		System.out.println("interface i1 ip1()");
	}
	public void ip2(){
		System.out.println("interface i1 ip2()");
	}
	public void ip3(){
	
	System.out.println("interface i2  ip3()");
}
}
class extends_interface{
	public static void main(String[] args){
		inter obj=new inter();
		obj.ip1();
		obj.ip2();
		obj.ip3();
	}
}
*/
import java.util.Scanner;
interface i1{
	//final int x=40; int y=20;
	void op();
}
interface i2 extends i1{
	void operation();
}
class inter implements i2{
		Scanner sc1=new Scanner(System.in);
	int x,y;
	//default contructor
	public inter(){
	System.out.print("enter x=");
	x=sc1.nextInt();
	System.out.print("enter y=");
	y=sc1.nextInt();
	}
	//parameterized constructor
	public inter(int a,int b){
		x=a; y=b;
	}
	
	public void op(){
		System.out.println("x="+x+"  y="+y);
	}
	public void operation(){
		System.out.println("addition="+(x+y));
		System.out.println("substraction="+(x-y));
		System.out.println("multiplication="+(x*y));
		System.out.println("division="+(x/y));
		System.out.println("reminder="+(x%y));
	}
}
class extends_interface{
	public static void main(String[] args){
	System.out.println("for default constructor.............");	
	inter obj1=new inter();
	obj1.op();
	obj1.operation();
	System.out.println("for parameterized constructor.............");
	inter obj2=new inter(100,10);
	obj2.op();
	obj2.operation();
	}
}