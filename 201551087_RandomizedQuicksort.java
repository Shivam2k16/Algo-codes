import java.util.*;
public class RandomQuicksort 
{
	private  int array[];
    private  int length;
    private void QuickSort(int left, int right) 
    {
        if (right - left <= 0)
            return;
        else 
        {
            Random rand = new Random();
            int pivotIndex = left + rand.nextInt(right - left + 1);
            swap(pivotIndex, right);
 
            int pivot = array[right];
            int partition = partitionIt(left, right, pivot);
            QuickSort(left, partition - 1);
            QuickSort(partition + 1, right);
        }
    }
 
    private  int partitionIt(int left, int right, long pivot) 
    {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) 
        {
            while (array[++leftPtr] < pivot)
                ;
            while (rightPtr > 0 && array[--rightPtr] > pivot)
                ;
 
            if (leftPtr >= rightPtr)
                break;
            else
                swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right);
        return leftPtr;
    }
 
    private  void swap(int n, int m) 
    {
        int temp = array[n];
        array[n] = array[m];
        array[m] = temp;
    }
	public static void main(String args[]) 
    {
		RandomQuicksort ra=new RandomQuicksort();
        System.out.println("enter size of array");
        Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		System.out.println("enter elements of array");
		int[] input = new int[N];
        for (int i = 0; i < N; i++)
            input[i] = scan.nextInt();
		final long start=System.nanoTime();
		ra.sort(input);
		final long end=System.nanoTime();
		for (int i = 0; i < N; i++)
            System.out.print(input[i] + " ");
		System.out.println();
		System.out.print("time taken = "+(-start+end)+" nano sec");
    }
	private void sort(int[] inputArray) 
	{
         if (inputArray==null||inputArray.length==0)
            return;
        this.array = inputArray;
        length = inputArray.length;
        QuickSort(0,length-1);
    }
}