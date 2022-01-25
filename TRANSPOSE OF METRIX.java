//CREATED BY RAHUL TIMBALIYA
import java.util.*;
public class TRANSPOSEOFMETRIX {
	public static void main(String[] args) {
		int row,column;
		Scanner s=new Scanner(System.in);
		System.out.println("TRANSPOSE OF METRIX");
		System.out.println();
		System.out.println("Enter The number of row");
		row=s.nextInt();
		System.out.println("Enter Number of column");
		column=s.nextInt();
		int [][]ori=new int[row][column];
		System.out.println("************************");
		System.out.println("ENTER THE METRIX");
		System.out.println("************************");
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<column;j++)
			{
				System.out.println("Enter=["+i+"]["+j+"]");
				ori[i][j]=s.nextInt();
;			}
		}
		System.out.println();
		System.out.println("**********************");
		System.out.println("ORIGINAL METRIX");
		System.out.println("**********************");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(+ori[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("**********************");
		System.out.println("TRANSPOSE METRIX");
		System.out.println("**********************");
		for( int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(+ori[j][i]+"   ");
			}
			System.out.println();
		}
		
	}
}
