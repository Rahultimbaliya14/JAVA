0import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r,c;
		System.out.println(" PROGRAM TO SUM OF METRIX");
		System.out.println();
		System.out.println("Enter Size of Row ");
		r=s.nextInt();
		System.out.println("Enter Size Of Column");
		c=s.nextInt();
		System.out.println();
		int [][]a=new int[r][c];
		int [][]b=new int[r][c];
		int [][]sum=new int[r][c];
		System.out.println("****************************");
		System.out.println("ENTER FIRST METRIX VALUE");
		System.out.println("****************************");
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
			{
				System.out.println("Enter ["+i+"]["+j+"] Element");
				a[i][j]=s.nextInt();
			}
		}
		System.out.println();
		System.out.println("****************************");
		System.out.println("ENTER SECOND METRIX VALUE");
		System.out.println("****************************");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter ["+i+"]["+j+"] Element");
				b[i][j]=s.nextInt();
			}		
		}
		System.out.println();
		System.out.println("****************************");
		System.out.println("FIRST METRIX");
		System.out.println("****************************");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(+a[i][j]+"     ");
			}	
			System.out.println();	
		}
		System.out.println();
		System.out.println("****************************");
		System.out.println("SECOND METRIX");
		System.out.println("****************************");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(+b[i][j]+"     ");
			}	
			System.out.println();	
		}
		System.out.println();
		System.out.println("****************************");
		System.out.println("RESULT METRIX");
		System.out.println("****************************");
		for(int p=0;p<r;p++)
		{
			for(int q=0;q<c;q++)
			{
				sum[p][q]=a[p][q]+b[p][q];
				System.out.print(+sum[p][q]+"     ");
			}
			System.out.println();
		}
	}
}
