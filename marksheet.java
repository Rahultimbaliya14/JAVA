import java.util.*;
public class Marksheet{
	int [] mark=new int [4];
	float persentage;
	int sum;
	Scanner s=new Scanner(System.in);
	public void getinput()
	{
		System.out.println("Enter JAVA Mark");
		mark[0]=s.nextInt();
		System.out.println("Enter OSMark");
		mark[1]=s.nextInt();
		System.out.println("Enter C# .NET Mark");
		mark[2]=s.nextInt();
		System.out.println("Enter SAD Mark");
		mark[3]=s.nextInt();
			}
	  public void persentage()
	  {
	  	sum=mark[0]+mark[1]+mark[2]+mark[3];
	  	persentage=sum/4;
	  		  		  }
	  public void grade()
	  {
	  	if(persentage>0 && persentage<35)
	  	{
	  		System.out.println("You are Fail");
	  	}
	  	if(persentage>35 &&persentage<=45)
	  	{
	  		System.out.println("You Got A D Grade");
	  	}
	  	if(persentage>45 && persentage<=60)
	  	{
	  		System.out.println("You Got A C Grade");
	  	}
	  	if(persentage>60 &&persentage<=75)
	  	{
	  		System.out.println("You Got A B Grade");
	  	}
	  	if(persentage>75 && persentage<=85)
	  	{
	  		System.out.println("You Got A A  Grade");
	  	}
	  	if(persentage>90)
	  	{
	  		System.out.println("You Got A A+ Grade");
	  	}
	  	
	  }
	  public void display()
	  {
	  	System.out.println();
	  	System.out.println();
	  	System.out.println("JAVA MARK="+mark[0]);
	  		System.out.println("OS MARK="+mark[1]);
	  			System.out.println("C# MARK="+mark[2]);
	  				System.out.println("SAD MARK="+mark[3]);
	  				System.out.println();
	  				System.out.println("SUM="+sum);
	  				System.out.println("PERSENTAGE ="+persentage);
	  }
	  
		public static void main(String[] args) {
		Marksheet m=new Marksheet();
		m.getinput();
		m.persentage();
		m.display();
		m.grade();
	}
}