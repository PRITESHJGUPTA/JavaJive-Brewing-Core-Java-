import java.io.*;
import java.util.*;
class Employee
{
	
	String e_name;
	int hours;
	int days;
	float sal;
	void get()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the name of the Employee ::");
		e_name=sc.next();
	}
	void print()
	{
		System.out.println("The Name of the Employee is ::"+e_name);
	}
}
class Temp extends Employee
{
	Temp()
	{  
		get();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number of hours of work ::");
		hours=sc.nextInt();
	}
	void print()
	{
		super.print();
		System.out.println("The Salary based on "+hours+" is :: "+hours*(int)100);
	}
}
class Perm extends Employee
{
	Perm()
	{  
		get();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number of days of work ::");
		days=sc.nextInt();
	}
	void print()
	{
		super.print();
		System.out.println("The Salary based on "+days+" is :: "+days*(int)1500);
	}
}
class Office
{
	public static void main(String ar[])
	{
		System.out.println("Enter the type of employee\n1.Permanent\n2.Temporary");
		int ch;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your choice ::");
		ch=sc.nextInt();
		if(ch == 1)
		{
			Perm p1=new Perm();
			p1.print();
		}
		else
		{
			Temp t1= new Temp();
			t1.print();
		}
	}
}

		
			
		