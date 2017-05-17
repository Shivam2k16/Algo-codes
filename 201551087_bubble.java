import java.util.*;
import java.io.FileReader;
import java.io.IOException;
class bubble 
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan=new Scanner(new FileReader("C:\\Users\\Shivam\\Downloads\\numbers.dat"));
		
		
		int[] array=new int[100];
		int k=0;
		while(scan.hasNextInt()&&k<100)
		{
			array[k]=scan.nextInt();
				k++;
		}
	long time1=System.currentTimeMillis();
		
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<100-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int swap=array[j];
			        array[j]=array[j+1];
			        array[j+1]=swap;
				}
			}
		}
		long time2=System.currentTimeMillis();
		for(int i=0;i<100;i++)
			System.out.println("--> "+array[i]);
		System.out.println("time taken milisecond="+(time2-time1));
	}
}