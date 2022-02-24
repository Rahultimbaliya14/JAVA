import java.util.*;
public class PATTERN2 {
	public static void main(String[] args) {
		int j,i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for( j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for( j=1;j<=i;j++)
			{
				System.out.print(+j);
			}
			for( j=j-2;j>=1;j--)
			{
				
				System.out.print(+j);
			}
			System.out.println();
			
		}
	}
}
