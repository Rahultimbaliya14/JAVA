/ / CREATED BY RAHUL TIMBALIYA 
import java.util.*;
public class SHAPE{
	          public void Area(double b,double h)
	          {
	          System.out.println("*********************");	
	          System.out.println("PARALLELOGRAM AREA ");
	          System.out.println("*********************");
	          System.out.println("  "+b*h);	
	          }
	          public void Area(float r)
	          {
	          System.out.println("*********************");	
	          System.out.println("CIRCLE AREA ");
	          System.out.println("*********************");
	          r=r*r;
	          System.out.println("  "+3.14159*r);	
	          }
	          public void Area(float w ,float l)
	          {
	          System.out.println("*********************");	
	          System.out.println("RECTANGLE AREA");
	          System.out.println("*********************");
	          System.out.println("  "+w*l);	
	          }
	          
	public static void main(String[] args) {
		int ch,e=0;
		double base,height;
		float redius;
		float width,length;
		SHAPE s1=new SHAPE();
		Scanner s=new Scanner(System.in);
		while(e!=10)
		{
		System.out.println("*********MANU********");
		System.out.println("*********************");
		System.out.println("1 : Parallelogram Area");
		System.out.println("2 : Circle Area");
		System.out.println("3 : Rectangle Area");
		System.out.println("4 : Exit");
		System.out.println("*********************");
		System.out.println();
		System.out.println("*********************");
		System.out.println("Enter Your Choice");
		System.out.println("*********************");
		ch=s.nextInt();
		System.out.println();
		switch(ch)
		{
			case 1:
			          System.out.println("*********************");
			          System.out.println("Enter Base Value");
			          base=s.nextDouble();
			          System.out.println("Enter Hight Value");
			          height=s.nextDouble();
			          s1.Area(base,height);
			          System.out.println("*********************");
			          break;
			 case 2:
			          System.out.println("*********************");
			          System.out.println("Enter Redius Value");
			          redius=s.nextFloat();
			          s1.Area(redius);
			          System.out.println("*********************");
			          break;
			 case 3:
			         System.out.println("*********************");
			         System.out.println("Enter Width Value");
			         width=s.nextFloat();
			         System.out.println("Enter Length Value");
			         length=s.nextFloat();
			         s1.Area(width,length);
			         System.out.println("*********************");
			         break;
			  case 4 :
			          e=10;
			          break;
			   default :
			         System.out.println("Enter The Right Choice!!!!");
			         break;	  
		}
		}
		
	}
}
