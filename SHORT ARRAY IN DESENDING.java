//CREATED BY RAHUL TIMBALIYA
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int [] a=new int[100];
		Scanner s=new Scanner(System.in);
		int i,j,n,temp;
		System.out.println("Enter how Many Element");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter"+i+"Number");
			a[i]=s.nextInt();
		}
		System.out.println("before shorting");
		for(i=1;i<=n;i++)
		{
			System.out.println(+a[i]);
		}
		System.out.println("After shortting");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Before shorting");
		for(i=1;i<=n;i++)
		{
			System.out.println(+a[i]);
		}
	}
}
