import java.util.*;
 //daasupport2017@gmail.com
public class TowersofHanoi
{
    public static void main(String[] args)
		{
           System.out.print("Enter no. of discs--> ");
           Scanner scan = new Scanner(System.in);
           int discs = scan.nextInt();
           towers(discs, "A", "B", "C");
		}
	private static void  towers(int n, String start, String mid, String end) 
		{
            if (n == 1) {
               System.out.println("from "+start + " -> " + end);
           } else {
                towers(n - 1,start,end,mid);
               System.out.println("from "+start + " -> " + end);
                towers(n - 1,mid,start, end);
           }
		   /* I have done  A B C
		   to  A c B  and  B A C  after  that function call */
		}
}