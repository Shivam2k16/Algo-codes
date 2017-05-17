import java.util.*;
import java.io.FileReader;
import java.io.IOException;
class bubbleWord 
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String[] s1=new String[n];
		
		for(int i=0;i<n;i++)
			s1[i]=scan.next();
		long time1=System.currentTimeMillis();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(s1[j+1].compareTo(s1[j])<0)
				{
					String swap=s1[j];
			      s1[j]=s1[j+1];
			        s1[j+1]=swap;
				}
			}
		}
		long time2=System.currentTimeMillis();
		for(int i=0;i<n;i++)
			System.out.println("--> "+s1[i]);
		System.out.println("time taken milisecond="+(time2-time1));
	}
}