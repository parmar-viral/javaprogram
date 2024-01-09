/*
//simple inheritance program.......................................................................
class demo1{
	int n1;
	void input(){
		n1=225;		
	}
	void output(){
		System.out.println("n1="+n1);		
	}
	
}
class demo2 extends demo1{
	int n2;
	void input1(){
		n2=25;		
	}
	void output1(){
		System.out.println("n2="+n2);		
	}	
	void sum(){
		System.out.println("sum of n1 and n2="+(n1+n2));		
	}
}
class inheritance {
	public static void main(String[] args){
		
	demo2 d=new demo2();
	System.out.println("simple inheritance program................................................................");
	d.input();
	d.input1();
	d.output();
	d.output1();
	d.sum();
	}	
}
*/
/*
//constructor in inheritance without super() ............................................................................
class demo1{
	int n1;
	demo1(){
		
	}
	demo1(int x){		
		n1=x;
	}
	void output(){
		System.out.println("n1="+n1);		
	}
	
}
class demo2 extends demo1{
	int n2;
	demo2(){
		
	}
	demo2(int x, int y){
		n1=x;
		n2=y;
	}
	void output1(){
		System.out.println("n2="+n2);		
	}	
	void sum(){
		System.out.println("sum of n1 and n2="+(n1+n2));		
	}
}
class inheritance {
	public static void main(String[] args){
		
	demo2 d=new demo2(220,20);
	System.out.println("constructor in  inheritance without super() program................");

	d.output();
	d.output1();
	d.sum();
	}	
}
*/
/*
//constructor in inheritance with super() program............................
class demo1{
	int n1;
	demo1(){
		
	}
	demo1(int x){		
		n1=x;
	}
	void output(){
		System.out.println("n1="+n1);		
	}
	
}
class demo2 extends demo1{
	int n2;
	demo2(){
		
	}
	demo2(int x, int y){
		super(x);
		n2=y;
	}
	void output1(){
		System.out.println("n2="+n2);		
	}	
	void sum(){
		System.out.println("sum of n1 and n2="+(n1+n2));		
	}
}
class inheritance {
	public static void main(String[] args){
		
	demo2 d=new demo2(220,200);
	System.out.println("constructor in  inheritance with super() program................");

	d.output();
	d.output1();
	d.sum();
	}	
}
*/
//constructor overloading in inheritance without super() program...............................................
import java.util.Scanner;
class demo1{
	int n1;
	Scanner sc1=new Scanner(System.in);
	demo1(){
		System.out.print("enter value for n1=");
		n1=sc1.nextInt();
	}
	demo1(int x){		
		n1=x;
	}
	demo1(demo1 d1){
		n1=d1.n1;		
	}
	void output(){
		System.out.println("n1="+n1);		
	}
	
}
class demo2 extends demo1{
	int n2;
			Scanner sc2=new Scanner(System.in);
	demo2(){
		super();
		System.out.print("enter value for n2=");
		n2=sc2.nextInt();
	}
	demo2(int x, int y){
		super(x);
		n2=y;
	}
	demo2(demo2 d1){
		n1=d1.n1;	
		n2=d1.n2;	
	}
	void output1(){
		System.out.println("n2="+n2);		
	}	
	void sum(){
		System.out.println("sum of n1 and n2="+(n1+n2));		
	}
}
class inheritance {
	public static void main(String[] args){
	System.out.println("constructor in  inheritance with super() program................");
	System.out.println("default constructor call.......................");
	demo2 D=new demo2();
	D.output();
	D.output1();
	D.sum();
	System.out.println("parameterized constructor call.......................");
	demo2 d=new demo2(220,2000);

	d.output();
	d.output1();
	d.sum();
	System.out.println("object as argument constructor call.......................");
	demo2 d1=new demo2(D);
	d1.output();
	d1.output1();
	d1.sum();
	}	
}