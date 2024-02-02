import java.util.Scanner;
class methodoverloading_ex{
	
	void max(int a, int b){
		if(a>b)
			System.out.println("a is max");

		else if(b>a)
				System.out.println("b is max");
		else
			System.out.println("both are equals...........");
	}
	void max(float a, float b,float c){
		if(a>b && a>c)
			System.out.println("a is max");

		else if(b>c && b>a)
				System.out.println("b is max");
		else if(c>a && c>b)
			System.out.println("c is max");			
		else
			System.out.println("all are equals...........");
	}	
	public static void main(String[] args){
		int n1,n2,n3;
		Scanner sc1=new Scanner(System.in);
		System.out.print("enter n1=");
		n1=sc1.nextInt();
		System.out.print("enter n2=");
		n2=sc1.nextInt();
		System.out.print("enter n3=");
		n3=sc1.nextInt();
		sc1.close();
		methodoverloading_ex c1=new methodoverloading_ex();
		c1.max(n2,n3);
		c1.max(n1,n2,n3);	
		
	}
	
}