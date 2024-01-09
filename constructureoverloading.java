import java.util.Scanner;
class constructureoverloading{
	int n1,n2;
	constructureoverloading(){
		Scanner sc1=new Scanner(System.in);
		System.out.print("enter value for n1=");
		n1=sc1.nextInt();
		System.out.print("enter value for n2=");
		n2=sc1.nextInt();		
		sc1.close();
	}
	constructureoverloading(int a,int b){
		n1=a;
		n2=b;		
	}	
	constructureoverloading(constructureoverloading con2){
		n1=con2.n1;
		n2=con2.n2;		
	}
	void displayinfo(){
		System.out.println("value of n1="+n1+"\nvalue of n2="+n2+"\nsum="+(n1+n2));		
	}
	public static void main(String[] args){
		constructureoverloading con1=new constructureoverloading();
		System.out.println("print value for default constructure....");
		con1.displayinfo();
		constructureoverloading con2=new constructureoverloading(200,400);
		System.out.println("print value for parameterized constructure....");
		con2.displayinfo();		
		constructureoverloading con3=new constructureoverloading(con2);
		System.out.println("value for object as parameter constructure...");
		con3.displayinfo();
	}
	
}