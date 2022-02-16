import java.util.*;
public class DECIMALTOBINARY {
	public static void main(String[] args) {
		int n,j=0,start=0;
		Scanner s=new Scanner(System.in);
		System.out.println("****DECIMAL TO BINARY****");
		System.out.println();
		System.out.println("*************************");
		System.out.println("Enter A Decimal Value   *");
		System.out.println("*************************");
		n=s.nextInt();
		int  []a={32768,16384,8192,4096,2048,1024,512,256,128,64,32,16,8,4,2,1} ;
		int []b=new int[100];
		for(int i=0;i<a.length;i++)
		{
			if(n>=a[i])
			{
				n=n-a[i];
				b[j]=1;
				j++;
			}
			else
			{
				b[j]=0;
				j++;
			}
		}
		for(int i=0;i<j;i++ )
		{
			if(b[i]==1)
			{
				start=i;
				break;
			}
			
		}
		System.out.println();
		System.out.println("*************************");
		System.out.println("BINARY VALUE IS         *");
		System.out.println("*************************");
		for(int i=start;i<j;i++)
		{
			System.out.print(+b[i]);
		}
	}
}