public class Main {
	int a,b;
	public Main()
	{
		a=20;
		b=30;
	}
	public Main(int A,int B)
	{
		a=A;
		b=B;
	}
	public void display()
	{
		System.out.printf("First Number=%d\nSecond Number=%d\n",a,b);
	}
	public static void main(String[] args) {
		Main m=new Main();
		Main n=new Main(300,400);
		  m.display();
		  n.display();
	}
}