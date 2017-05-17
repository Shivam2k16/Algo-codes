import java.util.*;
public class HashTable
{
	private static int sample;
    public static void main(String[] args)
		{
           System.out.println("Enter prime no.");
           Scanner scan = new Scanner(System.in);
		   int prime=scan.nextInt();
		   System.out.println("Enter string");
		     LinkedList[] hash=new LinkedList[prime];
			     String word = scan.next();
		   int key =asciiSum(word)%prime;
			   sample=0;
		   try{
			   if(hash[key].isEmpty())
				   hash[key] =new LinkedList();
		   }
		   catch(NullPointerException dd)
		   {
				hash[key] =new LinkedList();
		   }
		   hash[key].add(word);
			 int i=1;
			 while(i>0)
			 {
				 System.out.println("Enter any of the following-->");
			 System.out.println("1. To add string.");
			 System.out.println("2. To remove key.");
			 System.out.println("3. To print key's string.");
			 System.out.println("Enter greater than 3 to exit");
				 int n=scan.nextInt();
			 switch(n)
			 {
			 case 1: addString(prime,hash);// with the help of this function we add string
			    break;
				
				case 2:removekey(prime,hash);// with the help of this function we remove the whole key
				break;
				case 3:printString(prime,hash);// with the help of this function we print strings of particular key
		   break;
		   default : System.exit(0);
         
		   
			 }
			 continue;
			 }
		   }
		   private static void printString(int prime,LinkedList[] hash)
		   {
			   Scanner scan=new Scanner(System.in);
			   System.out.println("enter key");
				int m=scan.nextInt();  
				if(m<prime){
				try{
			   if(hash[m].isEmpty())
				   System.out.println("no words to remove");
		   }
		   catch(NullPointerException dd)
		   {
				hash[m] =new LinkedList();
		   }
		   System.out.println(hash[m]);
				}
				else
					System.out.println("enter valid key");
		   }
		   private static void addString(int prime,LinkedList[] hash)
		   {
			   Scanner scan = new Scanner(System.in);
			    System.out.println("Enter string");
			     String word = scan.next();
		   int key =asciiSum(word)%prime;
			   sample=0;
		   try{
			   if(hash[key].isEmpty())
				   hash[key] =new LinkedList();
		   }
		   catch(NullPointerException dd)
		   {
				hash[key] =new LinkedList();
		   }
		   hash[key].add(word);
		   
		   }
		   private static int asciiSum(String word)
		   {
			   char []s=word.toCharArray();
			   for(int i=0;i<word.length();i++)
			   {
				   char c  = word.charAt(i);
				 sample+=  (int)c;
				
			   }
			   return sample;
		   }
		  /*  private static void removeString(int prime,LinkedList[] hash)
		   {
			   Scanner scan = new Scanner(System.in);
			    System.out.println("Enter string");
			     String word = scan.next();
		   int key =asciiSum(word)%prime;
			   sample=0;
		   try{
			   if(hash[key].isEmpty())
				   System.out.println("no words to remove");
		   }
		   catch(NullPointerException dd)
		   {
				hash[key] =new LinkedList();
		   }
		   if(hash[key].isEmpty())
				   System.out.println("no words to remove");
			   else
				   hash[key].remove(word);
		   
		   }*/
		    private static void removekey(int prime,LinkedList[] hash)
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("enter key");
				int key =scan.nextInt();
				if(key<prime){
				 try{
			   if(hash[key].isEmpty())
				   System.out.println("no words to remove");
		   }
		   catch(NullPointerException dd)
		   {
				hash[key] =new LinkedList();
		   }
		   if(hash[key].isEmpty())
				   System.out.println("no words to remove");
			   else
				   hash[key].clear();
				}
				else
				{
					System.out.println("enter valid key");
				}
			}
		   }