abstract class abs_cl{
	int age;
	String nm;
	abs_cl(){
		nm="viral";
		age=18;
	}
	abs_cl(String nm, int age){
		this.nm=nm;
		this.age=age;
	}
	abstract void display();	
}
class student extends abs_cl{
	int rno,mark;
	student(){
		super();
		rno=48;
		mark=519;		
	}
	student(int rno,String nm,int m,int age){
		super(nm,age);
		this.rno=rno;
		this.mark=m;
	}
	void display(){
		System.out.println("rno="+rno+"\nname="+nm+"\nmark="+mark+"\nage="+age);
	}
	
}
class abstract_class{
	public static void main(String[] args){
		System.out.println("default constructor call..........................");
		student s=new student();
		s.display();
		System.out.println("parameterized constructor call..........................");
		student s1=new student(49,"bca",400,20);
		s1.display();
	}
}