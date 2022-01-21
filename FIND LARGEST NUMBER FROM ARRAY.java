import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int [] a=new int[100];
		int n,i,re;
			Scanner s=new Scanner(System.in);
		System.out.println("Enter how many element");
		n=s.nextInt();
	System.out.println();
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter "+i+"Number");
			a[i]=s.nextInt();
		}
		re=a[0];
		for(i=0;i<=n;i++)
		{
			if(re<a[i])
			{
				re=a[i];
			}
		}
		System.out.println();
		System.out.println("*****RESULT******");
		System.out.println("LARGEST NUMBER FROM ARRAY="+re);
		
	}
}
