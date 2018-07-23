package thread1;

public class Multithread 
{
public static void main(String[] args)
{
 
	int n=8;
 
    for (int i=0;i<8;i++)
    {
     Demo d=new Demo();
     d.start();
    	
    }

}
}
