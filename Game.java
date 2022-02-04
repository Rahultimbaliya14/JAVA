import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n;
		char c='+';
		int Stop;
		System.out.println("*******************");
		System.out.println("Enter The Word");
		System.out.println("*******************");
		System.out.println();
		n=s.nextLine();
		char []a=new char[n.length()];
		for(int i=0;i<n.length();i++)
		{
			a[i]=n.charAt(i);
			
		}
		char []b=new char[n.length()];
		for(int i=0;i<n.length();i++)
		{
			b[i]='_';
		}
		System.out.println();
		System.out.println("***************************");
        while(c !='!')
        {
        	System.out.println();
        	System.out.println("Enter Character And Press ! To Exit");
        	c=s.next().charAt(0);
        	System.out.println();
        	for(int i=0;i<n.length();i++)
        	{
        		if(a[i]==c)
        		{
        			b[i]=c;
        		}
        	}
        	for( char r:b)
        	{
        		System.out.print(r+" ");
        	}
        	System.out.println();
        }
		}
}