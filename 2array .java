import java.util.*;
public class Main {
	public static void main(String[] args) {
		int [][][] a=new int[100][100][100];
		int i,j,m,n,o;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The number of row");
		n=s.nextInt();
		System.out.println("Enter Number of column");
		m=s.nextInt();
		System.out.println("Enter The Number OF Data In Column");
		o=s.nextInt();
		for(i=0;i<n;i++)
		{
			
			for(j=0;j<m;j++)
			{
				for(int p=0;p<o;p++)
				{
				System.out.println("Enter=["+i+"]["+j+"]["+p+"]");
				a[i][j][p]=s.nextInt();
				}
;			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				for(int p=0;p<o;p++)
				{
				System.out.println();
				System.out.println("["+i+"]["+j+"]["+p+"]");
				System.out.println(a[i][j][p]);
				}
			}
		}
	}
}