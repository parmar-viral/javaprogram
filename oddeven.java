import java.util.Scanner;
public class oddeven{
	
	public static void main(String[] args){
		
		int no;
		Scanner scanobj=new Scanner(System.in);
		System.out.print("enter a number=");
		no=scanobj.nextInt();
		if(no%2==0)
		{
			System.out.println("Given number is even.........");			
			
		}else{
			
			System.out.println("Given number is odd............");
			
		}
		/*
		if(no%2==0)
		{
			System.out.println("Given number is even.........");			
			
		}else{
			
			System.out.println("Given number is odd............");
			
		}
		
		*/
		
		
	}
	
	
}