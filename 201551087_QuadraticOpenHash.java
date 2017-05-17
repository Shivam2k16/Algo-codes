import java.util.*;
import java.io.FileReader;
import java.io.IOException;
class QuadraticOpenHash 
{
	private static int sample;
	private static int count;
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter size of array");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
	    String[] hash=new String[n];
		System.out.println("Enter string");
		String word = scan.next();
		int key =asciiSum(word)%n;
		sample=0;
		if(hash[key]==null)
		hash[key]=word;			
		int i=1;
			 while(i>0)
			 {
				 System.out.println("Enter any of the following-->");
			 System.out.println("1. To add string.");
			
			 System.out.println("2. To remove string.");
			 System.out.println("3. To search string.");
			 System.out.println("Enter greater than 3 to exit");
				 int m=scan.nextInt();
			 switch(m)
			 {
			 case 1: addString(n,hash);// with the help of this function we add string
			    break;
				
				case 2:removeString(n,hash);// with the help of this function we remove the string
				break;
				case 3:searchString(n,hash);// with the help of this function we search strings 
		   break;
		   
		   default : System.exit(0);
         
		   
			 }
			 continue;
			 }		
	}
	private static void searchString(int n,String []hash)//In this search we are finding the key of word and then start searching word ,if we do not get the word we print not found.
	{
		 count=0;
		 Scanner scan=new Scanner(System.in);
		System.out.println("Enter string to be searched");
		String word = scan.next();
		int key =asciiSum(word)%n;
		sample=0;
		try{
		for(int i=key;i<n;i++)
			{
				
					if(hash[key].equals(word))
					{
						count=count+1;
						System.out.println("This word  exist in array at index = "+i);	
						break;
					}
			}
				

			if(count==0)
			{
			for(int i=0;i<key;i++)
			{
				if(hash[key].equals(word))
				{
					count=count+1;
					System.out.println("This word  exist in array at index = "+i);	
					break;
				}
			}
			}
			else if(count==0)
			{
				System.out.println("This word did not exist in array");
			}
						}
			catch(Exception e){
					System.out.println("This word does not exist");
				}
		
	}
	private static void addString(int n,String []hash)// it is an add string function in quadratic ,so if key value in array is null, then add ,else use quadratic equation of  key + (i*i) to save further (I have used 2 loops to go in cyclic way )
	 {
		count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string");
		String word = scan.next();
		int key =asciiSum(word)%n;
		sample=0;
		if(hash[key]==null)
		{
		hash[key]=word;	
		}
		else
		{
			int i=1;
			while(key<n)
			{
				if(hash[key]==null)
				{
					count=count+1;
					hash[key]=word;
					break;
				}
				key+=(i*i);
				i++;
			}
			if(count==0)
			{
			while(key<(2*n))
			{
				if(hash[key-n]==null)
				{
					count=count+1;
					hash[key-n]=word;
					break;
				}
				key+=(i*i);
				i++;
			}
			}
		}
	 }
	 private static void removeString(int n,String[] hash)//I will search in cyclic way from key to n and if get the word I will put it null and break else it is not in array. 
	 {
		 count=0;
		 Scanner scan=new Scanner(System.in);
		System.out.println("Enter string to be removed");
		String word = scan.next();
		int key =asciiSum(word)%n;
		sample=0;
		
		if(hash[key].equals(word))
		{
		
		hash[key]=null;
count=count+1;		
		}
		else
		{
			for(int i=key;i<n;i++)
			{
				if(hash[key].equals(word))
				{
					count=count+1;
					hash[key]=null;	
					break;
				}
			}
			if(count==0)
			{
			for(int i=0;i<key;i++)
			{
				if(hash[key].equals(word))
				{
					count=count+1;
					hash[key]=null;	
					break;
				}
			}
			if(count==0)
			{
				System.out.println("This word did not exist in array");
			}
			}
		}
	 }
	 private static int asciiSum(String word)//this is generating sum of ascii no. of string 
	{
		char []s=word.toCharArray();
		    for(int i=0;i<word.length();i++)
		    {
			    char c  = word.charAt(i);
			    sample += (int)c;
				
		    }
			   return sample;
	}
}