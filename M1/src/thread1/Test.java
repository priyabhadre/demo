package thread1;

public class Test
{
 public static void main(String[] args) 
 {
	Hello h=new Hello();
	A t1=new A(h,"java");
	A t2=new A(h,"classes");
	
	t1.start();
	t2.start();
	
	Hello h1=new Hello();
	A t3=new A(h,"cjc");
	A t4=new A(h,"pune");
	
	t3.start();
	t4.start();
	
}
}
