
import java.util.*;
import java.io.*;
class Monitor
{
	String company;
	String type;
	int resolution;
	
	void getval()
	{
		System.out.print("Enter the Company of Monitor :");
		//BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		company=sc.next();
		System.out.print("Enter the type of monitor :");
		type=sc.next();
		System.out.print("Enter the resolution :");
		resolution=sc.nextInt();
	}
	public static void main(String ar[])
	{
		Monitor m1=new Monitor();
		m1.getval();
		Monitor m2=new Monitor();
		m2.getval();
		if(m1.resolution>m2.resolution)
		{
			System.out.println("\n\tThe better Monitor would be:");
			System.out.println("\nCompany :"+m1.company+"\ntype :"+m1.type+"\nresloution :"+m1.resolution);
		}
		else
		{
			 
			System.out.println("\n\tThe better Monitor would be:");
			System.out.println("\nCompany :"+m2.company+"\ntype :"+m2.type+"\nresloution :"+m2.resolution);
		}
	}
		
}
		