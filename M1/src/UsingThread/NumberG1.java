package UsingThread;

public class NumberG1 extends Thread 
{
   int st;
   int end;
   
   public NumberG1(int st,int end)
   {
	  this.st=st;
	  this.end=end;
	   
   }
	public void run()
	{
	
		for (int i=st;i<end;i++)
		{
			System.out.println(i);
			
			i++;
			
		}
			
	}
	 
}
