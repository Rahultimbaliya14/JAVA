 import java.util.*;
 class Con1{
	int count=0,length;
	public Con1(int n)
	{
		System.out.println();
		System.out.println("*************************");
		for(int i=2;i<n;i++)
		{
	
			if(n%i==0)
			{
				System.out.println("Number is Not Prime");
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Number Is Prime Number");
		}
		System.out.println("*************************");
	}
	public Con1(String s)
	{
		length=s.length();
		char a[]=new char[length];
		char b[]=new char[length];
		int j=length-1;
		for(int i=0;i<length;i++)
		{
			a[i]=s.charAt(i);
			b[j]=s.charAt(i);
			j--;
		}
		for(int i=0;i<length;i++)
		{
			if(a[i]==b[i])
			{
			}
			else
			{
				count=1;
			}
			
		}
		System.out.println();
		System.out.println("*************************");
		if(count==0)
		{
			System.out.println("WORD IS PALINDROME");
		}
		else
		{
			System.out.println("WORD IS NOT PALINDROME");
		}
		System.out.println("*************************");
	
		}
	}
 public class ConstructorOverloading
 {
	public static void main(String[] args) {
		int number,ch=1;
		String word;
		Scanner s=new Scanner(System.in);
		while(ch!=3)
		{
		System.out.println();	
		System.out.println();
		System.out.println("**********MANU***********");
		System.out.println("1 : Find Prime Number");
		System.out.println("2 : Find Palindrome Word");
		System.out.println("3 : Exit");
		System.out.println("*************************");
		System.out.println();
		System.out.println("Enter Your Choice");
		ch=s.nextInt();
		System.out.println();
		if(ch==1)
		{
			System.out.println("Enter Number");
			number=s.nextInt();
	    	new Con1(number);
		}
		else if(ch==2)
		{
			System.out.println("Enter Word");
			word=s.next();
		    new Con1(word);
		}
		else if(ch==3)
		{
		}
		else
	   {
	   	System.out.println("Enter Right Choice!!!!!");
	   }
		}
		
	}
}