import java.util.Scanner;
public class arithmatic_op{
	public static void main(String[] args){
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value for n1=");
		n1=sc.nextInt();
		System.out.print("enter value for n2=");
		n2=sc.nextInt();
		sc.close();
		//arithmatic operators......................
		System.out.println("addition="+(n1+n2));
		System.out.println("substraction="+(n1-n2));
		System.out.println("multiplication="+(n1*n2));
		System.out.println("division="+((float)n1/n2));
		System.out.println("reminder="+(n1%n2));

	}

}