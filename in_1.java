import java.util.Scanner;
//single inheritance
/*class first
{
	int a ,b;
	void ip()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of a=");
		a=s.nextInt();
		System.out.print("enter the value of b=");
		b=s.nextInt();
			
	}
	void op()
	{
		System.out.println("the value of a="+a);
		System.out.println("the value of b="+b);
	}
}	
class second extends first
{
		int sum;
		void sum()
		{
			sum=a+b;
			System.out.println("sum="+sum);
		}	
}

class in_1{

public static void main(String[] args)
{
	
second se=new second();
se.ip();
se.op();
se.sum();

}
}*/
class first
{
	int a ,b;
	first()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of a=");
		a=s.nextInt();
		System.out.print("enter the value of b=");
		b=s.nextInt();
			
	}
	first(int x, int y)
	{
		x=a;
		y=b;
		System.out.println("the value of a="+a);
		System.out.println("the value of b="+b);
	}
}	
class second extends first
{
	int a ,b;
	second()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of a=");
		a=s.nextInt();
		System.out.print("enter the value of b=");
		b=s.nextInt();
			
	}
	second(second s)
	{
		System.out.println("the value of a="+x);
		System.out.println("the value of b="+y);
	}		
}

class in_1{

public static void main(String[] args)
{
	
second se=new second();
second se1=new second(12,13);

}
}