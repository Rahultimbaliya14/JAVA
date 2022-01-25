import java.util.*;
public class Main {
	public static void main(String[] args) {
	int r1,r2,c1,c2;
	System.out.println("     MULTIPLICATION OF METRIX");
	Scanner s=new Scanner(System.in);
	System.out.println();
	System.out.println("********************************");
	System.out.println("Enter The First Metrix Row Size");
	r1=s.nextInt();
	System.out.println("Enter The First Metrix Column Size");
	c1=s.nextInt();
	int [][]a=new int[r1][c1];
	System.out.println();
	System.out.println("*************************************");
	System.out.println("ENTER THE FIRST METRIX ELEMENT");
	System.out.println("*************************************");
	System.out.println();
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			System.out.println("Enter ["+i+"]["+j+"] Element");
			a[i][j]=s.nextInt();
		}
	}
	System.out.println();
	System.out.println("************************************");
	System.out.println("Enter The Second Metrix Row Size ");
	r2=s.nextInt();
	System.out.println("Enter The Second Metrix Column Size");
	c2=s.nextInt();
	int [][]b=new int[r2][c2];
	System.out.println();
	System.out.println("***********************************");
	System.out.println("ENTER THE SECOND METRIX ELEMENT");
		System.out.println("********************************");
	  System.out.println();
	for(int i=0;i<r2;i++)
	{
		for(int j=0;j<c2;j++)
		{
			System.out.println("Enter ["+i+"]["+j+"] Element");
			b[i][j]=s.nextInt();
		}
	}
	if(c1 !=r2)
	{
		System.out.println();
		System.out.println("*******************************");
		System.out.println("THE MULTIPLICATION IS NOT POSSIBLE !!!!!!!!!!!!!!!!!");
		System.out.println("BECAUSE THE FIRST METRIX COLUMN AND SECOND METRIX ROW IS NOT SAME");
		System.out.println("PLEAZE TRY LATTER");
		System.out.println("******************************");
	}
	else
	{
	System.out.println();
	System.out.println("***********************");
	System.out.println("FIRST METRIX");
	System.out.println("***********************");
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			System.out.print(+a[i][j]+"   ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("***********************");
	System.out.println("SECOND METRIX");
	System.out.println("***********************");
	for(int i=0;i<r2;i++)
	{
		for(int j=0;j<c2;j++)
		{
			System.out.print(+b[i][j]+"   ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("***********************");
	System.out.println("RESULT METRIX");
	System.out.println("***********************");
	int[][]c=new int[r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<c1;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(+c[i][j]+"   ");
			}
			System.out.println();
		}
       }	
		}	
	}
