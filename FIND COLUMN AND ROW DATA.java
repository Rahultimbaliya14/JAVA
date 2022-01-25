import java.util.*;
public class FINDCOLUMNANDROWDATA{
	public static void main(String[] args) {
		int r,m=1,c;
	Scanner s=new Scanner(System.in);
	System.out.println("COUNT DATA OF ROW AND COLUMN");
	System.out.println();
	System.out.println("Enter the number of row");
	r=s.nextInt();
	System.out.println("Enter the number of column");
	c=s.nextInt();
	System.out.println();
	System.out.println("**************************");
	System.out.println("ENTER METRIX");
	System.out.println("**************************");
	int [][]a=new int[r][c];
	for(int i=0;i<r;i++)
	{
      for(int j=0;j<c;j++)
      {
      	System.out.println("Enter["+i+"]["+j+"]");
      	a[i][j]=s.nextInt();
      }
	}
    System.out.println();
	System.out.println("**************************");
	System.out.println("ROW INFORAMATION");
	System.out.println("**************************");
      for(int i=0;i<r;i++)
      {
      int co=0;
      	for(int j=0;j<c;j++)
      	{
      		co++;
      	}
      	
    		System.out.println("Row "+m+"="+co);
    		m++;
      }
     System.out.println();
	System.out.println("**************************");
	System.out.println("COLUMN INFORMATION");
	System.out.println("**************************");
      m=1; 
        for(int i=0;i<c;i++)
      {
      int co=0;
      	for(int j=0;j<r;j++)
      	{
      		co++;
      	}
      	
    		System.out.println("Column "+m+"="+co);
    		m++;
      }

	}	
	}
