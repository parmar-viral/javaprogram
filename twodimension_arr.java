import java.util.Scanner;
class twodimension_arr{
	public static void main(String[] args){
		Scanner sc1=new Scanner(System.in);
		int a[][]=new int [2][3];
		
		System.out.println("enter the value for two dimensional array...........");
		for(int i=0;i<a.length;i++){
			for(int j=0 ; j<a[i].length; j++){
				System.out.print("enter the value for a["+i+"]["+j+"]=");
				a[i][j]=sc1.nextInt();				
			
			}
		}
	
		System.out.println("print the value of two dimensional array..............");
		for(int i=0;i<a.length;i++){
			for(int j=0 ; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");					
			}
			System.out.println();
		}
		sc1.close();
	}	
}