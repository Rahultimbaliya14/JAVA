//CREATED BY RAHUL TIMBALIYA
import java.util.*;
public class Main {
	public static void main(String[] args) {
		long n=1,sum=0,m;
		int j=1;
		Scanner s=new Scanner(System.in);
		System.out.println("HOW MANY NUMBER YOU CAN CHECK");
		m=s.nextLong();
		System.out.println();
		System.out.println("****************************");
		System.out.println("LIST OF PERFECT NUMBER");
		System.out.println("****************************");
		while(n<=m)
		{
		for(int i=1;i<=n/2;i ++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}	
		}
		if(sum==n)
		{
			System.out.println("["+j+"]=  "+n);
			j++;
			sum=0;
		}
			sum=0;
			n++;
		}
			System.out.println("****************************");

}	
}
