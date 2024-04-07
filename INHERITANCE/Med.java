import java.io.*;
import java.util.*;
class Medicine
{
	String c_name;
	void get_Name()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Company name of Medicine ::");
		c_name=sc.next();
	}
}
class Dealer extends Medicine
{
	String p_name;
	float price;
	void get_Details()
	{
		
		get_Name();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Product Name ::");
		p_name=sc.next();
		System.out.print("Enter the base price ::");
		price=sc.nextFloat();
	}
}
class Retailer extends Dealer
{
	
		float s_price;
		void print_Det()
		{
			get_Details();
			s_price=price+(float)0.015*price;
			System.out.println("The Sale Price of the Medicine is :: "+s_price);
		}	
}

class Med
{
	public static void main(String ar[])
	{
		Retailer r1 = new Retailer();
		r1.print_Det();
	}
}
		