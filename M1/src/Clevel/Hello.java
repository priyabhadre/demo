package Clevel;

public class Hello 
{
public void display(String msg)
{

	System.out.println("hi");
	synchronized(Hello.class)
	{
	System.out.println("[");
	System.out.println(msg);
	System.out.println("]");
	
	
	System.out.println("-----------priya--------");
	}
	}
}
