//CREATED BY RAHUL TIMBALIYA
import java.util.*;
public class MULMETRIX {
	public static void main(String[] args) {
		int r,c;
		Scanner s=new Scanner(System.in);
		System.out.println("MULTIPLICATION OF METRIX");
		System.out.println();
		System.out.println("Enter Size Of Row");
		r=s.nextInt();
		System.out.println("Enter Size Of Column");
		c=s.nextInt();
		System.out.println();
		int [][]a=new int[r][c];
		int [][]b=new int[r][c];
		int [][]mul=new int[r+1][c+1];
		System.out.println();
		System.out.println("********************************");
		System.out.println("ENTER FIRST METRIX ELEMENT");
		System.out.println("********************************");	         
                for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter ["+i+"]["+j+"] Element");
				a[i][j]=s.nextInt();
			}
		}
		System.out.println();
		System.out.println("***********************************");
		System.out.println("ENTER SECOND METRIX ELEMENT");
		System.out.println("***********************************");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter ["+i+"]["+j+"] Element");
				b[i][j]=s.nextInt();
			}
		}
		System.out.println();
		System.out.println("***********************************");
		System.out.println("FIRST METRIX");
		System.out.println("***********************************");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(+a[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("***********************************");
		System.out.println("SECOND METRIX");
		System.out.println("***********************************");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(+b[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("***********************************");
		System.out.println("RESULT METRIX");
		System.out.println("***********************************");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mul[i][j]=0;
				for(int n=0;n<c;n++)
				{
					mul[i][j]=mul[i][j]+a[i][n]*b[n][j]; //MULTIPLICATION OF METRIX 
				}
				System.out.print(+mul[i][j]+"  ");
	                }
	                System.out.println();
                 }
	}
}
