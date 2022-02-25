import java.util.Scanner;
class customer
{
	int Ticketisbook;
	public customer()
	{
	}
	void Display()
	{
		System.out.println();
		System.out.println("******************************");
		if(Ticketisbook==1)
		{
			System.out.println("Ticket Is Booked");
		}
		else
		{
			System.out.println("Ticket Is Not Booked");
		}
		System.out.println("******************************");
	}
	
}
class ticket_book extends customer
{
	void book_ticket()
	{
		System.out.println();
		System.out.println("******************************");
		if(Ticketisbook==1)
		{
			System.out.println("Ticket Is Already Booked");
		}
		else
		{
			System.out.println("TICKET IS SUCCESFULLY BOOK");
			Ticketisbook=1;
		}
		System.out.println("******************************");
    }
}
class ticket_cancel extends ticket_book
{
	void cancel_ticket()
	{
		System.out.println();
		System.out.println("******************************");
		if(Ticketisbook==0)
		{
			System.out.println("Ticket Is Not Book Is To Not Cancel The Booking");
		}
		else
		{
			System.out.println("TICKET IS SUCCESFULLY CANCEL");
			Ticketisbook=0;
		}
	System.out.println("******************************");
	}
}
public class RailwayBook{
	public static void main(String[] args) {
		int n,ch=1,co=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter How Many  Customer");
		n=s.nextInt();
		ticket_cancel []t=new ticket_cancel[n+1];
		for(int i=0;i<=n;i++)
		{
			t[i]=new ticket_cancel();
		}
		while(ch!=0)
		{
			System.out.println();
			System.out.println("Enter The Number Of Customer And 0  To Exit ");            
			ch=s.nextInt();
			if(ch!=0&&ch<=n)
			{
				co=1;
			while(co!=0)
			{ 
			     System.out.println();
			     System.out.println("IT'S USER "+ch+" ");
			     System.out.println();
		      	System.out.println("********MANU**********");                         System.out.println("1 : BOOK TICKET" );
		      	System.out.println("2 : CANCEL TICKET");
		      	System.out.println("3 : DISPLAY");
		      	System.out.println("4 : EXIT ");
		      	System.out.println("Enter Your Choice ");
		      	co=s.nextInt();
		      	if(co==1)
		      	{
		      		t[ch].book_ticket();
		      	}
		      	else if(co==2)
		      	{
		      		t[ch].cancel_ticket();
		      	}
		      	else if(co==3)
		      	{
		      		t[ch].Display();
		      	}
		      	else if(co==4)
		      	{
		      		co=0;
		      	}
		      	else
		      	{
		      		System.out.println();
		      		System.out.println("Enter Right Choice !!!!!");
		      	}
		      	
			}
			}
			else
			{
				if(ch>n)
				{
					System.out.println();
					System.out.println("Customer is Not Present !!!! ");
				}
				else 
				{
				System.out.println();
				System.out.println("THANKS FOR USING THIS PROGRAM !!!");
				}
			}
		}
	       	
	}
}