import java.util.*;
import java.io.FileReader;
import java.io.IOException;
class insertionWord 
{
	public static void main(String[] args)throws IOException
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String[] s1=new String[n];
		
		for(int i=0;i<n;i++)
			s1[i]=scan.next();
	long time1=System.currentTimeMillis();
		
		String sample="";
		for(int i=1;i<n;i++)
		{
			sample=s1[i];
			int j=i-1;
			while(j>0&&sample.compareTo(s1[j])<0)
			{
				String swap=s1[j];
			        s1[j]=s1[j+1];
			        s1[j+1]=swap;
					j--;
			}
			if(s1[j].compareTo(s1[j+1])<0)
			s1[j+1]=sample;
		else
		{
			String swap=s1[j];
			        s1[j]=s1[j+1];
			        s1[j+1]=swap;
		}
			
		}
		
		long time2=System.currentTimeMillis();
		for(int i=0;i<n;i++)
			System.out.println("--> "+s1[i]);
		System.out.println("time taken milisecond="+(time2-time1));
	}
}