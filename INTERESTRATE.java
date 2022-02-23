//CREATED BY RAHUL TIMBALIYA 
//EXAMPLES OF ABSTRACT CLASS
import java.util.*;//For Scanner class
abstract class bank//Abstract class
{
	abstract void interestrate(double amount,double rate,int perioud);//Abstract Method
}
 class SBI extends bank//SBI
{
	public void interestrate(double amount,double rate,int perioud)//Impliments Abstract Method
	{
		double intre=amount*rate*perioud;
		intre=intre/100;
		System.out.println("***************************");
		System.out.println(" SBI INSTRETRATE IS = "+intre+" RS");
		System.out.println("***************************");
		System.out.println();
		
	} 
	
}
class BOB extends bank//BOB
{
	public void interestrate(double amount,double rate,int perioud)//Impliments Abstract Method
	{
		double intre=amount*rate*perioud;
		intre=intre/100;
		System.out.println("***************************");
		System.out.println(" BOB INSTRETRATE IS = "+intre+" RS");
		System.out.println("***************************");
		System.out.println();
	} 
}
class YES extends bank//YES
{
	public void interestrate(double amount,double rate,int perioud)//Impliments Abstract Method
	{
		double intre=amount*rate*perioud;
		intre=intre/100;
		System.out.println("***************************");
		System.out.println(" YES INSTRETRATE IS = "+intre+"RS");
		System.out.println("***************************");
		System.out.println();
	} 
}
class getinput//Perpose Of Input 
{
	double amount,rate;
	int perioud;
	Scanner s=new Scanner(System.in);
	void get()// Method For Input
	{
		   System.out.println();
		   System.out.println("***************************");
		   System.out.println("Enter Amount Of You Invest");
		   amount=s.nextDouble();
	           System.out.println("Enter Interestrate Per Year");
		   rate=s.nextDouble();
		   System.out.println("Enter Perioud Of Intrest");
		   perioud=s.nextInt();
	}
}
public class INTERESTRATE{
	public static void main(String[] args) {
		int ch,stop=1;
		Scanner s=new Scanner(System.in);
		getinput g=new getinput();
		SBI sbi=new SBI();
		BOB bob=new BOB();
		YES yes=new YES();
		while(stop==1)
		{
		System.out.println("**********MANU**********");
		System.out.println("1 : SBI BANK Interestrate");
		System.out.println("2 : BOB BANK Interestrate");
		System.out.println("3 : YES BANK Interestrate");
		System.out.println("4 : EXIT");
		System.out.println("***************************");
		System.out.println();
		System.out.println("Enter Your Option");
		ch=s.nextInt();
		if(ch==1)
		{
			g.get();
			sbi.interestrate(g.amount,g.rate,g.perioud);//Call Abstract Method
		}
		else if(ch==2)
		{
			g.get();
			bob.interestrate(g.amount,g.rate,g.perioud);//Call Abstract Method
		}
		else if(ch==3)
		{
			g.get();
			yes.interestrate(g.amount,g.rate,g.perioud);//Call Abstract Method
		}
		else if(ch==4)	
		{
			System.out.println();
			System.out.println("THANK YOU ....");
			stop=0;
		}
		else
		{
			System.out.println("Enter Right Choice!!!!!");
			System.out.println();
		}
		}
	}
}
