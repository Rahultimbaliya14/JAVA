import java.util.*;
public class Main {
	public static void main(String[] args) {
		int number,i,n1=0,n2=1,n3;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter How Many Element");
		number=s.nextInt();
		System.out.println(+n1+" ");
		System.out.println(+n2+" ");
		for(i=2;i<number;i++)
		{
			n3=n1+n2;
			System.out.println(+n3+" ");
			n1=n2;
			n2=n3;
		}
	
		
		
	}
}