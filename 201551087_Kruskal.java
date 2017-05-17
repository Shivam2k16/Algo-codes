import java.util.*;
class kruskal
{
public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("the no. of edges of tree");
	int edge= scan.nextInt();
	char []start =new char[edge];
	char []end   =new char[edge];
	char []sample=new char[2*edge];
	int  []cost  =new int [edge];
	for(int i=0;i<edge;i++)
	{
		System.out.println("enter starting vertex of edge");
		start[i]=scan.next().charAt(0);
		System.out.println("enter ending vertex of edge");
		end[i]=scan.next().charAt(0);
		System.out.println("enter cost of edge");
		cost[i]=scan.nextInt();
		System.out.println("enter next -->");
		System.out.println();
	}
	///////////////////////////////insertion sort for edges/////////////////////////////////
	int key=0;
		for(int i=1;i<edge;i++)
		{
			key=cost[i];
			int j=i-1;
			while(j>0&&key<cost[j])
			{
				int swap=cost[j];
			        cost[j]=cost[j+1];
			        cost[j+1]=swap;
					
				char temp=start[j];
					start[j]=start[j+1];
					start[j+1]=temp;
					
					temp=end[j];
					end[j]=end[j+1];
					end[j+1]=temp;
					j--;
			}
			if(cost[j+1]>cost[j])
			cost[j+1]=key;
			else
			{
				int  swap=cost[j];
					cost[j]=cost[j+1];
					cost[j+1]=swap;
				
				char temp=start[j];
					start[j]=start[j+1];
					start[j+1]=temp;
					
					temp=end[j];
					end[j]=end[j+1];
					end[j+1]=temp;
			}
			
		}
		///////////////////////////making of tree//////////////////////////////////
		int count1=0;
		int count2=0;
		System.out.println("-*-TREE-*-");
		System.out.println("start_edge  cost  end_edge");
		for(int i=0;i<edge;i++)
		{
			for(int j=0;j<2*edge;j++)
			{
				if(start[i]==sample[j])
				{
					count1++;
				}
			}
			for(int j=0;j<2*edge;j++)
			{
				if(end[i]==sample[j])
				{
					count2++;
				}
			}
			if(count1==0||count2==0)
			{
				System.out.println(start[i]+"  "+cost[i]+"  "+end[i]);
			}
			else if(count1==0&&count2==0)
			{
				System.out.println(start[i]+"  "+cost[i]+"  "+end[i]);
			}
			sample[i]=start[i];
			sample[(2*edge)-1-i]=end[i];
			count1=0;
			count2=0;
		}
}
}