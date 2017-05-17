import java.util.*;
public class Heap
{    
    private static int heapsize;
	public static void main(String[] args) 
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("enter size of array");
        int n = scan.nextInt(); 
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        System.out.println("enter elements of array");
        for (int i=0; i<n; i++)
		{
			int m = scan.nextInt();
            arr.add(m);
		}
		int i=0;
		while(i<1){  
			System.out.println("enter any of following");
			System.out.println("1. Heap sort");
			System.out.println("2. Extract max element");
			System.out.println("3. Increase value of an element");
			System.out.println("4. Insert element in heap");
		int k = scan.nextInt();
		switch(k)
		{
			case 1:heapsort(arr);
					System.out.println("sorted elements of array -->");        
					for (int j=0; j<arr.size(); j++)
						System.out.print(arr.get(j)+" ");
					System.out.println();
			break;
			case 2:extractMax(arr);
			break;
			case 3:increaseValue(arr);
			break;
			case 4:insertElement(arr);
			break;
			default:System.exit(0);
		}
		}
    } 
    public static void heapsort(ArrayList<Integer> arr)
    {       
        buildheap(arr);        
        for (int i = heapsize; i > 0; i--)
        {
            swap(arr,0, i);
            heapsize = heapsize-1;
            maxheapify(arr, 0);
        }
    }     
    public static void buildheap(ArrayList<Integer> arr)
    {
        heapsize = arr.size()-1;
        for (int i = heapsize/2; i >= 0; i--)
            maxheapify(arr, i);        
    }
    public static void maxheapify(ArrayList<Integer> arr, int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= heapsize && arr.get(left) > arr.get(i))
            max = left;
        if (right <= heapsize && arr.get(right) > arr.get(max))        
            max = right;
 
        if (max != i)
        {
            swap(arr, i, max);
            maxheapify(arr, max);
        }
    }    
    public static void swap(ArrayList<Integer> arr, int i, int j)
    {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
		arr.set(j, temp);
    }  
    public static void extractMax(ArrayList<Integer> arr) 
	{
		heapsort(arr);
		System.out.println("maximum element of array = "+arr.get(arr.size()-1));
		arr.remove(arr.size()-1);
	}
	public static void increaseValue(ArrayList<Integer> arr)
	{
		Scanner scan = new Scanner( System.in );
		System.out.println("enter index");
		int n = scan.nextInt();
		System.out.println("enter value");
		int m = scan.nextInt();
		arr.set(n, m);
	}
	public static void insertElement(ArrayList<Integer> arr)
	{
		System.out.println("enter element to be added");
		Scanner scan = new Scanner( System.in );
		int n = scan.nextInt();
		arr.add(n);
	}
}