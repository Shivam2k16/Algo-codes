import java.util.*;
import java.io.FileReader;
import java.io.IOException;
class selectionWord 
{
	public static void main(String[] args)throws IOException
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String[] s1=new String[n];
		
		for(int i=0;i<n;i++)
			s1[i]=scan.next();
	long time1=System.currentTimeMillis();
		
		String min=s1[0];
		int index=0;
		for(int i=0;i<n;i++)
		{
			min=s1[i];
			for(int j=n-1;j>i;j--)
			{
				if(s1[j].compareTo(min)<0)
				{
					min=s1[j];
				    index=j;
				
				}
				
			}
		if(min.compareTo(s1[i])<0)
				{
					String swap=s1[i];
			      s1[i]=s1[index];
			        s1[index]=swap;
				}
		}
		long time2=System.currentTimeMillis();
		for(int i=0;i<n;i++)
			System.out.println("--> "+s1[i]);
		System.out.println("time taken milisecond="+(time2-time1));
	}
}