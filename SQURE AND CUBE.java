//CREATED BY RAHUL TIMBALIYA 
import java.util.*;
public class SQUREANDCUBE {
	public static void main(String[] args) {
		int n,square=1,cube=1;
		Scanner s=new Scanner(System.in);
		System.out.println("FIND SQUARE AND CUBE ");
		System.out.println();
		System.out.println("***************************");
		System.out.println("ENTER THE NUMBER TO FIND SQURE AND CUBE");
		System.out.println("***************************");
		
		n=s.nextInt();
		int i=0;
		while(i<2)
		{
		  	square=square*n;
		  	i++;
    	        }
    	System.out.println();
    	System.out.println("**************");
    	System.out.println("SQUARE");
    	System.out.println("**************");	
    	System.out.println("   "+square);
    	int j=0;
    	while(j<3)
    	{
    		cube=cube*n;
    		j++;
    	}
    	System.out.println();
    	System.out.println("****************");
    	System.out.println("CUBE");
    	System.out.println("****************");
    	System.out.println("   "+cube);
	}
}
