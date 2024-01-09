class test{
	int n1;
	int n2;
	void display(){
		System.out.println("value of n1="+n1+"\nvalue of n2="+n2);			
	}	
	void add(){
		int n3=n1+n2;
		System.out.println("addition="+n3);		
	}
	/*
	int add(){
		int n3;
		n3=n1+n2;
		return n3;
	}
	*/
}

public class class_example{
	public static void main(String[] args){
		test t1=new test();
		t1.n1=123;
		t1.n2=234;
		t1.display();
		t1.add();
		/*
		int sum=t1.add();
		System.out.println("addition="+sum);
		*/
	}	
	
}