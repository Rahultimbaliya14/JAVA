import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,temp,length=0,last,ch,re=1;
		System.out.println("FIND PRODUCT AND USING SWITCH");
		System.out.println();
		System.out.println("******************");
		System.out.println("ENTER NUMBER");
		System.out.println("******************");
		n=s.nextInt();
		temp=n;
		while(temp !=0)
		{
			length++;
			temp=temp/10;
		}
		int []a=new int[length+1];
		int i=length;
	     while(n !=0)
		{
			last=n%10;
			a[i]=last;
			n=n/10;
			i--;
		}
		System.out.println();
		System.out.println("*******MANU*******");
		System.out.println("1.PRODUCT");
		System.out.println("2.SUM");
		System.out.println("ENTER YOUR CHOICE");
		ch=s.nextInt();
		System.out.println("**********************");
		switch(ch)
		{
			case 1:
			{
				for(int j=1;j<=length;j++)
				{
					re=re*a[j];
				}
				System.out.println();
				System.out.println("******************");
				System.out.println("PRODUCT");
				System.out.println("******************");
				System.out.println(+re);
				break;
			}
			case 2:
			{
				re=0;
				for(int j=1;j<=length;j++)
				{
					re=re+a[j];
				}
				System.out.println();
				System.out.println("******************");
				System.out.println("SUM");
				System.out.println("******************");
				System.out.println(+re);
				break;
			}
			default :
			{
				System.out.println();
				System.out.println("ENTER RIGHT CHOICE");
			}
		}
	}
}