import java.util.*;
public class PETTERN{
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("*******************");
		System.out.println("Enter The Number");
		System.out.println("*******************");
		System.out.println();
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
			System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}