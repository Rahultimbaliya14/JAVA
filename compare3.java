import java.util.*;
public class Main {
	public static void main(String[] args) {
		int a,b,c,ch=1;
		while(ch!=0)
		{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter First Number");
	a=s.nextInt();
	System.out.println("Enter Second Number");
	b=s.nextInt();
	System.out.println("Enter Third Number");
	c=s.nextInt();
	System.out.println();
	if(a>b&&a>c)
	{
		System.out.println("First Number is Greater="+a);
	}
	else if(b>a&&b>c)
	{
		System.out.println("Second Number is Greater"+b);
	}
	else
	{
		System.out.println("Third Number is Greater"+c);
	}
	System.out.println();
	System.out.println("ENTER 0 TO EXIT AND ANY NUMBER  TO CONTINUE");
	ch=s.nextInt();
		}
	}
}