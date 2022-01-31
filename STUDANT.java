import java.util.*;
public class STUDENT {
	long eno;
	int java,op,csh,net;
	int sum,pr;
	String name;
	String gender;
	public STUDENT(long e,String n,String g,int jav,int os,int  cs,int ne)
	{
		eno=e;
		name=n;
		gender=g;
		java=jav;
		op=os;
		csh=cs;
		net=ne;
		sum=java+op+csh+net;
		pr=sum/4;
	}
	public void display()
	{
		System.out.println("ENROLLMENT NO= "+eno);
		System.out.println("NAME = "+name);
		System.out.println("GENDER = "+gender);
		System.out.println();
		System.out.println("MARK DETAIL");
		System.out.println("**************");
		System.out.println("JAVA= "+java);
		System.out.println("OS= "+op);
		System.out.println("C#= "+csh);
		System.out.println("NETWORK= "+net);
		System.out.println();
		System.out.println("SUM="+sum);
		System.out.println("PERSENTAGE="+pr);
	}
	public static void main(String[] args) {
		int n;
		System.out.println("HOW MANY STUDANT YOU WANT TO ENTER");
		long eno;
		String name,gender="r";
		int ch,co=10;
		int java,os,cs,net;
		int j=10000000;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
    	STUDENT []m=new STUDENT[n+1];
    	for(int i=1;i<=n;i++)
    	{
    		System.out.println();
    		System.out.println("ENTER "+i+" STUDENT INFO");
    		System.out.println("****************************");
    		System.out.println("Enter EnrollMent Number");
    		eno=s.nextLong();
    		System.out.println();
    		System.out.println("Enter The Name");
    		name=s.next();
    		System.out.println();
    	    while(co==10)
    	    {
    		System.out.println("Select A Gender");
    		System.out.println("*****************");
    		System.out.println("1.MALE");
    		System.out.println("2.FEMALE");
    		System.out.println("3.OTHER");
    		ch=s.nextInt();
    		switch(ch)
    		{
    			case 1:
    			{
    				gender="MALE";
    				co=0;
    				break;
    			}
    			case 2:
    			{
    				gender="FEMALE";
    				co=0;
    				break;
    			}
    			case 3:
    			{
    				gender="OTHER";
    				co=0;
    				break;
    			}
    			default :
    			{
    				System.out.println("Enter Right Choice!!!!!!");
    				System.out.println();
    				co=10;
    			}	
    		}
    	  }
    	  System.out.println();
    	  System.out.println("ENTER MARK DETAIL");
    	  System.out.println("*********************");
    	  System.out.print("Enter Java Mark = ");
    	  java=s.nextInt();
    	  System.out.print("Enter Os Mark = ");
    	  os=s.nextInt();
    	  System.out.print("Enter C# Mark = ");
    	  cs=s.nextInt();
    	  System.out.print("Enter Network Mark = ");
    	  net=s.nextInt();
    	  m[i]=new STUDENT(eno,name,gender,java,os,cs,net);
    	  	  System.out.println("***************************");
    	  System.out.println();
    	}
    	while(j !=0)
    	{
    	System.out.println();
    	System.out.println("ENTER NUMBER OF STUDENT TO SHOW HIS INFO AND 0 TO EXIT ");
    	j=s.nextInt();
    	if(j !=0)
    	{
    	System.out.println();
    	System.out.println("*****************************");
    	System.out.println();
    	System.out.println("STUDENT "+j+" INFO");
    	System.out.println("*********************");
    	m[j].display();
    	System.out.println();
    	System.out.println("*****************************");
    	}	
    	}
	}
}