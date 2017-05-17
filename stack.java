import java.util.*;
//daasupport2017@gmail.com
class stack
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		 Queue<Integer> queue = new LinkedList<>();
		 Queue<Integer> temp = new LinkedList<>();
		 System.out.println("enter the no. -->");
		 System.out.println("for push press 1.");
		 System.out.println("for pop press 2.");
		 System.out.println("for print press 3.");
		 
		 
		 int k=1;
		 while(k>0){
			 System.out.println("enter the no. -->");
		 System.out.println("for push press 1.");
		 System.out.println("for pop press 2.");
		 System.out.println("for print press 3.");
		 int n =scan.nextInt();
		 switch(n)
		 {
   case 1 :
     push(queue,temp);
	 break;
       
   
   case 2 :
     pop(queue,temp);
     break;
   
   case 3 :
    System.out.println(queue);
	break;
      
   default :
     	 System.out.println("enter no. less than 3");
		 System.exit(0);
		 
}
continue;
		 }
	}///////////////////////////////////////////////////////////////////////////
	private static void push(Queue<Integer> queue, Queue<Integer> temp)
	{
		Scanner scan=new Scanner(System.in);
		if(queue.size()==0)
		queue.add(scan.nextInt());
	else
	{
		while(queue.size()!=0)
			temp.add(queue.remove());
		queue.add(scan.nextInt());
		while(temp.size()!=0)
			queue.add(temp.remove());
	}
   /*if(queue size is 0)
{
add new element;
}
else
{while(queue size is not 0)
adding in temp after removing from queue;
(temp size is not 0)
{
adding in queue after removing from temp;
}
}*/
	}/////////////////////////////////////////////////////////////////////////////
	private static void pop(Queue<Integer> queue, Queue<Integer> temp)
	{
		if(queue.size()==0)
			System.out.println("underflow");
		else
			 System.out.println("popped element --> "+queue.remove());
	}
	/*if(queue size is 0)
{
underflow
}
else
dequeue*/
}