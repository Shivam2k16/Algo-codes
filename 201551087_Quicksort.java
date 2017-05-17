import java.util.*; 
public class Quicksort {
    private  int array[];
    private  int length;
   public static void main(String []args)
   {
		Quicksort qsort=new Quicksort();
        System.out.println("enter size of array");
        Scanner scan =new Scanner(System.in);
        int n= scan.nextInt();
		int[] input=new int[n];
		  System.out.println("enter elements of array");
		  for(int i=0; i<n;i++)
			  input[i]= scan.nextInt();
		  final long start=System.nanoTime();
        qsort.sort(input);
		final long end=System.nanoTime();
        for(int i=0; i<n;i++)
            System.out.print(" "+input[i]+" ");
		System.out.print("time taken = "+(-start+end)+" nano sec");
	}
    private  void quickSort(int p,int r) 
	{
        int i = p;
        int j = r;
        // calculate pivot number, I am taking pivot as middle index number .Divide into two arrays.
        int pivot = array[p+(r-p)/2];
        while (i <= j){// In each iteration, we will identify a number from left side which is greater then the pivot value, and also we will identify a number from right side which is less then the pivot value. Once the search is done, then we exchange both numbers.
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j){
                int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
                i++;
                j--;
            }
        }
        // calling quickSort() method recursively
        if (p < j)
            quickSort(p, j);
        if (i < r)
            quickSort(i, r);
    }
	public void sort(int[] inputArray) 
	{
         if (inputArray==null||inputArray.length==0)
            return;
        this.array = inputArray;
        length = inputArray.length;
        quickSort(0,length-1);
    }
}
