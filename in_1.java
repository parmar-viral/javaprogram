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
		s.close();
			
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
	int a1 ,b1;
	second()
	{
		super();
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the value of a1=");
		a1=s1.nextInt();
		System.out.print("enter the value of b1=");
		b1=s1.nextInt();
		s1.close();	
	}
	public void op(){
		System.out.println("sum="+(a+b+a1+b1));
	}
			
}

class in_1{

public static void main(String[] args)
{
	
second se=new second();
se.op();
}
}