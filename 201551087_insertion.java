import java.util.*;
import java.io.FileReader;
import java.io.IOException;
class insertion 
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
		
		int key=0;
		for(int i=1;i<100;i++)
		{
			key=array[i];
			int j=i-1;
			while(j>0&&key<array[j])
			{
				int swap=array[j];
			        array[j]=array[j+1];
			        array[j+1]=swap;
					j--;
			}
			if(array[j+1]>array[j])
			array[j+1]=key;
			else
			{
			int  swap=array[j];
			array[j]=array[j+1];
			array[j+1]=swap;
			}
			
		}
		
		long time2=System.currentTimeMillis();
		for(int i=0;i<100;i++)
			System.out.println("--> "+array[i]);
		System.out.println("time taken milisecond="+(time2-time1));
	}
}