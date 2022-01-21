// Jvdroid-main: 
// Jvdroid-main: 
// Jvdroid-main: 
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a,b,ch,re;
		int tr=0;
		Scanner s=new Scanner(System.in);
		while(tr<=10)
		{
		System.out.println("Enter First Number");
		a=s.nextInt();
		System.out.println("Enter Second Number");
		b=s.nextInt();
		System.out.printf("\n\n");
		System.out.println("••••••••MANU••••••••");
		System.out.println("1.ADDTION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		System.out.printf("\n\n");
		System.out.println("Enter Your Choice");
		ch=s.nextInt();
		System.out.printf("\n\n");
		System.out.println("°°°°°°RESULT°°°°°°");
		switch(ch)
		{
			case 1:
			
				re=a+b;
				System.out.println("ADDITION="+re);
				break;
	
		   	case 2:
		
			   re=a-b;
	   		System.out.println("SUBTRACTION="+re);
	    		break;
	    		
	    	  case 3:
	    	  
	    	    re=a*b;
	    	    System.out.println("MULTIPLICATION="+re);
	    	    break;
	    	   
	    	 case 4:
	    	 
	    	      re=a/b;
	    	      System.out.println("DIVISION="+re);
	    	      break;
	    	    
	    	    
	    	       
	    	       
	    	    
	    	      
	    	    default:
	    	    System.out.println("ENETR RIGHT CHOICE ");
	    	    
		
		
		}
		tr++;
		}
		}
}