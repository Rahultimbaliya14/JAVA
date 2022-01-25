import java.util.*;
public class Frequancy{
	public static void main(String[] args) {
		int n,last ,high=0;
		Scanner s=new Scanner(System.in);
		System.out.println("FIND FREQUANCY OF NUMBER");
		System.out.println();
		System.out.println("********************");
		System.out.println("Enter the number");
		System.out.println("********************");
		n=s.nextInt();
		int []a=new int[10];
		while(n !=0)
		{
			last=n%10;
			a[last]++;
			n=n/10;
			if(high<last)
			{
				high=last;
			}
		}
		System.out.println();
		System.out.println("*****************************");
		System.out.println("FREQUANCY OF NUMBER :");
		System.out.println("*****************************");
		for(int i=0;i<high+1;i++)
		{
			if(a[i] !=0)
			{
			System.out.println("    "+i+"   ="+a[i]);
			}
		}
	}
}