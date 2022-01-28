//CREATED BY RAHUL TIMBALIYA
import java.util.*;
public class REQUARSION 
{
	static int pow(int base ,int p)
	{
		int result=1;
		if(p==0)
		{
			return 1;
		}
		else
		{
			result=base *pow(base,p-1);
			return result;
		}
	}
	public static void main(String []a)
	{
		int base,power;
		System.out.println("FIND POWER OF NUMBER USING REQUARSION");
		System.out.println();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number");
		base=s.nextInt();
		System.out.println();
		System.out.println("Enter Power Value");
		power=s.nextInt();
		System.out.println();
		System.out.println("*********RESULT***********");
		int result=pow(base,power);
		System.out.println(+result);
	}
}
