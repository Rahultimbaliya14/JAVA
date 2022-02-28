import java.util.*;
interface Operation
{
	abstract void Withdraw(double amount);
	abstract void Deposit(double amount);
}
class SBI implements Operation
{
	double balance=500;
	public void Withdraw(double amount)
	{
		System.out.println();
		System.out.println("***********************************");
		if(amount>balance)
		{
			System.out.println();
			System.out.println("!!!!!!!!!!!!WARNING!!!!!!!!!!!!!!");
			System.out.println();
			System.out.println();
			System.out.println("***********************************");
			System.out.println("Your Balance Is ₹ "+balance+" To Not Withdraw  ₹ "+amount);
		} 
		else
		{
			balance=balance-amount;
			System.out.println("Your Transaction Is Succesfully Complated");
			System.out.println("₹ "+amount+" Withdraw Is Complated");
			System.out.println("Current Balance Is = ₹ "+balance);
		}
		System.out.println("***********************************");
	}
	public void Deposit(double amount)
	{
		System.out.println();
		System.out.println("***********************************");
		balance+=amount;
		System.out.println("Your Transaction Is Succefully Compalated");
		System.out.println("₹ "+amount+" Deposit Is Complated");
		System.out.println("Current  Balance : ₹ "+balance);
		System.out.println("***********************************");
	}
	void Display()
	{
		System.out.println();
		System.out.println("*************************");
		System.out.println("CURRENT BALANCE IS = ₹ "+balance);
		System.out.println("*************************");
	}
}
class HDFC implements Operation
{
	Scanner s=new Scanner(System.in);
	double balance=500;
	public void Withdraw(double amount)
	{
		System.out.println();
		System.out.println("***********************************");
		if(amount>balance)
		{
			System.out.println();
			System.out.println("!!!!!!!!!!!!WARNING!!!!!!!!!!!!!!");
			System.out.println();
			System.out.println();
			System.out.println("***********************************");
			System.out.println("Your Balance Is ₹ "+balance+" To Not Withdraw ₹ "+amount);
		}
		else
		{
			balance=balance-amount;
			System.out.println("Your Transaction Is Succesfully Complated");
			System.out.println("₹ "+amount+"Withdraw Is Complated");
			System.out.println("Current Balance Is = ₹ "+balance);
		}
		System.out.println("***********************************");
	}
	public void Deposit(double amount)
	{
		System.out.println();
		System.out.println("***********************************");
		balance+=amount;
		System.out.println("Your Transaction Is Succefully Compalated");
		System.out.println("₹ "+amount+"Deposit Is Complated");
		System.out.println("Current  Balance : ₹ "+balance);
		System.out.println("***********************************");
	}
	void Display()
	{
		System.out.println();
		System.out.println("*************************");
		System.out.println("CURRENT BALANCE IS = ₹ "+balance);
		System.out.println("*************************");
	}
}
public class BANK{
	
	public static  double withdraw()
	{
		Scanner s=new Scanner(System.in);
		double amount;
		System.out.println();
		System.out.println("*************************");
		System.out.println("Enter Withdraw Amount");
		System.out.println("*************************");
		amount=s.nextDouble();
		return amount;
	}
	public static double diposit()
	{
		Scanner s=new Scanner(System.in);
		double amount;
		System.out.println();
		System.out.println("*************************");
		System.out.println("Enter Deposit Amount");
		System.out.println("*************************");
		amount=s.nextDouble();
		return amount;
	}
	public static int submanu()
	{
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println();
		System.out.println("**********OPERATION**********");
		System.out.println("1 : Withdraw");
		System.out.println("2 : Deposit");
		System.out.println("3 : Display");
		System.out.println("4 : BACK");
		System.out.println("*****************************");
		System.out.println();
		System.out.println("Enter Your Operation");
		a=s.nextInt();
		return a;
	}
	public static void main(String[] args) {
		int sbi,hdfc,ch=1,co=1,user=0;
		double amount;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  Number Of SBI User ");
		sbi=s.nextInt();
		System.out.println();
		System.out.println("Enter Number Of HDFC User");
		hdfc=s.nextInt();
		SBI []sb=new SBI[sbi+1];
		HDFC []hd=new HDFC[hdfc+1];
		for(int i=1;i<=sbi;i++)
		{
			sb[i]=new SBI();
		}
			for(int i=1;i<=hdfc;i++)
		{
			hd[i]=new HDFC();
		}
		while(ch!=0)
		{
		    System.out.println();
			System.out.println("***********MANU**********");
			System.out.println("1 : SBI");
			System.out.println("2 : HDFC");
			System.out.println("**************************");
			System.out.println();
			System.out.println("Enter Your Option And 0 To Exit");            ch=s.nextInt();
			if(ch!=0)
			{
				System.out.println();
			System.out.println("Enter User Number");
			user=s.nextInt();
			}
			if(ch!=0)
			{
				co=1;
			while(co!=0)
			{
			if(ch==1)
			{  
			    if(user>sbi)
			    {
			    	System.out.println();
			    	System.out.println("User Is Not Present");
			    	co=0;
			    }
			    else
			    {
				co=submanu();
				if(co==1)
				{
					amount=withdraw();
					sb[user].Withdraw(amount);
				}
				else if(co==2)
				{
					amount=diposit();
					sb[user].Deposit(amount);
				}
				else if(co==3)
				{
					sb[user].Display();
				}
				else if(co==4)
				{
					co=0;
				}
				else 
				{
					System.out.println();
					System.out.println(" Enter Right Operation");
				}
			    }
			}
			if(ch==2)
			{
			    if(user>hdfc)
			    {
			    	System.out.println();
			    	System.out.println("User Is Not Present");
			    	co=0;
			    }
			    else
			    {
				co=submanu();
				if(co==1)
				{
					amount=withdraw();
					hd[user].Withdraw(amount);
				}
				else if(co==2)
				{
					amount=diposit();
					hd[user].Deposit(amount);
				}
				else if(co==3)
				{
					hd[user].Display();
				}
				else if(co==4)
				{
					co=0;
				}
				else 
				{
					System.out.println();
					System.out.println(" Enter Right Operation");
				}
			    }
			}
			if(ch!=0&&ch==1&&ch==2)
			{
				System.out.println();
				System.out.println("Enter Right Option");
			}
			}
			}
			else 
			{
				System.out.println();
				System.out.println("THANK YOU !!!");
			}
			
		}
	}
}