import java.util.Scanner;
class onedimension_arr{
	public static void main(String[] args){
		/*
		int a[]=new int[3];
		a[0]=102; a[1]=202; a[2]=301;
		System.out.println("one dimensional array.............");
		System.out.println("a[0]="+a[0]);
		System.out.println("a[1]="+a[1]);
		System.out.println("a[2]="+a[2]);		
		*/
		Scanner sc1=new Scanner(System.in);
		
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++){
			
			System.out.println("enter the value for a["+i+"]");
			 a[i]=sc1.nextInt();			
		}
		for(int i=0;i<a.length;i++){
			
			System.out.println("a["+i+"]="+a[i]);
			
		}		
	}	
}