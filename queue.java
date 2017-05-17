import java.util.*;

class queue
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		 Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> temp = new Stack<Integer>();
		
		 
		 
		 int k=1;
		 while(k>0){
			 System.out.println("enter the no. -->");
		 System.out.println("for enqueue press 1.");
		 System.out.println("for dequeue press 2.");
		 System.out.println("for print press 3.");
		 int n =scan.nextInt();
		 switch(n)
		 {
   case 1 :
     stack.push(scan.nextInt());
	 break;
       
   
   case 2 :
     popped(stack,temp);
     break;
   
   case 3 :
    System.out.println(stack);
	break;
      
   default :
     	 System.out.println("enter no. less than 3");
		 System.exit(0);
		 
}
continue;
		 }
	}
	private static void popped(Stack<Integer> stack, Stack<Integer> temp)
	{
		if(stack.size()==0)
			System.out.println("underflow");
		else{
		 if(temp.size()==0)
		 {
			 temp.push(stack.pop());
			 System.out.println(temp.pop());
			
		 } 
		 }
/*if(stack size is 0)
{
underflow
}
else
{if(temp size is 0)
{
pushing in temp after popping from stack;
}
}*/
	}
	
}