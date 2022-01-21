import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	System.out.println("Enter Number To Print Table");
	int a=s.nextInt();
	int i=1;
	int j=1;
	
for(i=1;i<=a;i++)
{
	for(j=1;j<=10;j++)
	{
		System.out.println(+i+"*"+j+"="+i*j);
	}
	System.out.println();
}
}
}
