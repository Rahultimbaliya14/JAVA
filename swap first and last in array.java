import java.util.*;
public class Main {
	public static void main(String[] args) {
		int n,length=0;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		n=s.nextInt();
    	int temp=n;
		while(temp !=0)
		{
			temp=temp/10;
			length++;
		}
		int lastnumber=0;
		int []a=new int[length+1];
		int i=length-1;
		while(n !=0)
		{
			lastnumber=n%10;
			a[i]=lastnumber;
			i--;
			n=n/10;
		}
		System.out.println();
		System.out.println("BEFOR SWAP");
		for(int j=0;j<length;j++)
		{
			System.out.println(+a[j]);
		}
		int swap=0;
		swap=a[length-1];
		a[length-1]=a[0];
		a[0]=swap;
		System.out.println();
		System.out.println("AFTER SWAP");
		for(int j=0;j<length;j++)
		{
			System.out.println(+a[j]);
		}
		
	}
}