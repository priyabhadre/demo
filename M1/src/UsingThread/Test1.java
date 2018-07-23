package UsingThread;

public class Test1 
{
public static void main(String[] args) 
{
  NumberG1 odd=new NumberG1(1,50);
  NumberG1 even=new NumberG1(2,50);
  
  odd.setName("odd");
  even.setName("even");
  
	odd.setPriority(4);
	even.setPriority(5);
	
	odd.start();
	even.start();
}

}
