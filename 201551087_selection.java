import java.util.*;
import java.io.FileReader;
import java.io.IOException;
class selection 
{
	public static void main(String[] args)throws IOException
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
		
		int min=array[0];
		int index=0;
		for(int i=0;i<100;i++)
		{
			min=array[i];
			for(int j=100-1;j>i;j--)
			{
				if(array[j]<min)
				{
					min=array[j];
				    index=j;
				
				}
				
			}
		if(min<array[i]){
			int swap=array[i];
			array[i]=array[index];
			array[index]=swap;
		}
		}
		long time2=System.currentTimeMillis();
		for(int i=0;i<100;i++)
			System.out.println("--> "+array[i]);
		System.out.println("time taken milisecond="+(time2-time1));
	}
}