public class Main {
	int a,b;
	public Main() //DEFAULT CONSTRUCTOR
	{
		a=20;
		b=30;
	}
	public Main(int A,int B)//PERAMETERIZE CONSTRUCTOR
	{
		a=A;
		b=B;
	}
        Public Main(Main m)//COPY CONSTRUCTOR
        {
            this.a=a;
            this.b=b;
        }
	public void display()
	{
		System.out.printf("First Number=%d\nSecond Number=%d\n",a,b);
	}
	public static void main(String[] args) {
		Main m=new Main();//CALL DEFAULT CONSTRUCTOR
		Main n=new Main(300,400);//CALL PERAMETERRIZE CONSTRUCTOR
                Main o=new Main(m);//CALL COPY CONSTRUCTOR
                  o.display();
		  m.display();
		  n.display();
	}
}
