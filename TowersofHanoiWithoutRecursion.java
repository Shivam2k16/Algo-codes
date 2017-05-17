import java.util.*;
import java.lang.*;
 //daasupport2017@gmail.com
public class TowersofHanoiWithoutRecursion
{
    public static void main(String[] args)
		{
           System.out.println("Enter no. of discs--> ");
           Scanner scan = new Scanner(System.in);
           double discs = scan.nextDouble();
           double n=Math.pow(2,discs)-1;
		    int m=(int)n;
			for(int i=1;i<=m;i++)
			{
				if(i%3==0)
					 System.out.println("from B --> c");
				else if(i%3==1)
					 System.out.println("from A --> c");
				else if(i%3==2)
					 System.out.println("from A --> B");
			}
			 System.out.println("total no. of moves = "+m);
		}
}/* I have done  A B C moves  printing and no. of moves print
and code is very easy to understAND
		    */