import java.io.*;
class PostfixPrefixUsingArrayTree
{
 public static void main(String args[])throws IOException
 {
  String s,check="y";
  int n;
  PostfixPrefixUsingTree inf;
  DataInputStream inp=new DataInputStream(System.in);
  while(check.equals("y"))
  {
   System.out.println("Enter any of the following-->");
   System.out.println("1.Infix to Prefix");
   System.out.println("2.Infix to Postfix");
   System.out.println("3.Prefix to Postfix");
   n=Integer.parseInt(inp.readLine());
   switch(n)
   {
    case 1: System.out.println("Enter the infix expression ");//this case is used to calculate  prefix of the given infix .
      s=inp.readLine();
      inf=new PostfixPrefixUsingTree(s);
      System.out.println("Prefix expression:  "+inf.inToPre());     
      break;
    case 2: System.out.println("Enter the infix expression ");// this case is used to calculate postfix of given infix.
      s=inp.readLine();
      inf=new PostfixPrefixUsingTree(s);
      System.out.println("Postfix expression:  "+inf.inToPost()); 
      break;
    case 3: System.out.println("Enter the Prefix expression ");// this case is used to calculate postfix of given prefix.
      s=inp.readLine();
      inf=new PostfixPrefixUsingTree(s);
      System.out.println("Postfix expression:  "+inf.preToPost()); 
      break;
    default:System.out.println("Invalid input");
   }
  System.out.println("Press y to continue");
  check=inp.readLine();
  }
 }
}
////////////////////////////////////////////////////////////////////////////////////////
class PostfixPrefixUsingTree
{
 private TreeByArray s;
 private String input;
 private String output="";
 public PostfixPrefixUsingTree(String str)
 {
  input=str;
  s=new TreeByArray(str.length());
 }
 public String inToPre()
 {
  for(int i=input.length()-1;i>=0;i--)
  {
   char ch=input.charAt(i);
   switch(ch)
   {
    case '+':
    case '-':gotOperator(ch,1,')');
      break;
    case '*':
    case '/':gotOperator(ch,2,')');
      break;
    case ')':s.left(ch);
        break;
    case '(':gotParenthesis(')');
      break;
    default:output=ch+output;
   }
  }
  while(!s.isEmpty())
   output=s.right()+output;
  return output;
 }
 public String inToPost()
 {
  for(int i=0;i<input.length();i++)
  {
   char ch=input.charAt(i);
   switch(ch)
   {
    case '+':
    case '-':gotOperator(ch,1,'(');
      break;
    case '*':
    case '/':gotOperator(ch,2,'(');
      break;
    case '(':s.left(ch);
        break;
    case ')':gotParenthesis('(');
      break;
    default:output=output+ch;
   }
  }
  while(!s.isEmpty())
   output=output+s.right();
  return output;
 }
 public String preToPost()
 {
  TreeByArray f=new TreeByArray(input.length());
  for(int i=0;i<input.length();i++)
  {
   char ch=input.charAt(i);
   if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
   {
    s.left(ch);
    f.left('0');
   }
   else
   {
    output=output+ch;
    while(f.root()=='1')
    {
     output=output+s.right();
     f.right();
     if(f.isEmpty())
      break;
    }
    if(!f.isEmpty())
     f.right();
    f.left('1');
   }
  }
  return output;
 }
 private void gotOperator(char opThis,int prec1,char x)
 {
  while(!s.isEmpty())
  {
   char opTop=s.right();
   if(opTop==x)
   {
    s.left(opTop);
    break;
   }
   else
   {
    int prec2;
    if(opTop=='+'||opTop=='-')
     prec2=1;
    else
     prec2=2;
    if(prec2<prec1&&x=='(')
    {
     s.left(opTop);
     break;
    }
    else if(prec2<=prec1&&x==')')
    {
     s.left(opTop);
     break;
    }
    else
    {
     if(x==')')
      output=opTop+output;
     else
      output=output+opTop;
    }
   }
  }
  s.left(opThis);
 }
 private void gotParenthesis(char x)
 {
  while(!s.isEmpty())
  {
   char ch=s.right();
   if(ch==x)
    break;
   else
   {
    if(x==')')
      output=ch+output;
    else
      output=output+ch;
   }
  }
 }
}
//////////////////////////tree//////////////////////////
class TreeByArray
{
  private char[] a;
 private int start,m;
 public TreeByArray(int max)
 {
  m=max;
  a=new char[m];
  start=-1;
 }
 public void left(char key)
 {
  a[++start]=key;
 }
 public char right()
 {
  return(a[start--]);
 }
 public char root()
 {
  return(a[start]);
 }
 public boolean isEmpty()
 {
  return (start==-1);
 }
}