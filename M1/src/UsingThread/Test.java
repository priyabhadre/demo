package UsingThread;

public class Test
{

  public static void main(String[] args) 
  {
	
	  NumberG odd=new NumberG(1,100);
	  NumberG even=new NumberG(2,100);
	  
	  odd.setName("odd");
	  even.setName("even");
	  
	  odd.setPriority(5);
	  even.setPriority(8);
	  
	  odd.start();
	  even.start();
	  //odd.start();
	  
}
	
}
