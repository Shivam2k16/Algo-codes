import java.util.*;
class bfs
{ 
	private Queue<Integer> queue;
	public bfs()
    {
        queue = new LinkedList<Integer>();
    }
	public void search(int node_matrix[][], int source)
    {
        int number_of_nodes =node_matrix[source].length - 1;
        int[] visited =new int[number_of_nodes + 1];
        int i,element;
        visited[source] = 1;
        queue.add(source);
 
        while (!queue.isEmpty())
        {
            element = queue.remove();
            i = element;
            System.out.print(i + "\t");
            while (i<=number_of_nodes)
            {
                if (node_matrix[element][i]==1&&visited[i]==0)
                {
                    queue.add(i);
                    visited[i] = 1;
                }
                i++;
            }
        }
    }
 
    public static void main(String []arg)
    {
		Scanner scan=null;
        int number_no_nodes, source;
        try
        {
            System.out.println("Enter the number of nodes in the graph");
            scan = new Scanner(System.in);
            number_no_nodes = scan.nextInt(); 
            int node_matrix[][] = new int[number_no_nodes + 1][number_no_nodes + 1];
            System.out.println("Enter the elements of node_matrixas 0 and 1");
            for (int i=1;i<=number_no_nodes;i++)
                for(int j=1;j<=number_no_nodes;j++)
                    node_matrix[i][j] = scan.nextInt();
            System.out.println("enter initial node for the graph");
            source = scan.nextInt();
            System.out.println("the bfs traversal of the graph is -->   ");
            bfs b = new bfs();
            b.search(node_matrix, source);
 
        } catch (InputMismatchException inputMismatch)
        {
            System.out.println("invalid input ");
        }
        scan.close();
    }
}
