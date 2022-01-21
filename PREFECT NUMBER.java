//CREATED BY RAHUL TIMBALIYA
import java.util.*;
public class Main {
	public static void main(String[] args) {
		long n,sum=0;
		System.out.println("Enter To Find Prefect Number");
		Scanner s=new Scanner(System.in);
		n=s.nextLong();
		System.out.println();
		System.out.println("***************");
		for(int i=1;i<=n/2;i ++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				System.out.println(+i);
				
			}	
		}
		
		System.out.println();
		System.out.println("SUM = "+sum);
		System.out.println("***************");
		if(sum==n)
		{
			System.out.println("Your Given Number  "+n+" =  Sum Of Upper Number  " +sum);
			System.out.println("That's Number "+n+"  Is Prefect Number");
			sum=0;
		}
		else
		{
			System.out.println("Your Given Number "+n+"  Is Not Equal To Sum Of Upper Number  "+sum);
			System.out.println("That's Number "+n+"  Is Not Prefect Number");
			sum=0;
		}
	
		
	
	}
}
