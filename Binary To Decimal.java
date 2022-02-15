import java.util.*;
public class Main {
	public static void main(String[] args) {
		long n=0,temp,sum=0,last;
		int length=0,con=0;
		Scanner s=new Scanner(System.in);
		System.out.println("***BINARY TO DECIMAL***");
		System.out.println();		
		System.out.println("************************");
		System.out.println("Enter Binary Number");
		System.out.println("************************");
		System.out.println();
		n=s.nextLong();
		temp=n;
		while(temp !=0)
		{
			length++;
			temp/=10;
		}
		long []a=new long[length+1];
		int i=length;
		while(n!=0)
		{
			 last=n%10;
			a[i]=last;
			i--;
			n/=10;
		}	
		long []b={32768,16384,8192,4096,2048,1024,512,256,128,64,32,16,8,4,2,1} ;
		int c=15;
		for(int j=length;j>=1;j--)
		{
            if(a[j]==1)
            {
               sum=sum+b[c];	
            }
            c--;		
		}
		System.out.println();
		System.out.println("************************");
		System.out.println("DECIMAL VALUE IS = "+sum);
		System.out.println("************************");
	}
}