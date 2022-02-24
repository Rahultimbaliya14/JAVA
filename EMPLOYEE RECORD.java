//CREATED BY RAHUL TIMBALIYA 
import java.util.*;
class Employee {//class employee
	int eid;
	String ename;
	String department;
}
class Salary extends Employee//class Salary
{
	int salary;
	int noofleves;
	void getin(int id,String name,String dept,int sal,int levse )//Store The dat
	{
		eid=id;
		ename=name;
		department=dept;
		salary=sal;
		noofleves=levse;
	}
}
class Emp_Salary extends Salary//class Emp_Salary
{
	
	void display()//For Display Data
	{
		System.out.println("************************");
	    System.out.println("Employee Information");
	    System.out.println("************************");
	    System.out.println("Employee ID = "+eid);
	    System.out.println("Employee NAME = "+ename);
         System.out.println("Employee DEPARTMENT = "+department);
         System.out.println("************************");
         System.out.println("SALARY INFORMATION");
         System.out.println("************************");
         System.out.println("Employee ID = "+eid);
         System.out.println("Employee SALARY = "+salary);
         System.out.println("Employee No Of LEVES = "+noofleves);
         System.out.println();
         
		}
}
public class EMPLOYEE RECORD//class for main function
{
public static void main(String[] args) {
        int id,salary,leves,n,no=1,re=0;
        String name,department;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter How Many Employee");
        n=s.nextInt();
        Emp_Salary []emp_salary=new Emp_Salary[n+1];
        for(int i=1;i<=n;i++)
        {
        	System.out.println("************************");
        	System.out.println("Enter Employee "+i+"Information");
        	System.out.println("************************");
        	System.out.println("Enter Employee Id");
        	id=s.nextInt();
        	System.out.println("Enter Employee Name");
        	name=s.next();
        	System.out.println("Enter Employee Department");
        	department=s.next();
        	System.out.println("Enter Employee Salary");
        	salary=s.nextInt();
        	System.out.println("Enter Employee No Of Leves");
        	leves=s.nextInt();
        	emp_salary[i]=new Emp_Salary();
        	emp_salary[i].getin(id,name,department,salary,leves);
        	System.out.println();
        }
        while(no!=0)
        {
       System.out.println("Enter Id To Show Employee Data And 0 To Exit");
       no=s.nextInt();
       System.out.println();
       if(no !=0)
       {
       for(int i=1;i<=n;i++)
       {
       	if(no==emp_salary[i].eid)
       	{
       		re=i;
       		emp_salary[re].display();
       	}
       }
	}
	 if(re==0)
	{
		System.out.println("No Find Any Employee With Employee Id "+no);
	}
        }
}
}
